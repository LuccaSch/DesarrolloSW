/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

public class BebidaAlcoholica extends Bebida {

    // Atributos propios
    private int graduacionAlcoholica;

    // Constructores
    public BebidaAlcoholica() {
    }

    public BebidaAlcoholica(int id, String nombre, String descripcion, double precio, Categoria categoria, Tamano tamano, double volumen, int graduacionAlcoholica) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;

        this.volumen = volumen;
        this.peso = volumen * 0.99;
        this.tamano = tamano;
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public BebidaAlcoholica(int graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    // getters\setters
    public int getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(int graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    // Otros metodos
    @Override
    public double peso() {
        return peso * 1.2;
    }

}
