/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isi.deso.tp_etapa1.model;

public class Categoria {

    private int id;
    private String descripcion;
    private Item tipo_item;
    
    public Categoria(){
        
    }
    
    public Categoria(int id, String desc, Item tipo_item){
        this.id = id;
        this.descripcion = desc;
        this.tipo_item=tipo_item;
    }
}
