package com.prajwal.FirstDemoSpringFramework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PackmanGame")
public class PackmanGame implements GamingConsole{

    public void up(){
        System.out.println("Packman jump");
    }

    public void down(){
        System.out.println("Packman down into a whole");
    }

    public void left(){
        System.out.println("Packman stop");
    }

    public void right(){
        System.out.println("Packman accelerate");
    }
}
