/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

public class BebidaSinAlcohol extends Bebida {

    public BebidaSinAlcohol(Tamano tamano, double volumen, int id, String nombre, String descripcion, double precio, Categoria categoria, Vendedor vendedor) {
        super(tamano, volumen, id, nombre, descripcion, precio, categoria, volumen * 1.04, vendedor);
    }

    @Override
    public double peso() {
        return peso * 1.2;
    }

    @Override
    public boolean esBebidaAlcoholica() {
        return false;
    }

    @Override
    public String toString() {
        return "BebidaSinAlcohol{" + '}';
    }

}
