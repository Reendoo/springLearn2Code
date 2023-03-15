package sk.peterrendek.springLearn2Code.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;
import sk.strangerpackage.StrangersClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class BeanConfigurator {
//    @Bean
    public StrangersClass getChoral(){
        return new StrangersClass();
    }
    @Bean
    RestTemplate getRestTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate = builder.build();

        //tunak by som vedel nastavit convertory
        List<HttpMessageConverter<?>> messageConvertes = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConvertes.add(converter);
        restTemplate.setMessageConverters(messageConvertes);

        return restTemplate;
    }
}
