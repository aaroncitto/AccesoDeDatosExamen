package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Aula")
public class Aula {

   @Id
   @GeneratedValue(strategy = Generation.Type.IDENTITY)

   @Column(name = "id_aula")
    private Long id;
     @Column(name = "nombre")
    private String nombre;
     @Column(name = "capacidad")
    private Integer capacidad;
     @Column(name = "edificio")
    private String edificio;
    // añadir mínimo 3 atributos (ejemplo: nombre, capacidad, edificio)


    //Getters setters
    public Long getId(){
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public Integer setCapacidad(){
        return capacidad;
    }

    public void getCapacidad(String capacidad){
        this.capacidad = capacidad;
    }

    public String getEdificio(){
        return edificio;
    }

    public void setEdificio(){
        this.edificio = edificio;
    }
        
}
