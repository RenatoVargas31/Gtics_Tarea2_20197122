package com.example.tarea2_20197122.controller;

import com.example.tarea2_20197122.beans.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

//La primera página se puede ver ingresando directamente al localhost
//La segunda página se puede ver ingresando al localhost/listarAlumnos

@Controller
public class TareaController {
    //Acceso a primera página
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String paginaPrincipal() {
        return "formulario";
    }
    //Arraylist de alumnos
    ArrayList<Alumno>alumnos = new ArrayList<>();
    ///////////////////Forma Clásica////////////////////////

    @PostMapping("/registroAlumnos")
    public String registroAlumno(@RequestParam("nombre") String nombre,
                                 @RequestParam("apellido") String apellido,
                                 @RequestParam("DNI") String DNI,
                                 @RequestParam("codigoPUCP") String codigoPUCP,
                                 @RequestParam("domicilio") String domicilio) {

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + DNI);
        System.out.println("Código PUCP: " + codigoPUCP);
        System.out.println("Domicilio: " + domicilio);

        Alumno alumno = new Alumno(nombre, apellido, DNI, codigoPUCP, domicilio);
        alumnos.add(alumno);

        System.out.println("Alumnos registrados: ");
        for (Alumno a : alumnos) {
            System.out.println("Nombre: " + a.getNombre() + "| Apellido: "+ a.getApellido() + "| DNI: "+ a.getDNI() + "| Código PUCP: "+ a.getCodigoPUCP() + "| Domicilio: "+ a.getDomicilio());
        }

        return "formulario";
    }

    ///////////////////DATA BINDING////////////////////////
    /*
    @PostMapping("/registroAlumno")
    public String registroAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Alumnos registrados: ");
        for (Alumno a : alumnos) {
            System.out.println("Nombre: " + a.getNombre() + "| Apellido: "+ a.getApellido() + "| DNI: "+ a.getDNI() + "| Código PUCP: "+ a.getCodigoPUCP() + "| Domicilio: "+ a.getDomicilio());
        }
        return "formulario";
    }
    */
    //Acceso a la segunda página
    @GetMapping("/listarAlumnos")//Es necesario agregar esta parte al link del localhost para poder ingresar a la lista
    public String listarAlumnos(Model model) {

        model.addAttribute("alumnos", alumnos);

        return "listaAlumnos";
    }
}
