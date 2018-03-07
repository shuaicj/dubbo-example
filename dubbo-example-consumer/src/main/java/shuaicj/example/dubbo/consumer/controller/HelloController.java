package shuaicj.example.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import shuaicj.example.dubbo.common.HelloService;

/**
 * Simple controller.
 *
 * @author shuaicj 2018/03/05
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello(@RequestParam String name) {
        return helloService.hello(name);
    }
}
