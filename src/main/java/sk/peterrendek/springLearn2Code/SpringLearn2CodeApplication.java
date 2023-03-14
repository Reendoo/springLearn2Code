package sk.peterrendek.springLearn2Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import sk.peterrendek.springLearn2Code.services.HelloWorldService;
import sk.peterrendek.springLearn2Code.services.impl.PrintService;

@SpringBootApplication
//@ComponentScan(basePackages = {"sk.peterrendek.services","sk.peterrendek.springLearn2Code"})
@ImportResource("classpath:bean-configurator.xml")
public class SpringLearn2CodeApplication {

	public static void main(String[] args) {

		//injekcia cez kontruktor
//		ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
//		AppRun appRun = context.getBean(AppRun.class);
//		appRun.run();

	// setter alebo autowire
//		SpringApplication.run(SpringLearn2CodeApplication.class, args);

		// pouzitie cudzzej kniznice
//		ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
//		String str = context.getBean(StrangersClass.class).getVers();
//		System.out.println(str);

//		ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
//		context.getBean(HelloWorldService.class).sayHallo();

		ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
		context.getBean(PrintService.class).print();

	}

}
