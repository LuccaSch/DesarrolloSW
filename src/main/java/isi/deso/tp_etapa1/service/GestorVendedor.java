package isi.deso.tp_etapa1.service;

import java.util.ArrayList;
import java.util.List;

import isi.deso.tp_etapa1.model.Coordenada;
import isi.deso.tp_etapa1.model.Vendedor;

public class GestorVendedor {
    //Metodos que deberian ser definido dentro de un GestorVendedores

    public Vendedor crearVendedor(int id,String nombre,String direccion,Coordenada c){
        return new Vendedor(id,nombre,direccion,c);
    }

    //Filtro de vendedores
    
    //filtro por ID
    public List<Vendedor> filterVendedoresId(List<Vendedor> vendedores, int filtroId){
        List<Vendedor> vendedoresAux = new ArrayList<>();

        for(Vendedor i: vendedores){
            if(i.getId()==filtroId){
                vendedoresAux.add(i);
            }
        }
        return vendedoresAux;
    }

    //filtro por Nombre
    public List<Vendedor> filterVendedoresNombre(List<Vendedor> vendedores, String filtroNombre){
        List<Vendedor> vendedoresAux = new ArrayList<>();

        for(Vendedor i: vendedores){
            if(i.getNombre().equals(filtroNombre)){
                vendedoresAux.add(i);
            }
        }
        return vendedoresAux;
    }

    //Eliminacion de vendedores por parametro

    //Eliminacion de vendedores por ID
    public void deleteVendedoresId(List<Vendedor> vendedores, int filtroId){
        vendedores.removeIf(vendedor -> vendedor.getId()==filtroId);
    }
    //Eliminacion de vendedores por Nombre
    public void deleteVendedoresNombre(List<Vendedor> vendedores, String filtroString){
        vendedores.removeIf(vendedor -> vendedor.getNombre().equals(filtroString));
    }
    //Eliminacion de vendedores pasando la posicion del arreglo de vendedores que se quiere eliminar
    public void deleteVendedoresPosicion(List<Vendedor> vendedores, int posicion){
        vendedores.remove(posicion);
    }
}
