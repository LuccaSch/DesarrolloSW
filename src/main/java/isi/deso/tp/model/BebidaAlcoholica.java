/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

public class BebidaAlcoholica extends Bebida {

    private int graduacionAlcoholica;

    public BebidaAlcoholica(Tamano tamano, double volumen, int id, String nombre, String descripcion, double precio, Categoria categoria, double peso, Vendedor vendedor) {
        super(tamano, volumen, id, nombre, descripcion, precio, categoria, volumen * 0.99, vendedor);
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
    public boolean esBebidaAlcoholica() {
        return true;
    }

    @Override
    public String toString() {
        return "BebidaAlcoholica{" + "graduacionAlcoholica=" + graduacionAlcoholica + '}';
    }

}
