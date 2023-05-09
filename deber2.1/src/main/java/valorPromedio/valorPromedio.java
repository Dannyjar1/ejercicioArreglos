/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorPromedio;

/**
 *
 * @author Usuario
 */
//1. Escriba un programa en Java para calcular el valor promedio de los elementos de un arreglo.

public class valorPromedio {
    public static void main(String[] args) {
        int[] arreglo = {9, 3, 12, 2, 1};
        double promedio = calcularPromedio(arreglo);
        System.out.println("El promedio es: " + promedio);
    }

    public static double calcularPromedio(int[] arreglo) {
        int total = 0;
        for (int i = 0; i < arreglo.length; i++) {
            total += arreglo[i];
        }
        double promedio = (double) total / arreglo.length;
        return promedio;
    }
}

