package com.hertever.moneytracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MoneyTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MoneyTrackerApplication.class, args);
        System.out.println("hello rohit !");
    }

}
