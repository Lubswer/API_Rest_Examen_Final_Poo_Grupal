package com.example.demo.controllers;

import com.example.demo.domain.Estudiante;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/estudiantes")
    public Estudiante postEstudiante(@RequestBody Estudiante es){
        EstudianteRep.estudiantes.add(es);
        return es;
    }






}
