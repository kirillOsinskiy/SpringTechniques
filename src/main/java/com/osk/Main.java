package com.osk;

import com.osk.music.Computer;
import com.osk.music.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

//        System.out.println(classicMusic.getSong());

//        Music classic = context.getBean("someRock", Music.class);
//        Music music = context.getBean("classic", Music.class);

        Computer computer1 = context.getBean(Computer.class);
//        Computer computer2 = context.getBean(Computer.class);

        System.out.println(computer1);

        context.close();
    }
}
