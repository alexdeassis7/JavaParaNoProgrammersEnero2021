package consultaosvaldo;

import java.util.Scanner;

public class ConsultaOsvaldo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float precioLaptop = 0, cantidad = 0, totalAPagar = 0;
        System.out.println("Ingrese valor de la Laptop");
        precioLaptop = teclado.nextFloat();

        System.out.println("Ingrese cantidad de  Laptop");
        cantidad = teclado.nextFloat();
        if (cantidad < 3) {
            totalAPagar = (precioLaptop * cantidad) * 0.90f;
            System.out.println("Total a Pagar: " + totalAPagar);
        } else {
            totalAPagar = (precioLaptop * cantidad) * 0.80f;
            System.out.println("Total a Pagar: " + totalAPagar);
        }

    }

}
