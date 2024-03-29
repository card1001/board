package com.fast.fastboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationPropertiesScan
@SpringBootApplication
public class FastBoardApplication {

    public static void main(String[] args) {
        SpringApplication.run(FastBoardApplication.class, args);
    }

}
