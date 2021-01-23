/*2)	Leer 10 números y obtener su cubo y su cuarta
 */
package clase3ejerciciorepetitivos2;

import java.util.Scanner;

public class Clase3ejercicioRepetitivos2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroIngresado = 0, cubo = 0, cuarta = 0;

        for (int x = 1; x <= 10; x++) {
            System.out.println("Ingrese el numero del cual desea conocer su Cubo y su Cuarta");
            numeroIngresado = teclado.nextInt();
            cubo = numeroIngresado * numeroIngresado * numeroIngresado;
            cuarta = cubo * numeroIngresado;
            System.out.println("el cubo es " + cubo + " \nLa cuarta es : " + cuarta);
        }

    }
}
