package shuaicj.example.dubbo.consumer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description.
 *
 * @author shuaicj 2019/09/29
 */
@RestController
public class AnyController {

    @GetMapping("/hello")
    public String hello() {
        return "abc";
    }
}
