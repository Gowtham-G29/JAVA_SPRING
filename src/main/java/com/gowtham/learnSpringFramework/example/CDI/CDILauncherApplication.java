package com.gowtham.learnSpringFramework.example.CDI;

import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Named//@Component
class BusinessService{
    private DataService dataService;

  @Inject//    @Autowired
    public void setDataService(DataService dataService) {
        this.dataService = dataService;
    }

    public DataService getDataService() {
        System.out.println("setter Injection");
        return dataService;
    }
}

@Named//@Component
class DataService{

}

@Configuration
@ComponentScan
public class CDILauncherApplication {
    public static void main(String[] args) {
        try(var context=new AnnotationConfigApplicationContext(CDILauncherApplication.class)){
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
