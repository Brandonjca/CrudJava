package com.example.tarea.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController // Pediciones de Crud
@RequestMapping("api/persona")
@CrossOrigin({ "*" })
public class PersonaController {
        @Autowired
    private PersonaService personaService;

    @PostMapping("/")
    public Persona save(@RequestBody Persona entity) {
        return personaService.save(entity);
    }

    // Para el metodo read
    @GetMapping("/{id}/")
    public Persona findById(@PathVariable int id) {
        return personaService.findByiId(id);
    }

    // UPDATE
    @PutMapping("/")
    public Persona update(@RequestBody Persona entity) {
        return personaService.save(entity);
    }

    // DELETE
    @DeleteMapping("/{id}/")
    public void deleteById(@PathVariable int id) {
        personaService.deleteById(id);
    }

    // SELECT ALL
    @GetMapping("/")
    public List<Persona> findAll() {
        return personaService.findAll();
    }
}
