package com.itheima;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.itheima", "dao"})
public class SpringbootPostmanApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootPostmanApplication.class, args);
    }

}
