package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

import java.util.List;

@JacksonXmlRootElement(localName = "persona")
public class Persona {

    @JacksonXmlProperty(localName = "nombre")
    private String nombre;

    @JacksonXmlProperty(localName = "edad")
    private int edad;

    @JacksonXmlElementWrapper(localName = "direcciones")
    @JacksonXmlProperty(localName = "direccion")
    private List<Direccion> direcciones;

    @JacksonXmlText(value = false)
    private String notas;

    public Persona(){}

    public Persona(String nombre, int edad, List<Direccion> direcciones, String notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.direcciones = direcciones;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(List<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", direcciones=" + direcciones +
                ", notas='" + notas + '\'' +
                '}';
    }
}
