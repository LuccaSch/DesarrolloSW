/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package isi.deso.tp_etapa1;

import java.util.ArrayList;
import java.util.List;

import isi.deso.tp_etapa1.model.Cliente;
import isi.deso.tp_etapa1.model.Coordenada;
import isi.deso.tp_etapa1.model.Vendedor;
import isi.deso.tp_etapa1.service.GestorCliente;
import isi.deso.tp_etapa1.service.GestorVendedor;


/**
 *
 * @author jarteaga
 * 
 */


public class Main {
    public static void main(String[] args) {
        GestorVendedor gestorVendedor= new GestorVendedor();
        GestorCliente gestorCliente= new GestorCliente();

        //creando los vendedores
        Vendedor v1=gestorVendedor.crearVendedor(1,"roticeria Pampita","San luis 34",new Coordenada(1, 2));
        Vendedor v2=gestorVendedor.crearVendedor(2,"Polleria don pechuga","Paraguay 444",new Coordenada(2, 3));
        Vendedor v3=gestorVendedor.crearVendedor(3,"Polleria alitas","Vicente 23",new Coordenada(3, 6));

        List<Vendedor> listaVendedores= new ArrayList<Vendedor>();

        listaVendedores.add(v1);
        listaVendedores.add(v2);
        listaVendedores.add(v3);
        
        System.out.print("");
        System.out.print("Vendedores filtrados\n");

        List<Vendedor> listaVendedoresFiltradoID=gestorVendedor.filterVendedoresId(listaVendedores, 1);

        listaVendedoresFiltradoID.forEach(vendedor -> System.out.println(vendedor));
        
        List<Vendedor> listaVendedoresFiltradoNombre=gestorVendedor.filterVendedoresNombre(listaVendedores, "Polleria don pechuga");

        listaVendedoresFiltradoNombre.forEach(vendedor -> System.out.println(vendedor));

        System.out.print("Vendedores eliminados\n");

        gestorVendedor.deleteVendedoresId(listaVendedores,1);
        gestorVendedor.deleteVendedoresNombre(listaVendedores, "Polleria don pechuga\"");

        listaVendedores.forEach(vendedor -> System.out.println(vendedor));

        //creando los clientes
        Cliente c1=gestorCliente.crearClientes(1,"lucca","2043350012","lsch@gmail.com","san luis 34",new Coordenada(1, 1));
        Cliente c2=gestorCliente.crearClientes(2,"pedro","2042250012","pedrito@gmail.com","salta 322",new Coordenada(2, 3));
        Cliente c3=gestorCliente.crearClientes(2,"patricio","2042255512","p@gmail.com","Peron 2",new Coordenada(4, 4));
        
        List<Cliente> listaClientes= new ArrayList<Cliente>();
        
        listaClientes.add(c1);
        listaClientes.add(c2);
        listaClientes.add(c3);

        System.out.print("Clientes filtrados\n");

        List<Cliente> listaClienteFiltradoID=gestorCliente.filterClienteId(listaClientes, 1);
        listaClienteFiltradoID.forEach(vendedor -> System.out.println(vendedor));

        List<Cliente> listaClienteFiltradoNombre=gestorCliente.filterClienteNombre(listaClientes,"pedro");
        listaClienteFiltradoNombre.forEach(vendedor -> System.out.println(vendedor));

        System.out.print("Clientes eliminados\n");

        gestorCliente.deleteClienteId(listaClientes, 1);
        gestorCliente.deleteClienteNombre(listaClientes, "pedro");

        listaClientes.forEach(vendedor -> System.out.println(vendedor));
    }
}
