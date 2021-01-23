/*2) Desarrollar un algoritmo que permita ingresar un número entero
comprendido entre 1 y 10, y que muestre por pantalla si el número es par o impar. */
package condicionalmultipleejercicio2;

import java.util.Scanner;

public class CondicionalMultipleEjercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0;

        System.out.println("Ingrese un numero comprendido entre 1 y 10");
        numeroIngresado = teclado.nextInt();

        if (numeroIngresado >= 1 && numeroIngresado <= 10) {
            switch (numeroIngresado) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                    System.out.println("El numero es Impar");
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                case 10:
                    System.out.println("El numero es Par");
                    break;

            }
        } else {
            System.out.println("El numero ingresado es incorrecto");
        }
    }

}
