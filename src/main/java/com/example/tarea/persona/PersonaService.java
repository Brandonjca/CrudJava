package com.example.tarea.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRespository;
   
    // CREATE
    public Persona save(Persona entity) {
        return personaRespository.save(entity);
    }

    //READ  
    public Persona findByiId(long id){
        return personaRespository.findById(id).orElse(null);
    }

     //UPDATE UTILIZA EL METODO DE CREATE


     //DELETE
     public void deleteById(long id){
        personaRespository.deleteById(id);
    }

    //SELECT ALL
    public List<Persona> findAll(){
        return personaRespository.findAll();
    }
}
