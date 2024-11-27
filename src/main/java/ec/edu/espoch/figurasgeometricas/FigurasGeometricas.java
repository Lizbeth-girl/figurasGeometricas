/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.Circulo.Circulos;
import ec.edu.espoch.figurasgeometricas.Cuadrado.Cuadrados;

/**
 *
 * @author PERSONAL
 */
public class FigurasGeometricas {

    public static void main(String[] args) {

        Circulos objCirculo = new Circulos();

        objCirculo.radioCirculo = 4;
        objCirculo.imprimir();

        System.out.println("El area del circulo es: " + objCirculo.calcularArea());

        System.out.println("El perimetro es: " + objCirculo.calcularPerimetro());

        Cuadrados objCuadrado = new Cuadrados(2);

        objCuadrado.ladoCuadrado = 5;

        objCuadrado.imprimir();

        objCuadrado.perimetroCuadrado();

        System.out.println("El perimetro cuadrado es: " + objCuadrado.perimetroCuadrado());

        objCuadrado.areaCuadrado();

        System.out.println("El area del cuadrado es: " + objCuadrado.areaCuadrado());

    }

}
