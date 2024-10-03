package isi.deso.tp.model;

import isi.deso.tp.exception.EstadoPedidoNoDisponibleExeption;
import isi.deso.tp.model.estadoPedido.EstadoPedido;
import isi.deso.tp.model.estadoPedido.Inicializado;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    // Atributos
    private int id;
    private Cliente cliente;
    private EstadoPedido estadoPedido;
    private List<ItemPedido> pedidoDetalle;
    private EstrategiaPago estrategiaPago;
    private double precioTotal;

    // Constructores
    public Pedido() {
        this.id = 0;
        this.cliente = new Cliente();
        this.estadoPedido = new Inicializado();
        this.pedidoDetalle = new ArrayList<>();
        this.estrategiaPago = null;
        this.precioTotal = 0.0;

    }

    public Pedido(int id, Cliente cliente, EstrategiaPago estrategiaPago, double precioTotal) {
        this.id = id;
        this.cliente = cliente;
        this.estadoPedido = new Inicializado();
        this.pedidoDetalle = new ArrayList<>();
        this.estrategiaPago = estrategiaPago;
        this.precioTotal = precioTotal;

    }

    //Gestion de estadosPedidos
    public String getEstado() {
        return estadoPedido.getEstado();
    }

    public boolean prepararPedido() {
        try {
            estadoPedido.prepararPedido(this);
            return true;
        } catch (EstadoPedidoNoDisponibleExeption e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean enviarPedido() {
        try {
            estadoPedido.enviarPedido(this);
            return true;
        } catch (EstadoPedidoNoDisponibleExeption e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean entregarPedido() {
        try {
            estadoPedido.entregarPedido(this);
            return true;
        } catch (EstadoPedidoNoDisponibleExeption e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean cancelarPedido() {
        try {
            estadoPedido.cancelarPedido(this);
            return true;
        } catch (EstadoPedidoNoDisponibleExeption e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    // getters\setters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public EstadoPedido getEstadoPedido() {
        return estadoPedido;
    }

    public List<ItemPedido> getPedidoDetalle() {
        return pedidoDetalle;
    }

    public EstrategiaPago getEstrategiaPago() {
        return estrategiaPago;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setEstadoPedido(EstadoPedido estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public void setPedidoDetalle(List<ItemPedido> pedidoDetalle) {
        this.pedidoDetalle = pedidoDetalle;
    }

    public void setEstrategiaPago(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void addPedidoDetalle(ItemPedido newItemPedido) {
        this.pedidoDetalle.add(newItemPedido);
    }

    public double realizarPago() {
        return this.precioTotal + this.estrategiaPago.aplicarRecargo(this.precioTotal);
    }

}
