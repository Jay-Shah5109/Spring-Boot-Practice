package com.practice.SpringBootProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Service
public class ClassB {

    @Autowired
    ClassA classA;

    @GetMapping("/printA")
    public String printObjectA(){
        System.out.println("You have called printObjectA method");
        System.out.println("Adress of object A first time: "+classA);
        System.out.println("Adress of object A second time: "+classA);
        return classA.helloWorld();
    }

    @GetMapping("/getCustomers")
    public List<String> getCustomers(){
        return classA.getCustomerList();
    }

}
