/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.estudiojava;

/**
 *
 * @author gueko
 */
public class usoEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
       Jefatura jefe_RH = new Jefatura("Manuel",25000, 2009,2,15); 
       jefe_RH.estableceIncentivo(2000);
       
       Empleados[] misEmpleados =  new Empleados[4];
       
       misEmpleados[0]= new Empleados("Pancho", 16000,2001,3,4);
       misEmpleados[1]= new Empleados("Manuel",12000, 2000,6,8);
       misEmpleados[2]= jefe_RH;      //Es donde se implementa el polimorfismo
       misEmpleados[3]= new Jefatura("Norma",26000,2001,10,10 );
       
     for( Empleados e:misEmpleados){
        
          e.subeSueldo(5);
         }  
      
     for( Empleados e:misEmpleados){
        System.out.println("Nombre :" + e.dameNombre()+ "Sueldo :" + e.dameSueldo() +"Fecha de alta:" + e.dameFechaContrato());
              
         }  
        
       
    }
    
}
