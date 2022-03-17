package com.osk.music;

import org.springframework.stereotype.Component;

import java.util.List;

@Component("electro")
public class ElectronicMusic implements Music {
    @Override
    public void play() {
        System.out.println("♫ Playing electronic music ♫ ♩ ♬ ♪");
    }

    @Override
    public List<String> getSong() {
        return List.of("Baby's got a temper", "Minotaur", "night");
    }
}
