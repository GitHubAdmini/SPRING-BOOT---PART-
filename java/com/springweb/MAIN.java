package com.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.awt.*;

@SpringBootApplication
public class MAIN {
    public static void main(String[] args) {
        SpringApplication.run(MAIN.class,args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {//arrow function or lamddas
            System.out.println("Lets inspect Beans");

            String[] beanNames = ctx.getBeanDefinitionNames();

            for(String beanName : beanNames){
                System.out.println(beanName);
            }
        };
    }

}
