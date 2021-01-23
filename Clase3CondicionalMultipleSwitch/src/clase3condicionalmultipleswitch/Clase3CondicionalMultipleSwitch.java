package clase3condicionalmultipleswitch;

import java.util.Scanner;

/*1) Desarrollar un algoritmo que permita ingresar un número entero
comprendido entre 1 y 7, y que muestre por pantalla el día de la semana al
que se corresponde.*/
public class Clase3CondicionalMultipleSwitch {

    public static void main(String[] args) {
        int numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inicio la app ");
        //soliitamos un numero al user 
        System.out.println("Ingrese por favor un numero entero entre uno y siete");
        numeroIngresado = teclado.nextInt();

        switch (numeroIngresado) {
            case 1:
                System.out.println("El dia es Domingo");
                break;
            case 2:
                System.out.println("El dia es Lunes");
                break;
            case 3:
                System.out.println("El dia es Martes");
                break;
            case 4:
                System.out.println("El dia es Miercoles");
                break;
            case 5:
                System.out.println("El dia es Jueves");
                break;
            case 6:
                System.out.println("El dia es Viernes");
                break;
            case 7:
                System.out.println("El dia es sabado");
                break;
            default:
                System.out.println("El numero ingresado no se correspondo con ningun dia de la semana");

        }
        System.out.println("Fin de la app");

    }

}
