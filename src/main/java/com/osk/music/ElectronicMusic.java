package com.osk.music;

public class ElectronicMusic implements Music {
    @Override
    public void play() {
        System.out.println("♫ Playing electronic music ♫ ♩ ♬ ♪");
    }

    @Override
    public String getSong() {
        return "Baby's got a temper";
    }
}
