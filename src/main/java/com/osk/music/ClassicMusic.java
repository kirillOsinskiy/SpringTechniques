package com.osk.music;

public class ClassicMusic implements Music {
    @Override
    public void play() {
        System.out.println("♪ Playing Mozart ♪");
    }

    @Override
    public String getSong() {
        return "Music of Angels";
    }

    private void doMyInit() {
        System.out.println("Init method");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method");
    }
}
