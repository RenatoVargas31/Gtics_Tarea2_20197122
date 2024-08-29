package com.example.tarea2_20197122.beans;

public class Alumno {
    //Atributos del alumno
    private String nombre;
    private String apellido;
    private String DNI;
    private String codigoPUCP;
    private String domicilio;

    //Constructor vacío
    public Alumno() {
    }
    //
    public Alumno(String nombre, String apellido, String DNI, String codigoPUCP, String domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.codigoPUCP = codigoPUCP;
        this.domicilio = domicilio;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getCodigoPUCP() {
        return codigoPUCP;
    }

    public void setCodigoPUCP(String codigoPUCP) {
        this.codigoPUCP = codigoPUCP;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
