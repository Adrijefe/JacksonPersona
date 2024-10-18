package com.AdrianPeiro;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainParaJugadores {
        public static void main(String[] args) throws IOException {
            XmlMapper xmlMapperJugadores = new XmlMapper();
            //lo utilizamos para crear una instancia nueva
        try{

             Deporte nueva =new Deporte();
            nueva.setNombreEquipos("Alvaritos al poder");

            List<NombreJugadores> jugador = new ArrayList<>();
            NombreJugadores primero = new NombreJugadores();
            primero.setTipus("Alfredo");
           primero.setPosicion("Delantero");
           primero.setDorsal(23);
           jugador.add(primero);

            NombreJugadores segundo = new NombreJugadores();
            segundo.setTipus("Fili");
            segundo.setPosicion("Defensa");
            segundo.setDorsal(17);
            jugador.add(segundo);


            nueva.setJugadores(jugador);

            xmlMapperJugadores.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);

            xmlMapperJugadores.enable(SerializationFeature.INDENT_OUTPUT);

            String xml = xmlMapperJugadores.writeValueAsString(nueva);

            FileWriter fileWriter = new FileWriter("src/main/resources/copia.xml");
            fileWriter.write(xml);
            fileWriter.close();
            System.out.println("Se creo correctamente");


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
