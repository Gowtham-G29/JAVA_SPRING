package com.gowtham.learnSpringFramework.HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
       //1. Launch a Spring Context
        //2.  Configure the things that we want Spring to manage. -->using @configuration class

        try(var context=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            System.out.println( context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));

            System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean("person2"));

            Arrays.stream(context.getBeanDefinitionNames()).forEach((System.out::println));
        }catch (Exception e){
            System.out.println(e.getMessage());

        }


    }
}
