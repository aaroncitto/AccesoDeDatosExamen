package com.example.demo.service;

import com.example.demo.entity.Reserva;
import com.example.repository.ReservaRepository; //Es un ejemplo parecido al que tengo en mi proyecto, no se poner la linea exacta entera
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ReservaService {

@Autowired
private ReservaRepository reservaRepository;

//Aquí guardamos la reserva
public Reserva guardarReserva (Reserva reserva) {
    return reservaRepository.save(reserva);
}

//Aquí recogemos todas las reservas
public <List> listarReserva(){
    return reservaRepository.findAll();
}

//Aquí recogemos una reserva validando la hora de inicio
public <List> listarReserva(){
    return reservaRepository.findByHoraInicio(horaInicio);
}

//Aquí eliminamos una reserva
public void borrarReserva(Reserva reserva){
    reservaRepository.delete(reserva);
}


// Recoger todas las reservas.
// recoger una reserva.
// Guardar una reserva --Se debe validar horas
// Cambiar una reserva.
// Borrar una reserva.
}
