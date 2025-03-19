package com.gowtham.learnSpringFramework;

import com.gowtham.learnSpringFramework.game.GameRunner;
import com.gowtham.learnSpringFramework.game.PacMan;

public class AppGamingBasic {

    public static void main(String[] args) {
//        var game=new MarioGame();

//        var game=new SuperContra();
        var game=new PacMan();
        var gameRunner=new GameRunner(game);

        gameRunner.run();
    }



}
