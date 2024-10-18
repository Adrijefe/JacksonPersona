package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;
@JacksonXmlRootElement(localName = "deporte")
public class Deporte {
    @JacksonXmlProperty(localName = "nombreEquipo")
private String nombreEquipos;
    @JacksonXmlElementWrapper(localName ="jugadores" )
    @JacksonXmlProperty(localName = "nombre")
private List<NombreJugadores> jugadores;

public Deporte() {
}

    public Deporte(String nombreEquipos, List<NombreJugadores> jugadores) {
        this.nombreEquipos = nombreEquipos;
        this.jugadores = jugadores;
    }

    public String getNombreEquipos() {
        return nombreEquipos;
    }

    public void setNombreEquipos(String nombreEquipos) {
        this.nombreEquipos = nombreEquipos;
    }
    public List<NombreJugadores> getJugadores() {
    return jugadores;
    }
    public void setJugadores(List<NombreJugadores> jugadores) {
    this.jugadores = jugadores;
    }



}
