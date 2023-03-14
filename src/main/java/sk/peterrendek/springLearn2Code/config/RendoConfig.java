package sk.peterrendek.springLearn2Code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import sk.peterrendek.springLearn2Code.services.impl.PrintService;

@Configuration
@PropertySource("classpath:rendo.properties")
public class RendoConfig {
    @Value("${rendo.name}")
    String name;
    @Value("${rendo.surname}")
    String surname;

    @Bean
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(name+" "+surname);
        return printService;
    }

//    // toto asi treba pouzit v cistom springu abz som mohol takto nacitavat hodnoty
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }



}
