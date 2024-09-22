/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

public abstract class ItemMenu {

    protected int id;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected Categoria categoria;
    protected double peso;
    protected Vendedor vendedor;

    public ItemMenu(int id, String nombre, String descripcion, double precio, Categoria categoria, double peso, Vendedor vendedor) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.peso = peso;
        this.vendedor = vendedor;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public double getPeso() {
        return peso;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public abstract double peso();

    public abstract boolean esBebida();

    public abstract boolean esComida();

    public abstract boolean aptoVegano();

    @Override
    public String toString() {
        return "ItemMenu{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio=" + precio + ", categoria=" + categoria + ", peso=" + peso + ", vendedor=" + vendedor.getId() + '}';
    }

}
