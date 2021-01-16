package clase2;

import java.util.Scanner;

public class Clase2 {

    public static void main(String[] args) {
        //Ejercicio Secuencial 2
//        Un Maestro desea saber que porcentaje de hombre y que porcentaje de mujeres
//        hay en un grupo de estudiantes                

        //defino mis variables de trabajo 
        float numHombres = 0 , numMujeres = 0, totalAlumnos = 0, porcentajeH = 0, porcentajeM = 0;
        Scanner teclado = new Scanner(System.in);
//        que entra ?
        System.out.println("Ingrese la cantidad de mujeres del grupo");
        numMujeres = teclado.nextFloat();

        System.out.println("Ingrese la cantidad de Hombres del grupo");
        numHombres = teclado.nextFloat();
//        que se procesa ?
        totalAlumnos = numHombres + numMujeres;
        porcentajeH = numHombres * 100 / totalAlumnos;
        porcentajeM = numMujeres * 100 / totalAlumnos;
        
//        que sale ?
        System.out.println("El porcentaje de mujeres es : " + porcentajeM);
        System.out.println("El porcentaje de Hombres es : " + porcentajeH);


    }

}

//Tipos de operadores :
//1)Aritmeticos : + ,- ,* , /  Math
//
//2)Relacionales :
//        > Mayor que 
//        < Menor que 
//        >= Mayor o igual que 
//        <= Menor o igual que 
//        != distinto 
//        == igual 
//numero = 7   true or false
//Ejemplos :
//    si a = 10 , b = 20 y c = 30 
//     a + b > c   -> False  
//     a - b < c   -> True
//     a - b == c  -> False
//     a * b!= c   -> True 
//
//3)Logicos
//    Ejercicio :
//
//    si a = 10 , b = 20 y c = 30 
//    ( a < b ) AND ( b < c ) 
//        V     AND     V
//               V
//
//***********************************************************
//si a = 10 , b = 12 , c = 13 y d 10
//
//ej1)  ((a > b) OR (a < c))  AND  ((a == c ) OR (a >= b))
//        (  F   OR     V  )  AND    (   F    OR     F )
//                V           AND              F
//                             F
//
//ej2) ((a >= b) OR (a < d)) AND ((a >= d) AND (c > d))
//          (F   OR    F)    AND    (    V    AND     V )
//                F          AND         V     
//                            F
//
//ej3) NOT (a == c) AND (c > b)
//       NOT(   F ) AND    V 
//              V   AND   V
//                   V
//
//Prioridad de los operadores en Gral  :
// 1 .  ()
// 2 .  * /  NOT
// 3 .  + - AND
// 4 .  > , < , >= , <= , != , == , OR

