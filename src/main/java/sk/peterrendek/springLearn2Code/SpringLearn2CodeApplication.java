package sk.peterrendek.springLearn2Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sk.peterrendek.springLearn2Code.repositories.impl.MovieServiceImpl;

@SpringBootApplication
public class SpringLearn2CodeApplication {

	public static void main(String[] args) {

//		ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
//		AppRun appRun = context.getBean(AppRun.class);
//		appRun.run();


		SpringApplication.run(SpringLearn2CodeApplication.class, args);
	}

}
