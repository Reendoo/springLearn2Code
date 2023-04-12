package sk.peterrendek.springLearn2Code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import sk.peterrendek.springLearn2Code.zothers.services.impl.PrintService;
import sk.strangerpackage.StrangersClass;

@SpringBootApplication
@ImportResource("classpath:bean-configurator.xml")
public class SpringLearn2CodeApplication {

    public static void main(String[] args) {
//		 pouzitie cudzej kniznice
        ConfigurableApplicationContext context = SpringApplication.run(SpringLearn2CodeApplication.class, args);
        context.getBean(PrintService.class).print();
        String poem = context.getBean(StrangersClass.class).getPoem();
        System.out.println(poem);
    }
}
