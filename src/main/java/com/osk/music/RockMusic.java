package com.osk.music;

import java.util.List;

public class RockMusic implements Music {

    private final List<String> songs = List.of("Smells Like teen Spirit", "Master of puppets", "Neverwinter nights");

    public RockMusic() {}

    @Override
    public void play() {
        System.out.println("♫ ♬ ♪ Playing Nirvana ♫ ♩ ♬");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }
}
