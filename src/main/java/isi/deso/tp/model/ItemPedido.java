/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.model;

public class ItemPedido {

    private int id;
    private ItemMenu itemMenu;
    private int cantidad;
    private double precio;
    private Pedido pedido;

    public ItemPedido(int id, ItemMenu itemMenu, int cantidad, double precio, Pedido pedido) {
        this.id = id;
        this.itemMenu = itemMenu;
        this.cantidad = cantidad;
        this.precio = precio;
        this.pedido = pedido;
    }

    public int getId() {
        return id;
    }

    public ItemMenu getItemMenu() {
        return itemMenu;
    }

    public Vendedor getVendedor() {
        return this.itemMenu.getVendedor();
    }

    public Cliente getCliente() {
        return this.pedido.getCliente();
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setItemMenu(ItemMenu itemMenu) {
        this.itemMenu = itemMenu;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "ItemPedido{" + "id=" + id + ", itemMenu=" + itemMenu.getId() + ", idVendedor del itemMenu=" + itemMenu.getVendedor().getId() + ", cantidad=" + cantidad + ", precio=" + precio + ", pedido=" + pedido.getId() + ", idCliente del pedido=" + pedido.getCliente().getId() + '}';
    }

}
