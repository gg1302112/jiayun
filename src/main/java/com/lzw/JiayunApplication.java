package com.lzw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.lzw.mapper")
public class JiayunApplication {

    public static void main(String[] args) {
        SpringApplication.run(JiayunApplication.class, args);
    }

}