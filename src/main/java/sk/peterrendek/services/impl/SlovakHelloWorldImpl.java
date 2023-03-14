package sk.peterrendek.services.impl;

import org.springframework.stereotype.Service;
import sk.peterrendek.services.HelloWorldService;

@Service
public class SlovakHelloWorldImpl implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("Ahoj svet!");
    }
}
