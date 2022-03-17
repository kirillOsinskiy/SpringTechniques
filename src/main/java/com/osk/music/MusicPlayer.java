package com.osk.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {

//    @Autowired
//    @Qualifier("classic")
    private Music classicalMusic;

//    @Autowired
//    @Qualifier("someRock")
    private Music rockMusic;

    private final Random random = new Random();

        @Autowired
    public MusicPlayer(@Qualifier("classic") Music classicalMusic,
                       @Qualifier("someRock") Music rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic(MusicStyle style) {
        switch (style) {
            case ROCK -> {
                return rockMusic.getSong().get(random.nextInt(3));
            }
            case CLASSICAL -> {
                return classicalMusic.getSong().get(random.nextInt(3));
            }
            default -> throw new IllegalArgumentException("Music style is incorrect!");
        }
    }
}
