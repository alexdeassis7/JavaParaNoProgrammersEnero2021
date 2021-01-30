package dudaosvaldo;

import java.util.Scanner;

public class DudaOsvaldo {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // int cantMaterias;

        float notaMateria = 0, sumaNotas = 0, promedio = 0, menorNota = 0, mayorNota = 10;
        String nombreMateria, nombreMateriaMenorNota = " ", nombreMateriaMayorNota = " ";
        int cantMaterias = 0, i = 0;

        float[] notas = new float[10];

        String[] materias = new String[10];

        System.out.print("Ingrese Cantidad de Materias: ");
        cantMaterias = teclado.nextInt();

        for (i = 0; i < cantMaterias; i++) {
            System.out.print("Ingrese Nombre de la Materia: ");
            materias[i] = teclado.next();

            System.out.print("Ingrese Nota de " + materias[i] + "  ");
            notas[i] = teclado.nextFloat();
            sumaNotas += notas[i];

        }

        for (i = 0; i < cantMaterias; i++) {
            System.out.println("*********************");
            System.out.println(materias[i] + "   " + notas[i]);

        }

        /* Calculo de la nota menor y la nota mayor*/
        menorNota = notas[0];
        mayorNota = notas[0];
        for (i = 1; i < cantMaterias; i++) {
            if (notas[i] <= menorNota) {
                menorNota = notas[i];
                nombreMateriaMenorNota = materias[i];
            }

            if (notas[i] >= mayorNota) {
                mayorNota = notas[i];
                nombreMateriaMayorNota = materias[i];
            }

        }

        promedio = sumaNotas / cantMaterias;

        System.out.println("****************************************************");
        System.out.println("El Promedio Total es:  " + promedio);

        System.out.println("la nota mas ALTA es: " + nombreMateriaMayorNota + " con una Calificacion de: " + mayorNota);

        System.out.println("la nota mas BAJA es: " + nombreMateriaMenorNota + " con una Calificacion de: " + menorNota);

        {

        }

    }
}
