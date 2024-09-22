package isi.deso.tp.service;

import isi.deso.tp.model.Bebida;
import isi.deso.tp.model.Coordenada;
import isi.deso.tp.model.ItemMenu;
import isi.deso.tp.model.Vendedor;
import java.util.ArrayList;
import java.util.List;

public class GestorVendedor {
    // Metodos que deberian ser definido dentro de un GestorVendedor

    public Vendedor crearVendedor(int id, String nombre, String direccion, Coordenada c) {
        return new Vendedor(id, nombre, direccion, c);
    }

    // Filtro de vendedores por parametros
    // Filtro por id
    public List<Vendedor> filterVendedoresId(List<Vendedor> vendedores, int filtroId) {
        List<Vendedor> vendedoresAux = new ArrayList<>();

        for (Vendedor i : vendedores) {
            if (i.getId() == filtroId) {
                vendedoresAux.add(i);
            }
        }

        return vendedoresAux;
    }

    // Filtro por nombre
    public List<Vendedor> filterVendedoresNombre(List<Vendedor> vendedores, String filtroNombre) {
        List<Vendedor> vendedoresAux = new ArrayList<>();

        for (Vendedor i : vendedores) {
            if (i.getNombre().equals(filtroNombre)) {
                vendedoresAux.add(i);
            }
        }

        return vendedoresAux;
    }

    // Eliminacion de vendedores por parametros
    // Eliminacion de vendedores por id
    public void deleteVendedoresId(List<Vendedor> vendedores, int filtroId) {
        vendedores.removeIf(vendedor -> vendedor.getId() == filtroId);
    }

    // Eliminacion de vendedores por nombre
    public void deleteVendedoresNombre(List<Vendedor> vendedores, String filtroString) {
        vendedores.removeIf(vendedor -> vendedor.getNombre().equals(filtroString));
    }

    // Eliminacion de vendedores pasando la posicion del arreglo de vendedores que se quiere eliminar
    public void deleteVendedoresPosicion(List<Vendedor> vendedores, int posicion) {
        vendedores.remove(posicion);
    }

    // getters
    public List<ItemMenu> getItemBebidas(Vendedor vendedor) {
        List<ItemMenu> menuVendedor = vendedor.getMenu();
        List<ItemMenu> aux = new ArrayList<>();

        for (ItemMenu item : menuVendedor) {
            if (item.esBebida()) {
                aux.add(item);
            }
        }

        return aux;
    }

    public List<ItemMenu> getItemComidas(Vendedor vendedor) {
        List<ItemMenu> menuVendedor = vendedor.getMenu();
        List<ItemMenu> aux = new ArrayList<>();

        for (ItemMenu item : menuVendedor) {
            if (item.esComida()) {
                aux.add(item);
            }
        }

        return aux;

    }

    public List<ItemMenu> getItemComidasVeganas(Vendedor vendedor) {
        List<ItemMenu> menuVendedor = vendedor.getMenu();
        List<ItemMenu> aux = new ArrayList<>();

        for (ItemMenu item : menuVendedor) {
            if (item.esComida() && item.aptoVegano()) {
                aux.add(item);
            }
        }

        return aux;

    }

    public List<ItemMenu> getItemBebidasSinAlcohol(Vendedor vendedor) {
        List<ItemMenu> menuVendedor = vendedor.getMenu();
        List<ItemMenu> aux = new ArrayList<>();

        for (ItemMenu item : menuVendedor) {
            if (item.esBebida() && ((Bebida) item).esBebidaAlcoholica()) {
                aux.add(item);
            }
        }

        return aux;
    }

}
