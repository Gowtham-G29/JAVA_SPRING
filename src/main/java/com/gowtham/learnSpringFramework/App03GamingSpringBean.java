package com.gowtham.learnSpringFramework;

import com.gowtham.learnSpringFramework.game.GameRunner;
import com.gowtham.learnSpringFramework.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBean {

    public static void main(String[] args) {
        try(var context=  new AnnotationConfigApplicationContext(GamingConfig.class)){
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();

        }catch (Exception e){
           System.out.println(e.getMessage());
        }
    }



}
