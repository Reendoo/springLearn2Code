package sk.peterrendek.springLearn2Code.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sk.peterrendek.springLearn2Code.model.Employe;
import sk.peterrendek.springLearn2Code.model.ToDo;
import sk.peterrendek.springLearn2Code.model.ToDoList;
import sk.peterrendek.springLearn2Code.services.RestApiService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class RestApiServiceImpl implements RestApiService {
    // ===================== inicializacia bez konfiguraku======================
//    RestTemplate restTemplate;
//    public RestApiServiceImpl(RestTemplateBuilder builder) {
//       this.restTemplate = builder.build();
//    }

    // ===================== inicializacia s konfigurakom======================
    @Autowired
    RestTemplate restTemplate;

    public RestApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ToDo getToDo(long l) {
        RestTemplate restTemplate = new RestTemplate();
        List<HttpMessageConverter<?>> messageConvertes = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Arrays.asList(MediaType.ALL));
        messageConvertes.add(converter);
        restTemplate.setMessageConverters(messageConvertes);
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/"+l, ToDo.class);
    }
    @Override
    public List<ToDo> getToDos() {
        RestTemplate restTemplate = new RestTemplate();
        List<ToDo> todos = new ArrayList<>();
        ResponseEntity<List<ToDo>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/todos/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ToDo>>() {
                });
        todos = responseEntity.getBody();
        return todos;
    }
    //======================= SPRING==================================

    @Override
    public ToDo getToDo_SPRING(long l) {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/"+l, ToDo.class);
    }

    @Override
    public List<ToDo> getToDos_SPRING() {
        List<ToDo> todos = new ArrayList<>();
        ResponseEntity<List<ToDo>> responseEntity = restTemplate.exchange("https://jsonplaceholder.typicode.com/todos/",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<ToDo>>() {
                });
        todos = responseEntity.getBody();
        return todos;
    }



    //    @Override
//    public ToDoList getToDoList() { // funkcne ale napicu server
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos/", ToDoList.class);
//    }

//    public static void main(String[] args) {
//        RestApiServiceImpl restApiService = new RestApiServiceImpl();
//        ToDo e = restApiService.getToDo(1l);
//        System.out.println(e.toString());
//        System.out.println("==============================");
//        System.out.println(restApiService.getToDos());
////        System.out.println("==============================");
////        System.out.println(restApiService.getToDoList());
//    }
}
