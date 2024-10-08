/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

/**
 *
 * @author jarteaga
 */

public class Coordenada {
    private double lat;
    private double lgn;

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLgn() {
        return lgn;
    }

    public void setLgn(double lgn) {
        this.lgn = lgn;
    }

    public Coordenada(double lat, double lgn) {
        this.lat = lat;
        this.lgn = lgn;
    }

    @Override
    public String toString() {
        return "Coordenada{" + "lat=" + lat + ", lgn=" + lgn + '}';
    }
    
    public boolean equals(Coordenada c){
        if (c==null) return false;
        return (c==this || (this.lat==c.lat && this.lgn==c.lgn));
    }
}
