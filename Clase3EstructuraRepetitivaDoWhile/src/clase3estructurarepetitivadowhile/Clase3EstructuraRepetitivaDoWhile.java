package clase3estructurarepetitivadowhile;

import java.util.Scanner;

public class Clase3EstructuraRepetitivaDoWhile {

    /**
     * Do while : Esta estructura se utiliza cuando se desea que se ejecute una
     * iteracion antes de comprobar la condicion de repeticion
     */
    public static void main(String[] args) {
//EJERCICIO :
/*1) Desarrollar un algoritmo que permita ingresar 10 números enteros por
teclado y que muestre por pantalla el promedio.*/
        int contador = 1;
        float numeroIngresado = 0, promedio = 0, sumatoria = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese el numero " + contador);
            numeroIngresado = teclado.nextFloat();
            sumatoria += numeroIngresado;
            contador++;//incremento el contador para no caer en un LOOP INFINITO!!!
        } while (contador <= 10);

        promedio = sumatoria / 10;
        System.out.println("El promedio es : " + promedio);

//se ejecute una unica vez
        //se ejecute varias veces
        //puede que nunca se ejecute !
//        while(false){
//            System.out.println("Hola soy un while");
//        }
//        
        // SIempre por lo menos se ejecuta una vez
        //se ejecute varias veces
//        do {
//             System.out.println("Hola soy un Do while");
//        }while(false);
//        
    }

}
