package com.example.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
     @Column(name = "id_reserva")
      private Long id;

     @Column(name = "fecha")
      private LocalDate fecha;

     @Column(name = "horaInicio")
      private LocalTime horaInicio;

     @Column(name = "horaFin")
      private LocalTime horaFin;

     @Column(name = "aulaId")
      private Long aulaId;
    // añadir mínimo 3 atributos (ejemplo: fecha, horaInicio, horaFin, aulaId)
    // TODO: constructor con parámetros

    //Getters setters
    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public LocalDate getFecha(){
        return fecha;
    }
    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }
    public LocalTime getHoraInicio(){
        return horaInicio;
    }
    public void setHoraInicio(LocalTime horaInicio){
        this.horaInicio = horaInicio;
    }
    public LocalTime getHoraFin(){
        return horaFin;
    }
    public void setHoraFin(LocalTime horaFin){
        this.horaFin = horaFin;
    }
    public Long getAulaId(){
        return aulaId;
    }
    public void setAulaId(){
        this.aulaId = aulaId;
    }

}
