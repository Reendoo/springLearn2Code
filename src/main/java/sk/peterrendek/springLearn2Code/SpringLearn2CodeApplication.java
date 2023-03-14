package sk.peterrendek.springLearn2Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringLearn2CodeApplication {

	public static void main(String[] args) {

		//injekcia cez kontruktor
//		ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
//		AppRun appRun = context.getBean(AppRun.class);
//		appRun.run();

	// setter alebo autowire
		SpringApplication.run(SpringLearn2CodeApplication.class, args);
	}

}
