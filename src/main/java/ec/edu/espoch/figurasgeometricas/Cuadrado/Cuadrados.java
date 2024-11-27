/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.Cuadrado;

/**
 *
 * @author PERSONAL
 */
public class Cuadrados {
   
      public double ladoCuadrado;
    
    
 public Cuadrados(double cuadrado) {
        this.ladoCuadrado = cuadrado;
    }
    
    public void imprimir(){
    
        System.out.println("Los lados del cuadrado son: " + ladoCuadrado);
    }
    
    public double perimetroCuadrado(){
     
        
        return ladoCuadrado*ladoCuadrado;
    }
    
    public double areaCuadrado(){
    
        return ladoCuadrado*ladoCuadrado*ladoCuadrado*ladoCuadrado;
   
}
}
