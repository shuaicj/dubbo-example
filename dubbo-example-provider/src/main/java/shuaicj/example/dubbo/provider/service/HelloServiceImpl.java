package shuaicj.example.dubbo.provider.service;

import java.util.concurrent.atomic.AtomicLong;

import org.apache.dubbo.config.annotation.Service;
import shuaicj.example.dubbo.common.Hello;
import shuaicj.example.dubbo.common.HelloService;

/**
 * Implementation of HelloService.
 *
 * @author shuaicj 2018/03/05
 */
@Service(interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService {

    private static final AtomicLong counter = new AtomicLong();

    @Override
    public Hello hello(String name) {
        return new Hello(counter.getAndIncrement(), "Hello " + name + "!");
    }
}
