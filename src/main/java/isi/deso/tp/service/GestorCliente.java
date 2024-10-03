package isi.deso.tp.service;

import java.util.ArrayList;
import java.util.List;

import isi.deso.tp.model.Cliente;
import isi.deso.tp.model.Coordenada;

public class GestorCliente {

    public Cliente crearClientes() {
        return new Cliente();
    }

    public Cliente crearClientes(int id, String nombre, String cuit, String email, String direccion, Coordenada coordenada) {
        return new Cliente(id, nombre, cuit, email, direccion, coordenada);
    }

    // Filtrado de clientes por parametros
    // Filtro por Id
    public List<Cliente> filterClienteId(List<Cliente> clientes, int filtroId) {
        List<Cliente> clientesAux = new ArrayList<>();

        for (Cliente i : clientes) {
            if (i.getId() == filtroId) {
                clientesAux.add(i);
            }
        }

        return clientesAux;
    }

    // Filtro por Nombre
    public List<Cliente> filterClienteNombre(List<Cliente> clientes, String filtroNombre) {
        List<Cliente> clientesAux = new ArrayList<>();

        for (Cliente i : clientes) {
            if (i.getNombre().equals(filtroNombre)) {
                clientesAux.add(i);
            }
        }

        return clientesAux;
    }

    // Eliminacion de clientes por parametros
    // Eliminacion de Cliente por Id
    public void deleteClienteId(List<Cliente> clientes, int filtroId) {
        clientes.removeIf(cliente -> cliente.getId() == filtroId);
    }

    // Eliminacion de Cliente por Nombre
    public void deleteClienteNombre(List<Cliente> clientes, String filtroNombre) {
        clientes.removeIf(cliente -> cliente.getNombre().equals(filtroNombre));
    }

    // Eliminacion de Cliente pasando la Posicion del arreglo de vendedores que se quiere eliminar
    public void deleteClientePorPosicion(List<Cliente> clientes, int posicion) {
        clientes.remove(posicion);

    }
}
