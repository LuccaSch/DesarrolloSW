package isi.deso.tp_etapa1.service;

import java.util.ArrayList;
import java.util.List;

import isi.deso.tp_etapa1.model.Cliente;
import isi.deso.tp_etapa1.model.Coordenada;

public class GestorCliente {
    //Metodos que deberian ser definido dentro de un GestorClientes

    public Cliente crearClientes(int id,String nombre, String cuit, String email, String direccion, Coordenada coordenada){

        return new Cliente(id,nombre,cuit,email,direccion,coordenada); 
        
    }

    //Filtro de clientes

    //filtro por ID
    public List<Cliente> filterClienteId(List<Cliente> clientes, int filtroId){
        List<Cliente> clientesAux = new ArrayList<>();

        for(Cliente i: clientes){
            if(i.getId()==filtroId){
                clientesAux.add(i);
            }
        }
        return clientesAux;
    }

    public List<Cliente> filterClienteNombre(List<Cliente> clientes, String filtroNombre){
        List<Cliente> clientesAux = new ArrayList<>();

        for(Cliente i: clientes){
            if(i.getNombre().equals(filtroNombre)){
                clientesAux.add(i);
            }
        }
        return clientesAux;
    }

    //Eliminacion de cliente por ID
    public void deleteClienteId(List<Cliente> clientes, int filtroId){
        clientes.removeIf(cliente -> cliente.getId()==filtroId);
    }

    //Eliminacion de cliente por Nombre

    public void deleteClienteNombre(List<Cliente> clientes, String filtroNombre){
        clientes.removeIf(cliente -> cliente.getNombre().equals(filtroNombre));
    }
    
    //Eliminacion de cliente pasando la posicion del arreglo de vendedores que se quiere eliminar
    public void deleteClientePorPosicion(List<Cliente> clientes, int posicion){
        clientes.remove(posicion);
    }
}
