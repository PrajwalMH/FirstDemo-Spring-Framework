package com.prajwal.FirstDemoSpringFramework.game;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class GameRunner {

    @Autowired
    @Qualifier("SuperContra")
    private GamingConsole game;


//    public GameRunner(GamingConsole game) {
//        this.game=game;
//    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
