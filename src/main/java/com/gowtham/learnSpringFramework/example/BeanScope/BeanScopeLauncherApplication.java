package com.gowtham.learnSpringFramework.example.BeanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{

}

@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{


}

@Configuration
@ComponentScan
public class BeanScopeLauncherApplication {
    public static void main(String[] args) {
        try(var context=new AnnotationConfigApplicationContext(BeanScopeLauncherApplication.class)){
//            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
