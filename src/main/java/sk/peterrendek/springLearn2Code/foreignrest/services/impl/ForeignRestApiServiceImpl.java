package sk.peterrendek.springLearn2Code.foreignrest.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.peterrendek.springLearn2Code.foreignrest.model.ToDo;
import sk.peterrendek.springLearn2Code.foreignrest.services.ForeignRestApiService;

import java.util.ArrayList;
import java.util.List;

@Service
public class ForeignRestApiServiceImpl implements ForeignRestApiService {
    private final RestTemplate restTemplate;

    @Autowired
    public ForeignRestApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ToDo getToDo(long l) {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConvertes = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(List.of(MediaType.ALL));
        messageConvertes.add(converter);
        restTemplate.setMessageConverters(messageConvertes);
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/" + l, ToDo.class);
    }

    @Override
    public List<ToDo> getToDos() {
        RestTemplate restTemplate = new RestTemplate();
        List<ToDo> todos;
        ResponseEntity<List<ToDo>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/todos/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        todos = responseEntity.getBody();
        return todos;
    }
    //======================= SPRING==================================

    @Override
    public ToDo getToDo_SPRING(long l) {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/" + l, ToDo.class);
    }

    @Override
    public List<ToDo> getToDos_SPRING() {
        ResponseEntity<List<ToDo>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/todos/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<>() {
                });
        return responseEntity.getBody();
    }


    public static void main(String[] args) {
        ForeignRestApiServiceImpl restApiService = new ForeignRestApiServiceImpl(new RestTemplate());
        System.out.println("==============================");
        System.out.println(restApiService.getToDo(1L));
        System.out.println("==============================");
        System.out.println(restApiService.getToDos());
    }
}
