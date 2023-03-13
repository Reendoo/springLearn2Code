package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;
@Service
@Primary
public class PrimaryHelloWorld implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("ten najviac popici jak hovado Hello world!");
    }
}
