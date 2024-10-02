/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

/**
 *
 * @author franciscokuchen
 */
public class MercadoPago implements EstrategiaPago {

    private String alias;

    public MercadoPago(String alias) {
        this.alias = alias;
    }

    @Override
    public double aplicarRecargo(double precioTotal) {
        return precioTotal * 0.04;
    }

    /**
     * @Override public void obtenerDatos() { Scanner sc = new
     * Scanner(System.in); System.out.println("Ingrese su alias: "); this.alias
     * = sc.nextLine(); validarDatos() }
     */
    @Override
    public void validarDatos() {
        if (this.alias.isBlank()) {
            throw new IllegalArgumentException("Alias es requerido para MercadoPago.");
        }

    }

}
