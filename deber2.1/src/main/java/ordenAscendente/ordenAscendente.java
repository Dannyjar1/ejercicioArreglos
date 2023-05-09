/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenAscendente;

/**
 *
 * @author Usuario
 */

//5.  Escriba un programa que reciba un arreglo de números enteros y devuelva verdadero si el arreglo está ordenado en orden ascendente y falso en caso contrario.

public class ordenAscendente {
    public static void main(String[] args) {
        int[] arreglo = {8, 1, 2, 4, 6};
        boolean estaOrdenado = verificarOrden(arreglo);
        System.out.println("El arreglo está ordenado en orden ascendente: " + estaOrdenado);
    }

    public static boolean verificarOrden(int[] arreglo) {
        boolean estaOrdenado = true;
        for (int i = 0; i < arreglo.length - 1; i++) {
            if (arreglo[i] > arreglo[i+1]) {
                estaOrdenado = false;
                break;
            }
        }
        return estaOrdenado;
    }
}

