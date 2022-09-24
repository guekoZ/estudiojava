/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estudiojava;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author gueko
 */
public class EstudioJava {

    public static void main(String[] args) {
         Empleados[] misEmpleados = new Empleados[3];
        
        misEmpleados[0]= new Empleados ("Manuel Zuñiga", 7000,19,02,2009);
        misEmpleados[1]= new Empleados ("Norma Bañuelos", 5000,11,03,2010);
        misEmpleados[2]= new Empleados ("Luis", 7000,16,06,2012);
        
        for (int i=0; i<3; i++){
            System.out.println("Nombre:"+ misEmpleados[i].dameNombre()+ "Sueldo:"
                    + misEmpleados[i].dameSueldo() + "Fecha de alta:" + misEmpleados[i].dameFechaContrato());
            System.out.println("Este cambio es para la rama main");
    }   
    
    }
}


class Empleado {
    
    public Empleado (String nom, double sue,int agno, int mes, int dia){
       
        nombre= nom;
        sueldo= sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        altaContrato = calendario.getTime(); 
        
    }
   
    public String dameNombre(){ // getter
        
        return nombre;
    }
    
    public double dameSueldo(){
        return sueldo;
    }
    
    public Date dameFechaContrato(){
        return altaContrato;
    }
  
    
    public void subeSueldo(double porcentaje){
      
        double aumento = sueldo* porcentaje/100;
        sueldo+= aumento;
    }
    
    
    private final String nombre;
    private double sueldo;
    private Date altaContrato;
}
     