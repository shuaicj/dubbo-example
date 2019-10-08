# Spring Boot Dubbo Example

A simple demo of dubbo and spring boot.

### Get Started

1. Install and start [Zookeeper](http://zookeeper.apache.org/). If using [Homebrew](https://brew.sh/) on Mac:
```bash
brew install zookeeper
zkServer start
```
> Now a local zookeeper is running at `127.0.0.1:2181`.

2. Compile and package:
```bash
mvn clean package
```
> If your zookeeper is not running at `127.0.0.1:2181`, change the property `dubbo.registry.address`
> in `application.yml` of both provider and consumer before you call `mvn`.

3. Start provider and consumer:
```bash
java -jar *provider/target/*.jar
java -jar *consumer/target/*.jar
```

4. Verify the logging messages of the consumer, and you would see things like:
```bash
call HelloService: {"id":0,"message":"Hello shuaicj!"}
call HelloService: {"id":1,"message":"Hello shuaicj!"}
...

```

### Modules
- **dubbo-example-common** - define the common api `HelloService`
- **dubbo-example-provider** - implement `HelloService` and serve as a dubbo service provider
- **dubbo-example-consumer** - consume the dubbo service

### Reference
- https://dubbo.apache.org
- https://github.com/apache/dubbo
- https://github.com/apache/dubbo-spring-boot-project

