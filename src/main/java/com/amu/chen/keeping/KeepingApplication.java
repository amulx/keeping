package com.amu.chen.keeping;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.amu.chen.keeping.repository")
public class KeepingApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeepingApplication.class, args);
    }

}
