package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;
@Service
public class CzechHelloWorldImpl implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("Cas picoooo !");
    }
}
