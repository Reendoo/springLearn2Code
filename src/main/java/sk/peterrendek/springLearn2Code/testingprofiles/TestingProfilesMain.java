package sk.peterrendek.springLearn2Code.testingprofiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sk.peterrendek.springLearn2Code.testingprofiles.services.HelloWorldService;

@SpringBootApplication
public class TestingProfilesMain {
    public static void main(String[] args) {
        // application.properties, application-svk.properties
        ConfigurableApplicationContext context = SpringApplication.run(TestingProfilesMain.class, args);
		context.getBean(HelloWorldService.class).sayHallo();
    }
}
