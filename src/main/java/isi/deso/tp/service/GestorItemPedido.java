/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.service;

import isi.deso.tp.dao.ItemsPedidoDao;
import isi.deso.tp.dao.ItemsPedidoMemory;
import isi.deso.tp.exception.ItemNoEncontradoException;
import isi.deso.tp.model.ItemPedido;
import isi.deso.tp.model.Pedido;
import java.util.List;

/**
 *
 * @author franciscokuchen
 */
public class GestorItemPedido {

    private ItemsPedidoDao itemsPedidoDao = new ItemsPedidoMemory();

    // Metodos que deberian ser definido dentro de un GestorPedido
    public void setLista(List<ItemPedido> itemsPedido) {
        this.itemsPedidoDao.setLista(itemsPedido);
    }

    // Filtro de itemPedidos por parametros
    // Filtro por Id
    public List<ItemPedido> filterClienteId(int idCliente) {
        List<ItemPedido> listaFiltrada = null;
        try {
            listaFiltrada = itemsPedidoDao.filtrarPorIdCliente(idCliente);
        } catch (ItemNoEncontradoException excep) {
            System.err.println(excep.getMessage());

        }

        return listaFiltrada;
    }

    // Ordenacion de itemPedidos por parametros
    // Ordenacion por precio
    public List<ItemPedido> ordenarPorPrecio() {
        List<ItemPedido> listaOrdenada = null;
        try {
            listaOrdenada = itemsPedidoDao.ordenarPorPrecio();
        } catch (ItemNoEncontradoException excep) {
            System.err.println(excep.getMessage());
        }
        return listaOrdenada;
    }

    // Ordenacion por cantidad
    public List<ItemPedido> ordenarPorCantidad() {
        List<ItemPedido> listaOrdenada = null;
        try {
            listaOrdenada = itemsPedidoDao.ordenarPorCantidad();
        } catch (ItemNoEncontradoException excep) {
            System.err.println(excep.getMessage());

        }
        return listaOrdenada;
    }

    // Busqueda de itemPedidos por parametros
    // Busqueda de Restaurante por id
    public List<ItemPedido> buscarPorRestauranteId(int idRestaurante) {
        List<ItemPedido> listaBusqueda = null;
        try {
            listaBusqueda = itemsPedidoDao.buscarPorIdRestaurante(idRestaurante);
        } catch (ItemNoEncontradoException excep) {
            System.err.println(excep.getMessage());

        }

        return listaBusqueda;
    }

    // Busqueda de itemPedido por rango de precio
    public List<ItemPedido> buscarPorRangoDePrecio(double precioMin, double precioMax) {
        List<ItemPedido> listaFiltrada = null;
        try {
            listaFiltrada = itemsPedidoDao.buscarPorRangoDePrecio(precioMin, precioMax);
        } catch (ItemNoEncontradoException excep) {
            System.err.println(excep.getMessage());

        }
        return listaFiltrada;
    }

    // Eliminacion de pedidos por parametros
    // Eliminacion de Pedido por id
    public void deletePedidoPorId(List<Pedido> pedidos, int idPedido) {
        pedidos.remove(idPedido);
        pedidos.removeIf(pedido -> pedido.getId() == idPedido);
    }

}
