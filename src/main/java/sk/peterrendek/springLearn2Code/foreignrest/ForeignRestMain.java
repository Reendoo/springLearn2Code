package sk.peterrendek.springLearn2Code.foreignrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import sk.peterrendek.springLearn2Code.foreignrest.services.ForeignRestApiService;

@SpringBootApplication
public class ForeignRestMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ForeignRestMain.class, args);
        ForeignRestApiService apiService = context.getBean(ForeignRestApiService.class);
        System.out.println("Via SPRING");
        long id = 2L;
        System.out.println("Get toDo by id: " + id);
        System.out.println(apiService.getToDo_SPRING(id));
        System.out.println("===================");
        System.out.println("Get all toDos");
        System.out.println(apiService.getToDos_SPRING());
    }
}
