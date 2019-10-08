package shuaicj.example.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring boot application.
 *
 * @author shuaicj 2018/03/05
 */
@SpringBootApplication
@EnableScheduling
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
