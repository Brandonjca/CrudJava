package com.example.tarea.persona;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Persona {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id //Numero unico de la tabla
    private long id;
    private String name;
    private String age;

}
