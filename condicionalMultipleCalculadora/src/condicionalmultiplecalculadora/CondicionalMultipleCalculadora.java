package condicionalmultiplecalculadora;

import java.util.Scanner;

public class CondicionalMultipleCalculadora {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcionIngresada = 0;

        System.out.println("Ingrese una opcion: ");
        System.out.println(" 1- SUMAR \n 2- RESTAR \n 3- MULTIPLICAR");
        opcionIngresada = teclado.nextInt();

        if (opcionIngresada >= 1 && opcionIngresada <= 3) {
            float numero1 = 0, numero2 = 0, resultado = 0;
            System.out.println("Ingrese el numero 1");
            numero1 = teclado.nextFloat();
            System.out.println("Ingrese el numero 2");
            numero2 = teclado.nextFloat();

            switch (opcionIngresada) {
                case 1:
                    resultado = numero1 + numero2;
                    break;
                case 2:
                    resultado = numero1 - numero2;
                    break;
                case 3:
                    resultado = numero1 * numero2;
                    break;
            }
            System.out.println("El resultado es : " + resultado);
        } else {
            System.out.println("La opcion ingresada es invalida");
        }
    }

}
