/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiojava;

/**
 *
 * @author gueko
 */
public class Furgoneta extends coche{
    private int capacidad_carga;
    private int plazas_extra;
    
 
    public Furgoneta(int capacidad_carga, int plazas_extra){
        super(); //llama al contructor de la clase padre
        
        this.capacidad_carga=capacidad_carga;
        this.plazas_extra= plazas_extra;
    }
  
    public String dimeDatosFurgoneta(){
        return "La capacidad de carga es:" + capacidad_carga + "y las plazas son: " + plazas_extra;
    }
           
    
    
}
