package com.osk.music;

import org.springframework.stereotype.Component;

import java.util.List;

public class ClassicalMusic implements Music {

    private List<String> songs = List.of("Music of Angels", "Symphony #9", "Fly of Valkyrie");

    @Override
    public void play() {
        System.out.println("♫ ♩ ♪ Playing Mozart ♫ ♬ ♪");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }

    private void doMyInit() {
        System.out.println("Init method");
    }

    private void doMyDestroy() {
        System.out.println("Destroy method");
    }
}
