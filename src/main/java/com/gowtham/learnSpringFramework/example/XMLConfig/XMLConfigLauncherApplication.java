package com.gowtham.learnSpringFramework.example.XMLConfig;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;


public class XMLConfigLauncherApplication {
    public static void main(String[] args) {
         try(var context=new ClassPathXmlApplicationContext("contextConfiguration.xml")){
             Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
             System.out.println(context.getBean("name"));
         }catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
}
