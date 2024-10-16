package com.AdrianPeiro;

import com.AdrianPeiro.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("C:\\Users\\Usuario\\IdeaProjects\\Ej1JacksonGuiado\\src\\main\\resources\\Persona.xml");

        try {
            if (xmlFile.exists()) {
                Persona persona = xmlMapper.readValue(xmlFile, Persona.class);

                System.out.println("Nombre: " + persona.getNombre());
                System.out.println("Edad: " + persona.getEdad());
                System.out.println("Notas: " + persona.getNotas());

                for (Direccion adreca : persona.getDirecciones()) {
                    System.out.println("Tipo de calle: " + adreca.getTipo());
                    System.out.println("Calle: " + adreca.getCalle());
                    System.out.println("Ciudad: " + adreca.getCiudad());
                    System.out.println();
                }
            } else {
                System.err.println("El fichero no existe.");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }


    }
}