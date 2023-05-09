/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package valorEspecifico;

/**
 *
 * @author Usuario
 */
//2. Escriba un programa en Java para comprobar si un arreglo contiene un valor específico.
public class valorEspecifico {
    public static void main(String[] args) {
        int[] arreglo = {5, 9, 1, 4, 10};
        int valor = 7;
        boolean contiene = contieneValor(arreglo, valor);
        if (contiene) {
            System.out.println("El arreglo contiene el valor " + valor);
        } else {
            System.out.println("El arreglo no contiene el valor " + valor);
        }
    }

    public static boolean contieneValor(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return true;
            }
        }
        return false;
    }
}

