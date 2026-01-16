package com.example.demo.controllers;

import com.example.demo.domain.Estudiante;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.domain.Estudiante;
import java.util.ArrayList;
import com.example.demo.repository.*;
@RestController
public class EstudiantesController {

    @GetMapping("/estudiantes")
    public ArrayList<Estudiante> obtenerRegistros(){
        return EstudianteRep.datosEstudiantes();
    }
    @GetMapping("/estudiantes/{name}")
    public Estudiante obtenerEstudiante(@PathVariable String name){
        ArrayList<Estudiante> estudiantes = EstudianteRep.datosEstudiantes();

        for(Estudiante es : estudiantes){
            if(es.getName().equalsIgnoreCase(name)){
                return es;
            }
        }
        return null;
    }






}
