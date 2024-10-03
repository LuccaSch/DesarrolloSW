/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package isi.deso.tp.app;

import isi.deso.tp.exception.ItemNoEncontradoException;
import isi.deso.tp.model.BebidaAlcoholica;
import isi.deso.tp.model.BebidaSinAlcohol;
import isi.deso.tp.model.Categoria;
import isi.deso.tp.model.Cliente;
import isi.deso.tp.model.Coordenada;
import isi.deso.tp.model.ItemMenu;
import isi.deso.tp.model.ItemPedido;
import isi.deso.tp.model.Pedido;
import isi.deso.tp.model.Plato;
import isi.deso.tp.model.Tamano;
import isi.deso.tp.model.Vendedor;
import isi.deso.tp.service.GestorCliente;
import isi.deso.tp.service.GestorItemPedido;
import isi.deso.tp.service.GestorVendedor;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ItemNoEncontradoException {
        // --------------------------------
        // App de TP Etapa 2 Modulo de gestion del Menu
        //
        System.out.println("INICIO App TP Etapa 2 Modulo de gestion del Menu\n\n");

        GestorVendedor gestorVendedor = new GestorVendedor();
        GestorCliente gestorCliente = new GestorCliente();

        // Creando los 3 vendedores
        Vendedor vendedor1 = gestorVendedor.crearVendedor(1, "Roticeria Pampita", "San Luis 3984", new Coordenada(1, 2));
        Vendedor vendedor2 = gestorVendedor.crearVendedor(2, "Polleria Don Pechuga", "Paraguay 4244", new Coordenada(2, 3));
        Vendedor vendedor3 = gestorVendedor.crearVendedor(3, "Polleria Alitas", "Vicente 2301", new Coordenada(3, 6));

        // Creando lista de vendedores
        List<Vendedor> listaVendedores = new ArrayList<>();

        // Agregando los 3 vendedores a la lista
        listaVendedores.add(vendedor1);
        listaVendedores.add(vendedor2);
        listaVendedores.add(vendedor3);

        System.out.println("Vendedores filtrados");

        // Filtrando vendedores con Id 1
        List<Vendedor> listaVendedoresFiltradoID = gestorVendedor.filterVendedoresId(listaVendedores, 1);
        listaVendedoresFiltradoID.forEach(vendedor -> System.out.println(vendedor));

        // Filtrando vendedores con Nombre Polleria Don Pechuga
        List<Vendedor> listaVendedoresFiltradoNombre = gestorVendedor.filterVendedoresNombre(listaVendedores, "Polleria Don Pechuga");
        listaVendedoresFiltradoNombre.forEach(vendedor -> System.out.println(vendedor));

        // Creando los 3 clientes
        Cliente cliente1 = gestorCliente.crearCliente(1, "Lucca Perez", "2043350012", "lsch@gmail.com", "San Luis 6612", new Coordenada(1, 1));
        Cliente cliente2 = gestorCliente.crearCliente(2, "Pedro Suarez", "2042250012", "pedrito@gmail.com", "Salta 981", new Coordenada(2, 3));
        Cliente cliente3 = gestorCliente.crearCliente(2, "Patricio Vilozco", "2042255512", "p@gmail.com", "Peron 2022", new Coordenada(4, 4));

        // Creando lista de clientes
        List<Cliente> listaClientes = new ArrayList<>();

        // Agregando los 3 clientes a la lista
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);

        System.out.println("Clientes filtrados");

        // Filtrando clientes con Id 1
        List<Cliente> listaClienteFiltradoID = gestorCliente.filterClienteId(listaClientes, 1);
        listaClienteFiltradoID.forEach(cliente -> System.out.println(cliente));

        // Filtrando clientes con Nombre Pedro
        List<Cliente> listaClienteFiltradoNombre = gestorCliente.filterClienteNombre(listaClientes, "Pedro");
        listaClienteFiltradoNombre.forEach(cliente -> System.out.println(cliente));

        // Calculando distancia entre Vendedor y Cliente
        System.out.println("Distancia entre " + vendedor1 + " y " + cliente1 + " es: " + vendedor1.distancia(cliente1) + " km");

        System.out.println("Vendedores Actuales");

        listaVendedores.forEach(vendedor -> System.out.println(vendedor));

        // Eliminando vendedores con Id 1
        gestorVendedor.deleteVendedoresId(listaVendedores, 1);

        // Eliminando vendedores con Nombre Polleria Don Pechuga
        gestorVendedor.deleteVendedoresNombre(listaVendedores, "Polleria Don Pechuga");

        System.out.println("Vendedores luego de eliminacion");

        // Mostrando vendedores
        listaVendedores.forEach(vendedor -> System.out.println(vendedor));

        System.out.println("Clientes Actuales");

        listaClientes.forEach(cliente -> System.out.println(cliente));

        // Eliminando clientes con Id 1
        gestorCliente.deleteClienteId(listaClientes, 1);

        // Eliminando clientes con Nombre Pedro
        gestorCliente.deleteClienteNombre(listaClientes, "Pedro");

        System.out.println("Clientes luego de eliminacion");

        // Mostrando clientes
        listaClientes.forEach(cliente -> System.out.println(cliente));

        System.out.println("\nFIN App TP Etapa 2 Modulo de gestion del Menu\n");
        //
        // --------------------------------
        //
        //
        // --------------------------------
        // App de TP Etapa 3 Módulo de gestión de Búsqueda
        //
        System.out.println("INICIO App TP Etapa 3 Modulo de gestion de Busqueda\n\n");

        Vendedor vendedor4 = gestorVendedor.crearVendedor(1, "Almacen El Tio", "Lujan 2354", new Coordenada(1, 2));
        Cliente cliente4 = gestorCliente.crearCliente(4, "Patricio Alcaraz", "2042255512", "p@gmail.com", "Peron 2323", new Coordenada(4, 4));

        Pedido pedido1 = new Pedido(cliente4, 1);
        Pedido pedido2 = new Pedido(cliente3, 2);

        Categoria categoria1 = new Categoria(1, "Bebida");
        Categoria categoria2 = new Categoria(2, "Carne");
        Categoria categoria3 = new Categoria(3, "Postre");

        ItemMenu itemMenu1 = new BebidaAlcoholica(Tamano.MEDIANA, 0.750, 102, "Santa Julia", "Vino tinto", 7000.0, categoria1, 7, vendedor4);
        ItemMenu itemMenu2 = new BebidaSinAlcohol(Tamano.GRANDE, 1.5, 101, "Sprite", "Bebida gaseosa limon", 2500.0, categoria1, vendedor4);
        ItemMenu itemMenu3 = new Plato(300, true, false, 103, "Flan", "Flan casero", 1000.0, categoria3, 120.0, vendedor2);

        vendedor4.addItemMenu(itemMenu1);
        vendedor4.addItemMenu(itemMenu2);
        vendedor4.addItemMenu(itemMenu3);

        ItemPedido itemPedido1 = new ItemPedido(1, itemMenu2, 3, 7500.0, pedido1);
        ItemPedido itemPedido2 = new ItemPedido(2, itemMenu1, 2, 14000.0, pedido1);
        ItemPedido itemPedido3 = new ItemPedido(3, itemMenu3, 1, 1000.0, pedido2);
        ItemPedido itemPedido4 = new ItemPedido(4, itemMenu2, 4, 10000.0, pedido2);
        ItemPedido itemPedido5 = new ItemPedido(5, itemMenu1, 1, 7000.0, pedido2);

        // Creando listaPedido y agregando itemPedidos
        List<ItemPedido> listaPedido = new ArrayList<>();
        listaPedido.add(itemPedido1);
        listaPedido.add(itemPedido2);
        listaPedido.add(itemPedido3);
        listaPedido.add(itemPedido4);
        listaPedido.add(itemPedido5);

        // Creando detallePedido y seteandole listaPedido como la lista de todos los itemsPedido que hay
        GestorItemPedido detalleP = new GestorItemPedido();
        detalleP.setLista(listaPedido);

        // Filtrar por idCliente
        List<ItemPedido> listaFiltradaPorIdCliente;
        int idCliente = 4;
        System.out.println("ItemsPedido filtrado por idCliente " + idCliente + ": ");
        listaFiltradaPorIdCliente = detalleP.filterClienteId(idCliente);
        if (listaFiltradaPorIdCliente != null) {
            listaFiltradaPorIdCliente.forEach(item -> System.out.println(item.toString()));
        }

        // Ordenar por precio
        List<ItemPedido> listaOrdenadaPorPrecio;
        System.out.println("ItemsPedido ordenados por precio: ");
        listaOrdenadaPorPrecio = detalleP.ordenarPorPrecio();
        if (listaOrdenadaPorPrecio != null) {
            listaOrdenadaPorPrecio.forEach(item -> System.out.println("ItemPedido: " + item.getId() + " con precio: " + item.getPrecio()));
        }

        // Ordenar por cantidad
        List<ItemPedido> listaOrdenadaPorCantidad;
        System.out.println("ItemsPedido ordenados por cantidad: ");
        listaOrdenadaPorCantidad = detalleP.ordenarPorCantidad();
        if (listaOrdenadaPorCantidad != null) {
            listaOrdenadaPorCantidad.forEach(item -> System.out.println("ItemPedido: " + item.getId() + " con cantidad: " + item.getCantidad()));
        }

        // Buscar por idRestaurante
        List<ItemPedido> listaBusquedaPorIdRestaurante;
        int IdRestaurante = 1;
        System.out.println("ItemsPedido con idRestaurante " + IdRestaurante + ": ");
        listaBusquedaPorIdRestaurante = detalleP.buscarPorRestauranteId(IdRestaurante);
        if (listaBusquedaPorIdRestaurante != null) {
            listaBusquedaPorIdRestaurante.forEach(item -> System.out.println(item.toString()));
        }

        // Buscar por rango de precio
        List<ItemPedido> listaBusquedaPorRangoDePrecio;
        double precioMin = 2000.0;
        double precioMax = 3000.0;
        System.out.println("ItemsPedido en rango de precio [" + precioMin + ", " + precioMax + "]: ");
        listaBusquedaPorRangoDePrecio = detalleP.buscarPorRangoDePrecio(precioMin, precioMax);
        if (listaBusquedaPorRangoDePrecio != null) {
            listaBusquedaPorRangoDePrecio.forEach(item -> System.out.println(item.toString()));
        }

        System.out.println("\nFIN App TP Etapa 3 Modulo de gestion de Busqueda\n");
        //
        // --------------------------------
    }
}
