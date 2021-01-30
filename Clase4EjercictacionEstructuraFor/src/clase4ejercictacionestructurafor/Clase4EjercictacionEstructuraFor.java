package clase4ejercictacionestructurafor;

import java.util.Scanner;

/*4)Leer 20 números e imprimir cuantos son positivos ,
cuantos negativos y cuantos neutros*/
public class Clase4EjercictacionEstructuraFor {

    public static void main(String[] args) {
        int cantPositivos = 0, cantNeutros = 0, cantNegativos = 0, numeroIngresado = 0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {

            System.out.println("Por favor ingrese un numero " + (i + 1));
            numeroIngresado = teclado.nextInt();

            if (numeroIngresado < 0) 
                cantNegativos++;
             else if (numeroIngresado > 0) 
                cantPositivos++;
            else 
                cantNeutros++  ;
            
        }
        System.out.println("Cantidad de positivos :" + cantPositivos);
        System.out.println("Cantidad de negativos :" + cantNegativos);
        System.out.println("Cantidad de neutros :" + cantNeutros);

    }

}
