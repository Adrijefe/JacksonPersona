package com.AdrianPeiro;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class Direccion {
    @JacksonXmlProperty(isAttribute = true, localName = "tipo")
    private String tipo;

    @JacksonXmlProperty(localName = "calle")
    private String calle;

    @JacksonXmlProperty(localName = "ciudad")
    private String ciudad;

    public Direccion() {}

    public Direccion(String tipo, String calle, String ciudad) {
        this.tipo = tipo;
        this.calle = calle;
        this.ciudad = ciudad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "tipo='" + tipo + '\'' +
                ", calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }
}
