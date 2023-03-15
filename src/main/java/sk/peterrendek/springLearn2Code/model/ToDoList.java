package sk.peterrendek.springLearn2Code.model;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos ;

    public ToDoList() {
        this.todos =new ArrayList<>();
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public void setTodos(List<ToDo> todos) {
        this.todos = todos;
    }
}
