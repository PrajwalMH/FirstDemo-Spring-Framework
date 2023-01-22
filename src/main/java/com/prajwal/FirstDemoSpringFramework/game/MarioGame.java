package com.prajwal.FirstDemoSpringFramework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MarioGame")
public class MarioGame implements GamingConsole{

    public void up(){
        System.out.println("jump");
    }

    public void down(){
        System.out.println("down into a whole");
    }

    public void left(){
        System.out.println("stop");
    }

    public void right(){
        System.out.println("accelerate");
    }
}
