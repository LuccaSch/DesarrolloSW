/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

public abstract class Bebida extends ItemMenu {

    protected Tamano tamano;
    protected double volumen;

    public Bebida(Tamano tamano, double volumen, int id, String nombre, String descripcion, double precio, Categoria categoria, double peso, Vendedor vendedor) {
        super(id, nombre, descripcion, precio, categoria, peso, vendedor);
        this.tamano = tamano;
        this.volumen = volumen;
    }

    @Override
    public boolean esBebida() {
        return true;
    }

    @Override
    public boolean esComida() {
        return false;
    }

    @Override
    public boolean aptoVegano() {
        return false;
    }

    public abstract boolean esBebidaAlcoholica();

    public Tamano getTamano() {
        return tamano;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setTamano(Tamano tamano) {
        this.tamano = tamano;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "Bebida{" + "tamano=" + tamano + ", volumen=" + volumen + '}';
    }

}
