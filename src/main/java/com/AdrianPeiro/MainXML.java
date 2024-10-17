package com.AdrianPeiro;

import com.AdrianPeiro.Direccion;
import com.AdrianPeiro.Persona;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MainXML {
    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        Persona persona = xmlMapper.readValue(new File("persona.xml"), Persona.class);

        persona.setNombre("Adrian Peiro");
        persona.setEdad(21);
        persona.setNotas("Soy el mas mejor.");

        List<Direccion> direcciones = new ArrayList<>();

        Direccion casa = new Direccion();
        casa.setTipo("casa");
        casa.setCalle("Avinguda Alcornoque");
        casa.setCiudad("Vall de Uxo");
        direcciones.add(casa);

        Direccion oficina = new Direccion();
        oficina.setTipo("oficina");
        oficina.setCalle("Canto del Bobet");
        oficina.setCiudad("Benigaslo");
        direcciones.add(oficina);

        persona.setDirecciones(direcciones);

        try {
            String xml = xmlMapper.writeValueAsString(persona);
            System.out.println(xml);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
