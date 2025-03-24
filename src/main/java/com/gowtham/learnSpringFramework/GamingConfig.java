package com.gowtham.learnSpringFramework;

import com.gowtham.learnSpringFramework.game.GameRunner;
import com.gowtham.learnSpringFramework.game.GamingConsole;
import com.gowtham.learnSpringFramework.game.PacMan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {
    @Bean
    public GamingConsole game(){
        var game=new PacMan();
        return  game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var gameRunner =new GameRunner(game);
        return gameRunner;

    }

}
