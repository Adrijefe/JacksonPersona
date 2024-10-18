package com.AdrianPeiro;


import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class NombreJugadores {
    ;
    @JacksonXmlProperty(isAttribute = true, localName = "tipus")
private String tipus;
    @JacksonXmlProperty(localName = "posicion")
private String posicion;
    @JacksonXmlProperty(localName = "dorsal")
private int dorsal;


    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
