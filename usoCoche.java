/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estudiojava;

/**
 *
 * @author gueko
 */
import javax.swing.*;
public class usoCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       coche micoche = new coche();
       micoche.establece_color(JOptionPane.showInputDialog("Introduce el color"));
       System.out.println(micoche.dime_datos_generales());
       System.out.println(micoche.dime_color());
       micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
       System.out.println(micoche.dime_asientos());
       micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene asientos de cuero?"));
       System.out.println(micoche.dime_climatizador());
       System.out.println(micoche.dime_peso_coche());
       System.out.println(micoche.precio_coche());
       
       
        
    }
    
}
