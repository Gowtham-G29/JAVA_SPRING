package com.gowtham.learnSpringFramework.example.Lazyinitialization;

import com.gowtham.learnSpringFramework.example.PrePostAnnotations.PrePostAnnotationLauncherApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA{

}

@Component
@Lazy
class ClassB{
    private ClassA classA;

    public ClassB(ClassA classA){
         System.out.println("some initialization is performed");
        this.classA=classA;
    }

    public void message(){
        System.out.println("inlitalize when only calling");
    }

}

@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
    public static void main(String[] args) {
        try(var context=new AnnotationConfigApplicationContext(PrePostAnnotationLauncherApplication.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            context.getBean(ClassB.class).message();


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
