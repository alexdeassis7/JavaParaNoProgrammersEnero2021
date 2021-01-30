package clase4vectores;

import java.util.Scanner;

/*Calcular el promedio de las temperaturas maximas del Mes de agosto */
public class Clase4Vectores {

    public static void main(String[] args) {
        final int CANTIDAD_DE_DIAS = 31; //constante valor inmutable 
        float promedio = 0, sumaTemperaturas = 0;
        Scanner teclado = new Scanner(System.in);
        //defino un vector de 31 elementos float
        float[] tempDeAgosto = new float[CANTIDAD_DE_DIAS];
        //asignacion de datos 
        // tempDeAgosto[4] = 23.3f;
        //utilizamos .length para conocer la cantidad de elementos de un vector
        System.out.println("El array de Temperaturas de agosto posee " + tempDeAgosto.length + " elementos");

        //recorremos el vector con un for 
        for (int indice = 0; indice < tempDeAgosto.length; indice++) {
            System.out.println("Temperatura de Agosto[" + indice + "]=" + tempDeAgosto[indice]);
        }
        System.out.println("Comenzamos a cargar las temperaturas maximas del mes de agosto");
        //cargamos el vector por teclado mediante un for
        for (int i = 0; i < tempDeAgosto.length; i++) {
            System.out.println("Por Favor Ingrese la temperatura del dia " + (i + 1));
            tempDeAgosto[i] = teclado.nextFloat();
        }
        //calculamos el promedio de las temperaturas maximas del mes de agosto
        for (int i = 0; i < tempDeAgosto.length; i++) {
            sumaTemperaturas += tempDeAgosto[i];//acumulo todas las temperaturas en una variable
        }
        promedio = sumaTemperaturas / tempDeAgosto.length;

        System.out.println("El promedio de las temperaturas maximas del mes de agosto es : " + promedio);
    }
}
