package com.osk;

import com.osk.music.Computer;
import com.osk.music.MusicStyle;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);

//        System.out.println(classicMusic.getSong());

//        Music classic = context.getBean("someRock", Music.class);
//        Music music = context.getBean("classic", Music.class);

        Computer computer1 = context.getBean(Computer.class);
        Computer computer2 = context.getBean(Computer.class);

        System.out.println(computer1 == computer2);
        System.out.println(computer1.getMusicPlayer() == computer2.getMusicPlayer());

        System.out.println(computer1.getMusicPlayer().getName());
        System.out.println(computer1.getMusicPlayer().getVolume());

        System.out.println(computer1.getMusicPlayer().playMusic());

        context.close();
    }
}
