package com.ayang818.honor.datacollection;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.ayang818.honor.datacollection.mapper")
@SpringBootApplication
public class DataCollectionApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataCollectionApplication.class, args);
    }

}


