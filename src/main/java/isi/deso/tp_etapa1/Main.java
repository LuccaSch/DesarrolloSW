/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package isi.deso.tp_etapa1;

import java.util.List;

import isi.deso.tp_etapa1.model.BebidaAlcoholica;
import isi.deso.tp_etapa1.model.BebidaSinAlcohol;
import isi.deso.tp_etapa1.model.Categoria;
import isi.deso.tp_etapa1.model.Coordenada;
import isi.deso.tp_etapa1.model.Item;
import isi.deso.tp_etapa1.model.ItemMenu;
import isi.deso.tp_etapa1.model.Plato;
import isi.deso.tp_etapa1.model.Tamano;
import isi.deso.tp_etapa1.model.Vendedor;
import isi.deso.tp_etapa1.service.GestorVendedor;

public class Main {

    public static void main(String[] args) {
        GestorVendedor gestorVendedor = new GestorVendedor();

        // Creando los 3 vendedores
        Vendedor v1 = gestorVendedor.crearVendedor(1, "Roticeria Pampita", "San luis 34", new Coordenada(1, 2));
        
        //int calorias, boolean aptoCeliaco, boolean aptoVegano, double peso, int id, String nombre, String descripcion, double precio
        
        
        Categoria cat1= new Categoria(1,"Carnes",Item.Plato);
        Categoria cat2= new Categoria(2,"Verduras",Item.Plato);
        Categoria cat3= new Categoria(3,"SinGas",Item.Bebida);



        Plato plato1 = new Plato(1, "Pollo al disco", "pollo en un disco", 8000.00, 200, true, false,cat1,800.00);
        Plato plato2 = new Plato(2, "Carne asada", "Carne asada", 9000.00, 200, true, false,cat1,700.00);
        Plato plato3 = new Plato(3, "Hamburgesa vegana", "De lentejas", 10000.00, 50, true, true,cat2,500.00);

        BebidaSinAlcohol bebida1= new BebidaSinAlcohol(1,"Agua","Agua de manantial", 1000.00, cat3,Tamano.Chica, 500);
        BebidaAlcoholica bebida2= new BebidaAlcoholica(2,"Fernet","Fernet Branca", 15000.00, cat3,Tamano.Mediana, 1000,45);

        v1.agregarItem(plato1);
        v1.agregarItem(plato2);
        v1.agregarItem(plato3);
        v1.agregarItem(bebida1);
        v1.agregarItem(bebida2);

        List<ItemMenu> bebidas = gestorVendedor.getItemBebidas(v1);
        List<ItemMenu> comidas = gestorVendedor.getItemComidas(v1);
        List<ItemMenu> comidasVeganas = gestorVendedor.getItemComidasVeganas(v1);
        List<ItemMenu> bebidasSinAlcohol = gestorVendedor.getItemBebidasSinAlcohol(v1);
        

        
        //mostrando bebidas y comidas
        System.out.println("Mostrando Bebidas");
        bebidas.forEach(bebida -> System.out.println(bebida));

        System.out.println("Mostrando Comidas");
        comidas.forEach(comida -> System.out.println(comida));

        System.out.println("Mostrando Comidas Veganas");
        comidasVeganas.forEach(comidaV -> System.out.println(comidasVeganas));

        System.out.println("Mostrando Bebidas Sin Alcohol");
        bebidasSinAlcohol.forEach(bebidaSA -> System.out.println(bebidasSinAlcohol));
        
    }
}
