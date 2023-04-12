package sk.peterrendek.springLearn2Code.foreignrest.services;

import sk.peterrendek.springLearn2Code.foreignrest.model.ToDo;

import java.util.List;

public interface ForeignRestApiService {
    ToDo getToDo(long l);

    List<ToDo> getToDos();


    ToDo getToDo_SPRING(long l);

    List<ToDo> getToDos_SPRING();


}
