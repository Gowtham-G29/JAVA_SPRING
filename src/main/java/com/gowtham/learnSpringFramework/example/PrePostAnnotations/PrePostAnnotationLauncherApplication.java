package com.gowtham.learnSpringFramework.example.PrePostAnnotations;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class SomeClass{
    private SomeDependency someDependency;

    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency=someDependency;
        System.out.println("All the dependencies are ready !");
    }

    @PostConstruct
    public void initialize(){
        someDependency.getReady();
    }

    @PreDestroy
    public void CleanUp(){
        System.out.println("CleanUp");
    }

}

@Component
class SomeDependency{
    public void getReady(){
        System.out.println("successfully ready");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationLauncherApplication {
    public static void main(String[] args) {
        try(var context=new AnnotationConfigApplicationContext(PrePostAnnotationLauncherApplication.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
