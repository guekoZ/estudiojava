/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiojava;

/**
 *
 * @author gueko
 */
public class Jefatura extends Empleados{
   
    private double incentivo;
        public Jefatura (String nom, double sue, int agno, int mes, int dia){
            
            super(nom, sue,agno,mes,dia);//Se tiene que llamar el contructor de la clase pares y se utliza metodo super()
        }
        
    public void estableceIncentivo(double b){
        incentivo=b;
    }
                
    @Override
    public double dameSueldo(){
      
        double sueldoJefe=super.dameSueldo();
      
      return sueldoJefe+incentivo;
        
    }
            
        
        
}
