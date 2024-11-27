/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasgeometricas.Triangulo;

/**
 *
 * @author USER
 */
public class Triangulo {
     public double Base;
    public double Altura;

    public Triangulo() {
    }

    public Triangulo(double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;

    }

    public void imprimir() {

        System.out.println("La base del triangulo es: " + Base);
        System.out.println("La altura del triangulo es: " + Altura);

    }

    public double calcularArea() {
        return (Base * Altura) / 2;
    }


    public double hipotenusa() {
        return Math.sqrt(Math.pow(Base, 2) + Math.pow(Altura, 2));
    }

    public String Triangulo() {

        if (Base == Altura && Base == hipotenusa()) {
            return "Equilatero";
        } else {
            if (Base == Altura || Base == hipotenusa() || Altura == hipotenusa()) {
                return "Isosceles";
            } else {
                return "Escaleno";
            }
        }
    }

}


