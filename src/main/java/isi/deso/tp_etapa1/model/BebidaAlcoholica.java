/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

public class BebidaAlcoholica extends Bebida {

    //atributos heredados:
    //ItemMenu {int id, String nombre, String descripcion, double precio, Categoria categoria,double peso} 
    //Bebida {int tamano double volumen}
    private int graduacionAlcoholica;
   
    public BebidaAlcoholica(int id, String nombre, String descripcion, double precio, Categoria categoria,Tamano tamano, double volumen,int graduacionAlcoholica) {
        this.id=id;
        this.nombre=nombre;
        this.descripcion=descripcion;
        this.precio=precio;
        this.categoria=categoria;
        
        this.volumen = volumen;
        this.peso = volumen * 0.99;
        this.tamano = tamano;
        this.graduacionAlcoholica=graduacionAlcoholica;
    }

    public BebidaAlcoholica(int graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    public int getGraduacionAlcoholica() {
        return graduacionAlcoholica;
    }

    public void setGraduacionAlcoholica(int graduacionAlcoholica) {
        this.graduacionAlcoholica = graduacionAlcoholica;
    }

    @Override
    public double peso() {
        return peso * 1.2;
    }

    @Override
    public boolean esBebidaNoAlcoholica(){return false;}

}
