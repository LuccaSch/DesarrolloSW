/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

public class BebidaSinAlcohol extends Bebida {

    //ItemMenu {int id, String nombre, String descripcion, double precio, Categoria categoria,double peso, 
    //Bebida {int tamano double volumen}

    public BebidaSinAlcohol(int id, String nombre, String descripcion, double precio, Categoria categoria,Tamano tamano, double volumen) {
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.categoria=categoria;
        
        this.volumen = volumen;
        this.peso = volumen * 1.04;
        this.tamano = tamano;
        
    }

    @Override
    public double peso() {
        return peso * 1.2;
    }

    @Override
    public boolean esBebidaNoAlcoholica(){return true;}

}
