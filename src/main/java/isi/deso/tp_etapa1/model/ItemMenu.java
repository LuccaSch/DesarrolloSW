/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

public abstract class ItemMenu {

    protected int id;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected Categoria categoria;
    protected double peso;
    
    public abstract double peso();

    public abstract boolean esBebida();

    public abstract boolean esComida();

    public abstract boolean aptoVegano();

    public abstract boolean esBebidaNoAlcoholica();

    @Override
    public String toString() {
        return "ItemMenu{id=" + this.id + ", nombre='" + this.nombre + "'}";
    }
}
