package clase3estructurarepetitivamientras;

import java.util.Scanner;

/*Calcular la temperatura promedio del mes de Enero */
public class Clase3EstructuraRepetitivaMientras {

    public static void main(String[] args) {
        int cantidadDeDias = 31;
        float temperaturaMaximaDelDia = 0, sumariaDeTemperaturas = 0, promedio = 0;
        Scanner teclado = new Scanner(System.in);
        int dia = 1;

        while (dia <= cantidadDeDias) {
            System.out.println("Ingrese la temperatura maxima del dia " + dia);
            temperaturaMaximaDelDia = teclado.nextFloat();
//            sumariaDeTemperaturas = sumariaDeTemperaturas + temperaturaMaximaDelDia;
            sumariaDeTemperaturas += temperaturaMaximaDelDia;
            dia++;
        }
        
        promedio = sumariaDeTemperaturas / cantidadDeDias;

        System.out.println("Le promedio de temperatura maximas es de : " + promedio);

        /*MOSTRAMOS LOS NUMEROS DE 1 AL 100
        int contador = 1 ;        
        while(contador <= 100){
            //cuerpo del while(Bucle)
            System.out.println("numero :" + contador); 
            contador++;
        }
         */
    }

}
