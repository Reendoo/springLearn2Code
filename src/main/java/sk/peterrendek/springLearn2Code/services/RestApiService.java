package sk.peterrendek.springLearn2Code.services;

import sk.peterrendek.springLearn2Code.model.ToDo;
import sk.peterrendek.springLearn2Code.model.ToDoList;

import java.util.List;

public interface RestApiService {
  ToDo getToDo(long l) ;
  List<ToDo> getToDos();

//  ToDoList getToDoList();
}
