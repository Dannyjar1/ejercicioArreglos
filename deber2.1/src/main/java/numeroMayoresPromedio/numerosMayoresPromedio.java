/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeroMayoresPromedio;

/**
 *
 * @author Usuario
 */
//4.  Escriba un programa que reciba un arreglo de números enteros y devuelva la cantidad de números que son mayores que el promedio de todos los números del arreglo.

public class numerosMayoresPromedio {
    public static void main(String[] args) {
        int[] arreglo = {8, 2, 1, 17, 29};
        double promedio = encontrarPromedio(arreglo);
        int cantidadMayores = encontrarMayores(arreglo, promedio);
        System.out.println("El promedio es: " + promedio);
        System.out.println("La cantidad de números mayores es: " + cantidadMayores);
    }

    public static double encontrarPromedio(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        double promedio = (double) suma / arreglo.length;
        return promedio;
    }

    public static int encontrarMayores(int[] arreglo, double promedio) {
        int cantidadMayores = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > promedio) {
                cantidadMayores++;
            }
        }
        return cantidadMayores;
    }
}
