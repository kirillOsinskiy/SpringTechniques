package com.osk.music;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("someRock")
public class RockMusic implements Music {

    private final List<String> songs = List.of("Smells Like teen Spirit", "Master of puppets", "Neverwinter nights");

    private RockMusic() {}

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
