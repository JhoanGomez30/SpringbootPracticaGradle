package com.example.demoToDo.models;

public class ToDo {

    private Long id;
    private String descripcion;
    private boolean terminada;

    public ToDo() {
    }

    public ToDo(Long id, String descripcion, boolean terminada){
        this.id = id;
        this.descripcion = descripcion;
        this.terminada = terminada;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
