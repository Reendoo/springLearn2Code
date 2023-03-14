package sk.peterrendek.springLearn2Code.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import sk.peterrendek.springLearn2Code.services.impl.PrintService;

@Configuration
@PropertySources({
        @PropertySource("classpath:rendo.properties"),
        @PropertySource("classpath:rendo2.properties")
})
public class RendoConfig {
    @Value("${rendo.name}")
    String name;
    @Value("${rendo.surname}")
    String surname;
    @Value("${rendo2.choral1}")
    String choral1;
    @Value("${rendo2.choral2}")
    String choral2;
    @Value("${rendo2.choral3}")
    String choral3;

    @Bean
    public PrintService printService(){
        PrintService printService = new PrintService();
        printService.setData(name+" "+surname +"\n"
                +choral1+"\n"
                +choral2+"\n"
                +choral3);
        return printService;
    }

//    // toto asi treba pouzit v cistom springu abz som mohol takto nacitavat hodnoty
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
//        return new PropertySourcesPlaceholderConfigurer();
//    }



}
