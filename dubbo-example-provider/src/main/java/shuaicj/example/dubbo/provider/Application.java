package shuaicj.example.dubbo.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring boot entry.
 *
 * @author shuaicj 2018/03/05
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "shuaicj.example.dubbo.provider.service")
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
