package com.osk;

import com.osk.music.ClassicMusic;
import com.osk.music.MusicPlayer;
import com.osk.music.RockMusic;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        System.out.println(classicMusic.getSong());

//        MusicPlayer player = context.getBean(MusicPlayer.class);

//        player.playMusicList();

//        System.out.println(player.getName());
//        System.out.println(player.getVolume());
//
//        MusicPlayer player2 = context.getBean(MusicPlayer.class);
//
//        System.out.println(player == player2);
//        System.out.println(player);
//        System.out.println(player2);
//
//        System.out.println(player2.getVolume());
//        player.setVolume(111);
//        System.out.println(player2.getVolume());
//
//        DIBean diBean1 = context.getBean(DIBean.class);
//        DIBean diBean2 = context.getBean(DIBean.class);
//
//        System.out.println(diBean1);
//        System.out.println(diBean2);
//        System.out.println(diBean1 == diBean2);
//        System.out.println(diBean1.getTestBean());
//        System.out.println(diBean2.getTestBean());
//        System.out.println(diBean1.getTestBean() == diBean2.getTestBean());

        RockMusic rm1 = context.getBean(RockMusic.class);
        RockMusic rm2 = context.getBean(RockMusic.class);

        System.out.println(rm1 == rm2);

        context.close();
    }
}
