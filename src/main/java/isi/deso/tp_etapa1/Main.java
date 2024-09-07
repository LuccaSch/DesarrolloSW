/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package isi.deso.tp_etapa1;

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
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Creando el gestor vendedor
        GestorVendedor gestorVendedor = new GestorVendedor();

        // Creando los 3 vendedores
        Vendedor vendedor1 = gestorVendedor.crearVendedor(1, "Roticeria Pampita", "San Luis 3402", new Coordenada(1, 2));

        // Creando 3 categorias
        Categoria catego1 = new Categoria(1, "Carnes", Item.Plato);
        Categoria catego2 = new Categoria(2, "Verduras", Item.Plato);
        Categoria catego3 = new Categoria(3, "SinGas", Item.Bebida);

        // Creando 3 platos
        Plato plato1 = new Plato(1, "Pollo al disco", "Pollo en un disco", 8000.00, 200, true, false, catego1, 800.00);
        Plato plato2 = new Plato(2, "Carne asada", "Carne asada", 9000.00, 200, true, false, catego1, 700.00);
        Plato plato3 = new Plato(3, "Hamburgesa vegana", "De lentejas", 10000.00, 50, true, true, catego2, 500.00);

        // Creando 2 bebidas
        BebidaSinAlcohol bebida1 = new BebidaSinAlcohol(1, "Agua", "Agua de manantial", 1000.00, catego3, Tamano.Chica, 500);
        BebidaAlcoholica bebida2 = new BebidaAlcoholica(2, "Fernet", "Fernet Branca", 15000.00, catego3, Tamano.Mediana, 1000, 45);

        // Creando items
        vendedor1.agregarItem(plato1);
        vendedor1.agregarItem(plato2);
        vendedor1.agregarItem(plato3);
        vendedor1.agregarItem(bebida1);
        vendedor1.agregarItem(bebida2);

        // Obteniendo bebidas, comidas, comidas veganas y bebidas sin alcohol
        List<ItemMenu> bebidas = gestorVendedor.getItemBebidas(vendedor1);
        List<ItemMenu> comidas = gestorVendedor.getItemComidas(vendedor1);
        List<ItemMenu> comidasVeganas = gestorVendedor.getItemComidasVeganas(vendedor1);
        List<ItemMenu> bebidasSinAlcohol = gestorVendedor.getItemBebidasSinAlcohol(vendedor1);

        // Mostrando bebidas, comidas, comidas veganas y bebidas sin alcohol
        System.out.println("Mostrando Bebidas");
        bebidas.forEach(bebida -> System.out.println(bebida));

        System.out.println("Mostrando Comidas");
        comidas.forEach(comida -> System.out.println(comida));

        System.out.println("Mostrando Comidas Veganas");
        comidasVeganas.forEach(comidaV -> System.out.println(comidaV));

        System.out.println("Mostrando Bebidas Sin Alcohol");
        bebidasSinAlcohol.forEach(bebidaSA -> System.out.println(bebidaSA));

    }
}
