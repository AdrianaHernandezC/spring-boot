package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * 启动类
 *
 * @author guodahai
 */
@SpringBootApplication
@EnableAsync
public class HotchpotchApplication {

    public static void main(String[] args) {
        SpringApplication.run(HotchpotchApplication.class, args);
    }
}
