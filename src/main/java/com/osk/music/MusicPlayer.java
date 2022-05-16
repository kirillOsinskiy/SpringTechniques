package com.osk.music;

import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    //    @Autowired
//    @Qualifier("classic")
//    private Music classicalMusic;

    //    @Autowired
//    @Qualifier("someRock")
//    private Music rockMusic;

    private List<Music> musicList;

    private static final Random random = new Random();

    @PostConstruct
    public void doMyInit() {
        System.out.println("Initialization ...");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Destroying bean ...");
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

//    public MusicPlayer(@Qualifier("classic") Music classicalMusic,
//                       @Qualifier("someRock") Music rockMusic) {
//        this.classicalMusic = classicalMusic;
//        this.rockMusic = rockMusic;
//    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String playMusic() {
        return musicList.get(random.nextInt(3)).getSong().get(random.nextInt(3));
    }

//    public String playMusic(MusicStyle style) {
//        switch (style) {
//            case ROCK -> {
//                return rockMusic.getSong().get(random.nextInt(3));
//            }
//            case CLASSICAL -> {
//                return classicalMusic.getSong().get(random.nextInt(3));
//            }
//            default -> throw new IllegalArgumentException("Music style is incorrect!");
//        }
//    }
}
