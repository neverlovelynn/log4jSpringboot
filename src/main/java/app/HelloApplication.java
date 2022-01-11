package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * hello Created by pingf
 *
 * @Date 2019/1/10 - 10:55 .
 */
@SpringBootApplication
@ComponentScan(value = "controller")
public class HelloApplication {
    public static void main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
    }
}