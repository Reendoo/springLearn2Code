package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;

@Service
@Primary
@Profile({"eng","SVK","default"})

public class EnglishPrimaryHelloWordImpl implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("Primary Hellou world !");
    }
}
