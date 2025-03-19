package com.gowtham.learnSpringFramework.game;

public class MarioGame implements GamingConsole {
   public void up(){
       System.out.println("Jump");
   }

   public void down(){
       System.out.println("Go to the hole");
   }

   public void left(){
       System.out.println("Go back");
   }

   public void right(){
       System.out.println("Go forward");
   }
}
