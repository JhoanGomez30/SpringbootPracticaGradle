package com.example.demoToDo.Service;

import com.example.demoToDo.models.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ToDoService {
    private Long identificador = 1L;
    private ArrayList <ToDo> listaTareas = new ArrayList<>();

    public ArrayList<ToDo> getListaToDo(){
        return listaTareas;
    }

    public ToDo agregarTarea(ToDo tarea){
        tarea.setId(identificador++);
        listaTareas.add(tarea);
        return tarea;
    }

    public void eliminarTarea(Long id){
        listaTareas.removeIf(tarea -> tarea.getId().equals(id));
    }
}
