package com.example.demo.repository;
import com.example.demo.domain.Estudiante;

import java.util.ArrayList;
import java.util.Arrays;

public class EstudianteRep {
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>(Arrays.asList(
            new Estudiante(1, "Lubswer", "Lubswer Catagña", "123456789"),
            new Estudiante(2, "Andrea", "Andrea Reyes", "987654321"),
            new Estudiante(4, "Milku", "Milka Borja", "321654987"))
    );


    public static ArrayList<Estudiante> datosEstudiantes(){
        return estudiantes;
    }
}
