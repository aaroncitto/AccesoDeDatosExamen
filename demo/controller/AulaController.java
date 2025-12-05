package com.example.demo.controller;

import org.example.model.Aula;
import org.example.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aula")
public class AulaController {

    @Autowired
    private final AulaService aulaService;

    public AulaController(AulaService aulaService) {
        this.aulaService = aulaService;
    }

    //devolver todas las aulas
    @GetMapping
    public List<Aula> listarAulas(){
        return aulaService.listarAula();
    }

    @GetMapping("/{id}")
    public Aula (@PathVariable Long id) {
      return aulaService.listarAulaId(id);
    }

    @PostMapping
    public Aula añadirAula (@RequestBody Aula aula) {
      return aulaService.guardarAula(aula);
    }

    @DeleteMapping("/{id}")
    public void borrar(@PathVariable Long id) {
        aulaService.borrarAula(id);
    }

    @PutMapping("/{id}")
    public Aula actualizar(@PathVariable Long id, @RequestBody Aula aula){
        Aula existente = aulaService.listarAulaId(id);
        if(existente !=null){
          existente.setId(aula.getId());
          existente.setCapacidad(aula.getCapacidad());
          existente.setEdificio(aula.getEdificio());
          existente.setNombre(aula.getNombre());
          return aulaService.guardarAula(existente);
        }
        return null;
    }
  // Devolver todas las aulas
  // Devolver un aula 
  // añadir aula -- no se debe repetir
  // modificar aula
  // borrar aula
}
