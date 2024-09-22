/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

import java.util.List;

public class Cliente {

    private int id;
    private String nombre;
    private String cuit;
    private String email;
    private String direccion;
    private Coordenada coordenada;
    private List<Pedido> listaPedidos;

    public Cliente(int id, String nombre, String cuit, String email, String direccion, Coordenada coordenada, List<Pedido> listaPedidos) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.email = email;
        this.direccion = direccion;
        this.coordenada = coordenada;
        this.listaPedidos = listaPedidos;
    }

    public Cliente(int id, String nombre, String cuit, String email, String direccion, Coordenada coordenada) {
        this.id = id;
        this.nombre = nombre;
        this.cuit = cuit;
        this.email = email;
        this.direccion = direccion;
        this.coordenada = coordenada;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCuit() {
        return cuit;
    }

    public String getEmail() {
        return email;
    }

    public String getDireccion() {
        return direccion;
    }

    public Coordenada getCoordenada() {
        return coordenada;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCoordenada(Coordenada coordenada) {
        this.coordenada = coordenada;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", cuit=" + cuit + ", email=" + email + ", direccion=" + direccion + ", coordenada=" + coordenada + ", listaPedidos=" + listaPedidos + '}';
    }

}
