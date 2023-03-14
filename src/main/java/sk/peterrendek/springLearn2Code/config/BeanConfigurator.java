package sk.peterrendek.springLearn2Code.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import sk.strangerpackage.StrangersClass;

//@Configuration
public class BeanConfigurator {
//    @Bean
    public StrangersClass getChoral(){
        return new StrangersClass();
    }
}
