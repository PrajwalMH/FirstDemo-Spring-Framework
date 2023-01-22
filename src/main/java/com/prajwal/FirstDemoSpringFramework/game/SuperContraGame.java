package com.prajwal.FirstDemoSpringFramework.game;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContra")
public class SuperContraGame implements GamingConsole {

    public void up(){
        System.out.println("SuperContra jump");
    }

    public void down(){
        System.out.println("SuperContra down into a whole");
    }

    public void left(){
        System.out.println("SuperContra stop");
    }

    public void right(){
        System.out.println("SuperContra accelerate");
    }
}
