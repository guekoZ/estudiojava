/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiojava;

/**
 *
 * @author gueko
 */
public class coche {
    private int ruedas;
    private int largo;
    private int ancho;
    private int motor;
    private int peso_plataforma;
    private String color;
    private int peso_total;
    private boolean asientos_cuero, climatizador;
            
  public coche()
  {
     ruedas=4;
     largo=2000;
     ancho=300;
     motor=1600;
     peso_plataforma=500;
          
  }          
    
  
  public String dime_datos_generales(){ //Getter
      return "La plataforma del vehiculo tiene" + ruedas + "ruedas" + "Mide" + largo/1000 
              + "metros de ancho" + ancho + "cm y un peso de la plataforma de "  + peso_plataforma + "kg"; 
  }
       
 
  public void establece_color(String color_coche)
  {
      color=color_coche;
  }
  
  public String dime_color()
  {
      return "El color es: "+ color;
  }
  
  public void configura_asientos(String asientos_cuero)
  {
      if (asientos_cuero.equalsIgnoreCase("si"))
      {
          this.asientos_cuero=true;
      }
      else
      {
          this.asientos_cuero=false;
      }
  }
  
  public void configura_climatizador(String climatizador)
  {
      if (climatizador.equalsIgnoreCase("si"))
      {
          this.climatizador=true;
      }
      else
      {
          this.climatizador=false;
      }
  }
  
  public String dime_asientos()
  {
   if (asientos_cuero== true)  
   {
       return "El asientos son de cuero";
   }
   else{
       return "El asientos no son de cuero";
   }
  }
  
  
 public String dime_climatizador(){
     
     if(climatizador==true)
     {
         return "El coche tiene climatizador";
     }
     else{
         return "El coche no tiene climatizador";
     }
 } 
   
 public String dime_peso_coche(){
     int peso_carroseria =  500;
     peso_total= peso_plataforma+ peso_carroseria;
     if (asientos_cuero==true){
         peso_total=peso_total+50;
     }
     if (climatizador==true){
         peso_total=peso_total+20;
     }
              
     return "El peso total del coche es: " + peso_total;
 }
  
 
 
 public int precio_coche()
         {
             int precio_final=10000;
             
             if (asientos_cuero==true){
                 precio_final+=2000;
                 
             }
             if (climatizador == true)
                              {
                 precio_final+=1500;
             }
             return precio_final;
         }
 
}
