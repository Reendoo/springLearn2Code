package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;

@Service
@Profile("eng")
public class EnglishHelloWordImpl implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("Hellou world !");
    }
}
