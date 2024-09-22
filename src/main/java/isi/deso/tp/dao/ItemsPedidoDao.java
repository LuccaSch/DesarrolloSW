/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package isi.deso.tp.dao;

import isi.deso.tp.exception.ItemNoEncontradoException;
import isi.deso.tp.model.*;
import java.util.List;

public interface ItemsPedidoDao {

    public List<ItemPedido> getLista();

    public void setLista(List<ItemPedido> listaItemPedidos);

    public List<ItemPedido> filtrarPorIdCliente(int idCliente) throws ItemNoEncontradoException;

    public List<ItemPedido> ordenarPorPrecio() throws ItemNoEncontradoException;

    public List<ItemPedido> ordenarPorCantidad() throws ItemNoEncontradoException;

    public List<ItemPedido> buscarPorIdRestaurante(int idVendedor) throws ItemNoEncontradoException;

    public List<ItemPedido> buscarPorRangoDePrecio(double precioMin, double precioMax) throws ItemNoEncontradoException;

}
