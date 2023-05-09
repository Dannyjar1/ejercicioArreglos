/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maximoMinimo;

/**
 *
 * @author Usuario
 */
//3. Escriba un programa en Java para encontrar el valor máximo y mínimo de un arreglo.


public class maximoMinimo {
    public static void main(String[] args) {
        int[] arreglo = {0, 14, 11, 1, 21};
        int maximo = encontrarMaximo(arreglo);
        int minimo = encontrarMinimo(arreglo);
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
    }

    public static int encontrarMaximo(int[] arreglo) {
        int maximo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
        }
        return maximo;
    }

    public static int encontrarMinimo(int[] arreglo) {
        int minimo = arreglo[0];
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] < minimo) {
                minimo = arreglo[i];
            }
        }
        return minimo;
    }
}
