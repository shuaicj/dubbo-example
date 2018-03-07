package shuaicj.example.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import shuaicj.example.dubbo.common.HelloService;

/**
 * Implementation of HelloService.
 *
 * @author shuaicj 2018/03/05
 */
@Service(interfaceClass = HelloService.class)
@Component
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello " + name + "!\n";
    }
}
