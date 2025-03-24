package com.gowtham.learnSpringFramework.HelloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


record Person(String name,int age){};
record Address(String firstLine,String city){};

@Configuration
public class HelloWorldConfiguration {

    @Bean
    @Primary
    public Person person(){
        var person =new Person("ravi",20);
        return  person;
    }


    @Bean
    public String name(){
       return  "Gowtham";
    }

    @Bean
    public int age(){
        return  20;
    }

    @Bean(name="address2")
    public Address address(){
        return new Address("Bakers street","London");
    }


    @Bean
    public Person person2(){
        return new Person(name(),age());
    }

    @Bean
    public Person person3(String name,int age){
        return new Person(name,age);
    }


}
