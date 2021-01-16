/*1) Desarrollar un algoritmo que permita determinar si un número
ingresado por teclado es positivo o negativo.  */
package clase2condicionaldoble;

import java.util.Scanner;

public class Clase2CondicionalDoble {

    public static void main(String[] args) {
        int numeroingresado = 0;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero distinto de CERO!");
        numeroingresado = teclado.nextInt();

        //Condicional Doble Anidado
        if (numeroingresado > 0) {
            System.out.println("El Numero Ingresado es Positivo!");
        } else if (numeroingresado < 0) {
            System.out.println("El Numero Ingresado es Negativo!");
        } else {
            System.out.println("El Numero Ingresado es CERO!");
        }

    }

}
