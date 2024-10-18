package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;

class Main {
    public static void main(String[] args) throws Exception {
        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("src/main/resources/deporte.xml");

        try {
            if (xmlFile.exists()) {
                Deporte deporte = xmlMapper.readValue(xmlFile, Deporte.class);

                System.out.println("Nombre del Equipo: " + deporte.getNombreEquipos());

                for (NombreJugadores nombreJugadores : deporte.getJugadores()) {
                    System.out.println("Nombre del jugador: " + nombreJugadores.getTipus());
                    System.out.println("En que posición juega: " + nombreJugadores.getPosicion());
                    System.out.println("Que dorsal lleva puesto: " + nombreJugadores.getDorsal());
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