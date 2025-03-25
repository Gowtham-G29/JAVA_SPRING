package com.gowtham.learnSpringFramework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperContraQualifier")
public class SuperContra implements GamingConsole {
    public void up(){
        System.out.println("up");
    }

    public void down(){
        System.out.println("sit down");
    }

    public void left(){
        System.out.println("forward");
    }

    public void right(){
        System.out.println("back");
    }
}
