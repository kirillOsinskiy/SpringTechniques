package com.osk.music;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MusicPlayer {

//    private Music music;

    private List<Music> musicList = new ArrayList<>();

    private String name;

    private int volume;

    public void playMusicList() {
        musicList.forEach(this::playMusic);
    }

    private void playMusic(Music music) {
        System.out.println("♪ Next song would be " + music.getSong());
        music.play();
        System.out.println();
    }
}
