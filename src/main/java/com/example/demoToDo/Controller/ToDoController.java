package com.example.demoToDo.Controller;


import com.example.demoToDo.Service.ToDoService;
import com.example.demoToDo.models.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/ToDo")
public class ToDoController {
    //
    @Autowired
    private ToDoService toDoService;

    @GetMapping("/obtener")
    public ArrayList<ToDo> getListaToDo(){
        return toDoService.getListaToDo();
    }

    @PostMapping("/agregar")
    public ToDo agregarTarea(@RequestBody ToDo tarea){
        return toDoService.agregarTarea(tarea);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id){
        toDoService.eliminarTarea(id);
    }

}
