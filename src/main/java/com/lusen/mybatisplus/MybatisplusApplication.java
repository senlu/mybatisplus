package com.lusen.mybatisplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = DruidDataSourceAutoConfigure.class)
public class MybatisplusApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MybatisplusApplication.class, args);
    }

}
