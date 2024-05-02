package com.thl.CRUD.controller;

import com.thl.CRUD.entity.Persona;
import com.thl.CRUD.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/personas")
public class PersonaController {

    @Autowired
    private PersonaService personaService;

    @GetMapping
    public List<Persona> getAll(){
        return personaService.getPersonas();
    }

    @GetMapping("/{id}")
    public Optional<Persona> getId(@PathVariable("id") Long id) {
        return personaService.getPersona(id);
    }

    @PostMapping
    public void saveUpdate(@RequestBody Persona persona) {
        personaService.saveOrUpdate(persona);
    }

    @DeleteMapping("/{id}")
    public void saveUpdate(@PathVariable("id") Long id) {
        personaService.delete(id);
    }

}