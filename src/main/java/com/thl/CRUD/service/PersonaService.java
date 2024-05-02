package com.thl.CRUD.service;

import com.thl.CRUD.entity.Persona;
import com.thl.CRUD.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PersonaService {

    @Autowired
    PersonaRepository personaRepository;

    public List<Persona> getPersonas(){
        return personaRepository.findAll();
    }

    public Optional<Persona> getPersona(Long id){
        return personaRepository.findById(id);
    }

    public void saveOrUpdate(Persona persona){
        personaRepository.save(persona);
    }

    public void delete(Long id){
        personaRepository.deleteById(id);
    }
}
