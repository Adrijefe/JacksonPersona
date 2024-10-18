package com.AdrianPeiro;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainParaJugadores {
        public static void main(String[] args) throws IOException {
            XmlMapper xmlMapperJugadores = new XmlMapper();
            File xmlFile = new File("src/main/resources/deporte.xml");
            Deporte deportes = xmlMapperJugadores.readValue(xmlFile, Deporte.class);
            xmlMapperJugadores.writeValue(new File("src/main/resources/copiado.xml"), deportes);
            xmlMapperJugadores.configure(ToXmlGenerator.Feature.WRITE_XML_DECLARATION, true);

            Deporte deporte = xmlMapperJugadores.readValue(new File("C:\\Users\\serra\\IdeaProjects\\JacksonPersona\\src\\main\\resources\\deporte.xml"), Deporte.class);
             Deporte nueva =new Deporte();
            nueva.setNombreEquipos("Alvaritos al poder");

            List<NombreJugadores> jugador = new ArrayList<>();
            NombreJugadores primero = new NombreJugadores();
            primero.setTipus("Alfredo");
           primero.setPosicion("Delantero");
           primero.setDorsal(23);

            NombreJugadores segundo = new NombreJugadores();
            segundo.setTipus("Fili");
            segundo.setPosicion("Defensa");
            segundo.setDorsal(17);
            jugador.add(segundo);

            deporte.setJugadores(jugador);

            try {
                String xml = xmlMapperJugadores.writeValueAsString(deporte);
                System.out.println(xml);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
