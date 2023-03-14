package sk.peterrendek.springLearn2Code.services.impl;

import sk.peterrendek.springLearn2Code.services.HelloWorldService;

public class HelloWorldServiceImplFactory {

    public HelloWorldService createHelloWorldService(String language){
        switch (language){
            case "eng": return new EnglishHelloWordImpl();
            case "engPr": return new EnglishPrimaryHelloWordImpl();
            case "cze": return new CzechHelloWorldImpl();
            case "svk": return new SlovakHelloWorldImpl();
            default: return new PrimaryHelloWorld();
        }
    }
}
