package com.example.demoSpring1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoSpring1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpring1Application.class, args);
    }


    @Bean
    public String address1() {
        return "Green Street, 102";
    }

    @Bean
    public String address2() {
        return "Apple Street, 15";
    }

    public Customer customer(@Qualifier String address) {
        return new Customer("Clara Foster", address);
    }

    @Bean
    public Customer temporary(@Autowired Customer customer) {
        System.out.println(customer);
        return customer;
    }

}
