/*Calcular el promedio de 3 notas de un alumo y definicio de la 
condicion final (aprobo o desaprobo)*/
package calse5.subalgoritmos;

import java.util.Scanner;

/**
 * subProblema 1 : entrada de datos (nota 1 , nota2 y nota3) subProblema 2 : *
 * Calculo del promedio sub problema 3 : calcular la condicion del alumno sub
 * problema 4 : salidas de recultado por pantalla
 */
//los sub algoritmos  se clasifican el :
//funciones : retornan un valor
// procedimientos  : No retornan nada!
public class Calse5SubAlgoritmos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int precioProducto = 0, tipoProducto = 0;
        do {
            System.out.println("Ingrese el precio del Producto");
            precioProducto = teclado.nextInt();
        } while (precioProducto <= 0);

        do {
            System.out.println("Que compraste ? \n 1 -Producto de uso comun"
                    + "\n 2- producto electronico ,fruta o verdura ?"
                    + "\n 3- energia electrica y telecomunicaciones");
            tipoProducto = teclado.nextInt();
        } while (tipoProducto < 1 || tipoProducto > 3);

        //invoco a la funcion 
        double valorRetonadoDeLaFuncion = calcularIva(precioProducto, tipoProducto);

        System.out.println("usted debera abonar " + valorRetonadoDeLaFuncion + " pesos por concepto de Impuesto al valor agregado");
        System.out.println("precio final : " + (valorRetonadoDeLaFuncion + precioProducto));
        
        //invocamos al procedimiento Ejecutar ():
        System.out.println("Invocacion 1");
        ejecutar(5);
        System.out.println("Invocacion 2");
        ejecutar(999);
        
        System.out.println("Fin de la app");

    }
    //definimos nuestra primer funcion
    // UNA FUNCION SIEMPRE RETORNA UN VALOR 

    public static double calcularIva(int valorProducto, int tipoDeIva) {
        //cuerpo de mi funcion
        double porcentaje = 0;
        switch (tipoDeIva) {
            case 1:
                porcentaje = 0.21;
                break;
            case 2:
                porcentaje = 0.27;
                break;
            case 3:
                porcentaje = 0.105;
                break;
            default:
                System.out.println("tipo de iva " + tipoDeIva + " Inexistente");
        }
        double resultado = valorProducto * porcentaje;
        return resultado;
    }

    //FUNCION QUE RECIBE UN PARAMETRO INT Y RETORNA UN VALOR DOUBLE 
    public static double calcularIvaElectronica(int valorProducto) {
        //cuerpo de mi funcion
        double porcentaje = 0.27;
        double resultado = valorProducto * porcentaje;
        return resultado;
    }

    //Procedimiento
    public static void ejecutar(int numMaximo) {

        for (int i = 0; i <= numMaximo; i++) {
            System.out.println(i);
        }
    }
}
