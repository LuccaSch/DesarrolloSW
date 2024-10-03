/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

/**
 *
 * @author franciscokuchen
 */
public class Transferencia implements EstrategiaPago {

    private String cbu;
    private String cuit;

    public Transferencia(String cbu, String cuit) {
        this.cbu = cbu;
        this.cuit = cuit;
    }

    @Override
    public double aplicarRecargo(double precioTotal) {
        return precioTotal * 0.02;
    }

    /**
     * @Override public void obtenerDatos() { Scanner sc = new
     * Scanner(System.in); System.out.println("Ingrese su CBU: "); this.cbu =
     * sc.nextLine(); System.out.println("Ingrese su CUIT: "); this.cuit =
     * sc.nextLine(); validarDatos(); }
     */
    @Override
    public void validarDatos() {
        if (this.cbu.isBlank() || this.cuit.isBlank()) {
            throw new IllegalArgumentException("CBU y/o CUIT es requerido para Transferencia.");
        }
    }

}
