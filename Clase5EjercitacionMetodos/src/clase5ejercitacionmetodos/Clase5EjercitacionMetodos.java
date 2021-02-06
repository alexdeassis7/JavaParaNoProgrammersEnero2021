package clase5ejercitacionmetodos;

import java.util.Scanner;

/*Calcular el promedio de 3 notas de un alumo y definicio de la 
condicion final (aprobo o desaprobo)*/
//  subProblema 1 : entrada de datos (nota 1 , nota2 y nota3)
//  subProblema 2 :  * Calculo del promedio
//  sub problema 3 : calcular la condicion del alumno 
// sub problema 4 : salidas de recultado por pantalla
// 
public class Clase5EjercitacionMetodos {

    //Variable Globales : es una variable que puede ser utilizada dentro de cualquier metodo
    static float nota1 = 0, nota2 = 0, nota3 = 0, promedio = 0;
    static Scanner teclado = new Scanner(System.in);
    static String condicionAlumno = "";

    //Algoritmo principal 
    public static void main(String[] args) {
        //invocamos a los sub algoritmos
        solicitarNotas();
        calcularPromedio();
        validarCondicion();
        mostrarResultados();
    }

    //  subProblema 1 : entrada de datos (nota 1 , nota2 y nota3)
    public static void solicitarNotas() {
        System.out.println("Ingrese la nota 1");
        nota1 = teclado.nextFloat();
        System.out.println("Ingrese la nota 2");
        nota2 = teclado.nextFloat();
        System.out.println("Ingrese la nota 3");
        nota3 = teclado.nextFloat();
    }

    //subProblema 2 :  Calculo del promedio
    public static void calcularPromedio() {
        promedio = (nota1 + nota2 + nota3) / 3;
    }

    //  sub problema 3 : calcular la condicion del alumno 
    public static void validarCondicion() {
        if (promedio >= 7) {
            condicionAlumno = "Aprobado";
        } else {
            condicionAlumno = "Desaprobado";
        }
    }

// sub problema 4 : salidas de recultado por pantalla
    public static void mostrarResultados() {
        System.out.println("Las notas del alumno son : " + nota1 + " - " + nota2 + " - " + nota3);
        System.out.println("El Promedio del alumno es: " + promedio);
        System.out.println("La condicion del alumno es : " + condicionAlumno);
    }
}
