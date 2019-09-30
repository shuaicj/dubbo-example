package shuaicj.example.dubbo.consumer;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring boot entry.
 *
 * @author shuaicj 2018/03/05
 */
@SpringBootApplication
@EnableDubbo
@EnableScheduling
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
