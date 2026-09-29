package org.example.business;

public class Estudiante {
    private int id ;
    private String nombre;
    private String correo;

    public Estudiante( ){

    }

    public Estudiante(String nombre, int id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }


}
