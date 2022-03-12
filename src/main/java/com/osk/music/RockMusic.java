package com.osk.music;

public class RockMusic implements Music {

    private RockMusic() {}

    @Override
    public void play() {
        System.out.println("♪ Playing Nirvana ♪");
    }

    @Override
    public String getSong() {
        return "Smells Like teen Spirit";
    }

    public static RockMusic getRockMusic() {
        return new RockMusic();
    }
}
