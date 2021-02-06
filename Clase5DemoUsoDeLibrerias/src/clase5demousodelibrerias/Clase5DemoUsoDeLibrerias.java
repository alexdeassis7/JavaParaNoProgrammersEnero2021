package clase5demousodelibrerias;

import java.util.*;

public class Clase5DemoUsoDeLibrerias {

    public static void main(String[] args) {
        int[] vec = {10, 5, 2, 3, 10, 30, 23, 20, 10, 10, 5, 20, 15};

        System.out.println("este es mi vector :");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + "-");
        }
        Arrays.sort(vec);

        System.out.println("\nusamos un utilidad de la libreria Arrays del paquete java.util");
        for (int i = 0; i < vec.length; i++) {
            System.out.print(vec[i] + "-");
        }
        System.out.println("\n\n");

        String usuario = "marco";
        String usuario2 = "alex";

        char[] nombre = new char[5];
        nombre[0] = 'a';
        nombre[1] = 'l';
        nombre[2] = 'e';
        nombre[3] = 'x';

        if (usuario.equals(usuario2)) {
            System.out.println("los dos usuarios son iguales ");
        } else {
            System.out.println("los dos usuarios son diferentes");

        }

    }

}
