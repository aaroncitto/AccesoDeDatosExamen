package com.example.demo.service;

import com.example.demo.entity.Aula;
import com.example.repository.AulaRepository; //Es un ejemplo parecido al que tengo en mi proyecto, no se poner la linea exacta entera
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AulaService {

@Autowired
private AulaRepository aulaRepository;

//Aquí guardamos el aula
public Aula guardarAula (Aula aula) {
    return aulaRepository.save(aula);
}

//Aquí recogemos todas las aulas
public <List> listarAula(){
    return aulaRepository.findAll();
}

//Aquí recogemos un aula
public <List> listarAulaId(){
    return aulaRepository.findById(aula);
}

//Aquí eliminamos un aula
public void borrarAula(Aula aula){
    aulaRepository.deleteById(id);
}


// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.
}
