package sk.peterrendek.springLearn2Code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;
import sk.peterrendek.springLearn2Code.services.impl.HelloWorldServiceImplFactory;

@Configuration
public class HelloWorldConfig {
    @Bean
    public HelloWorldServiceImplFactory createFactory(){
       return new HelloWorldServiceImplFactory();
    }

    @Bean
    @Profile("cze")
    public HelloWorldService czeHelloWorld(HelloWorldServiceImplFactory factory){
        return factory.createHelloWorldService("cze");
    }
    @Bean
    @Profile("eng")
    public HelloWorldService engHelloWorld(HelloWorldServiceImplFactory factory){
        return factory.createHelloWorldService("eng");
    }
    @Bean
    @Profile("engPr")
    public HelloWorldService engPrHelloWorld(HelloWorldServiceImplFactory factory){
        return factory.createHelloWorldService("engPr");
    }
    @Bean
    @Profile("svk")
    public HelloWorldService svkPrHelloWorld(HelloWorldServiceImplFactory factory){
        return factory.createHelloWorldService("svk");
    }
    @Bean
    @Profile("default")
    public HelloWorldService defaultHelloWorld(HelloWorldServiceImplFactory factory){
        return factory.createHelloWorldService("default");
    }
}
