/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp.service;

import isi.deso.tp.model.DTO.PedidoDTO;
import isi.deso.tp.model.ItemMenu;
import isi.deso.tp.model.Pedido;
import java.util.Scanner;

/**
 *
 * @author franciscokuchen
 */
public class GestorPedido {

    public Pedido crearPedido(PedidoDTO pedidoDTO) {
        Pedido pedidoNuevo = new Pedido(idPedido, cliente);
        Scanner sc = new Scanner(System.in);
        int cantidadSolicitada;
        for (ItemMenu item : itemsMenu) {
            System.out.println("Ingrese la cantidad que requiere del item " + item.getNombre());
            cantidadSolicitada = sc.nextInt();

            //pedidoNuevo.addItemPedido(new ItemPedido());
        }

    }

}
