/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.Rectangulo;

/**
 *
 * @author USER
 */
public class Rectangulo {
    public double Base;
    public double Altura;

    public Rectangulo() {
    }

    public Rectangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }

    

    public void imprimir() {

        System.out.println("La base del rectangulo es: " + Base);
        System.out.println("La altura del rectangulo es: " + Altura);
    }

    public double calcularArea() {
        return Base * Altura;

    }

    public double calcularPerimetro() {
        return 2 * (Base + Altura);

    }
}
