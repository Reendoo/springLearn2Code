package sk.peterrendek.springLearn2Code.testingprofiles.services.impl;

import sk.peterrendek.springLearn2Code.testingprofiles.services.HelloWorldService;

public class HelloWorldServiceImplFactory {

    public HelloWorldService createHelloWorldService(String language){
        return switch (language) {
            case "eng" -> new EnglishHelloWordImpl();
            case "engPr" -> new EnglishPrimaryHelloWordImpl();
            case "cze" -> new CzechHelloWorldImpl();
            case "SVK" -> new SlovakHelloWorldImpl();
            default -> new PrimaryHelloWorld();
        };
    }
}
