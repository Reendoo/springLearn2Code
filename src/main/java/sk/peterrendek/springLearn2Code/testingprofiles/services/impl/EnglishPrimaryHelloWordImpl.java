package sk.peterrendek.springLearn2Code.testingprofiles.services.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.peterrendek.springLearn2Code.testingprofiles.services.HelloWorldService;

@Service
@Primary
@Profile({"ENG","default"})
public class EnglishPrimaryHelloWordImpl implements HelloWorldService {
    @Override
    public void sayHallo() {
        System.out.println("EnglishPrimaryHelloWordImpl >>> {\"ENG\",\"default\"} ");
    }
}
