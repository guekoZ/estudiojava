/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estudiojava;

/**
 *
 * @author gueko
 */
public class usoVehiculo {

    /**
     * En esta clase se puede observar en accion la herencia entre clases, en este caso la se crea 
     * una instancia de forgoneta que hereda de coche
     */
    public static void main(String[] args) {
        
        
       coche micoche1 = new coche();
       micoche1.establece_color("Naranja");
       Furgoneta mifurgoneta1 = new Furgoneta(7, 600);
       mifurgoneta1.establece_color("Azul");
       mifurgoneta1.configura_asientos("si");
       mifurgoneta1.configura_climatizador("Si");
       System.out.println(mifurgoneta1.dime_datos_generales());
    }
    
}
