package com.practice.SpringBootProject;


import java.util.ArrayList;
import java.util.List;

public class ClassA {

    List<String> customerList = new ArrayList<>();

    public List<String> getCustomerList() {
        customerList.add("Jay");
        customerList.add("Rohit");
        customerList.add("Arti");
        customerList.add("Forum");
        return customerList;
    }

    public String helloWorld(){
        return "Hello User!";
    }


}
