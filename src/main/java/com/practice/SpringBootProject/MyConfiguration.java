package com.practice.SpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {

    //@Autowired
    //ClassA classA;

    @Bean
    public ClassA getClassAObject(){
        return new ClassA();
    }

}
