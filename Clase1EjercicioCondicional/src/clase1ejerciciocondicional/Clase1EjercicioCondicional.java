package clase1ejerciciocondicional;

import java.util.Scanner;

/*Una Tienda Ofrece un descuento del 15% sobre el total de la compra y un 
cliente desea saber cuanto debera pagar finalmente por su compra*/
       
public class Clase1EjercicioCondicional {

    public static void main(String[] args) {
        System.out.println("Inicio de la app");
        //defino mis variables de trabajo 
        float descuento = 0 ,totalAPagar = 0, totalCompra = 0;
        //definir un teclado para tomar datos
        Scanner teclado = new Scanner(System.in);
        //que entra?
        System.out.println("Ingrese el total de la compra :");
        totalCompra = teclado.nextFloat();
        
        //System.out.println("El dato ingresado es " + totalCompra);
        //que se procesa ?
        descuento = totalCompra * 0.15f; 
        totalAPagar = totalCompra - descuento;
                
        //que sale ?
        System.out.println("El total a pagar con el descuento es de " + totalAPagar + " dolares");
        
        
        System.out.println("fin de la app");
    }
    
}
