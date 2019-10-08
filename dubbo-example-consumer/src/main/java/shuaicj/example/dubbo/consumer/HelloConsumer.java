package shuaicj.example.dubbo.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import shuaicj.example.dubbo.common.HelloService;

/**
 * The consumer.
 *
 * @author shuaicj 2019/09/29
 */
@Component
public class HelloConsumer {

    private static final Logger logger = LoggerFactory.getLogger(HelloConsumer.class);

    @Reference(version = "${helloService.version}")
    private HelloService helloService;

    @Scheduled(fixedDelay = 1000)
    public void run() {
        logger.info("call HelloService: {}", helloService.hello("shuaicj"));
    }
}
