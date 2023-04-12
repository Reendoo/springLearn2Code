package sk.peterrendek.springLearn2Code.testingprofiles.services.impl;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.testingprofiles.services.HelloWorldService;

@Service
@Profile("ENG")
public class EnglishHelloWordImpl implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("EnglishHelloWordImpl");
    }
}
