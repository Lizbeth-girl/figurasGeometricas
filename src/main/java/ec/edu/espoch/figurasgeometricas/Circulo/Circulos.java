/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.Circulo;

/**
 *
 * @author PERSONAL
 */
public class Circulos {
  double pi = 3.1416;
    
    public double radioCirculo;
    
    public double areaCirculo;
    public double perimetroCirculo;

    public Circulos() {
    }

    public Circulos(double radioCirculo) {
        this.radioCirculo = radioCirculo;  
    }
    
    public void imprimir(){
        System.out.println("El valor de radio es: " + radioCirculo);
}
    
    public double calcularArea(){
    return (radioCirculo*radioCirculo)/pi;
    }
    public double calcularPerimetro(){
    return 2*radioCirculo*pi;    
    }   
}
