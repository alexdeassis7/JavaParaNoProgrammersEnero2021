package clase4vectoresejercicio2;

/*2)Llenar dos vectores A y B de 45 elementos cada uno, sumar el elemento uno del
vector A con el elemento uno del vector B y así sucesivamente hasta 45,
almacenar el resultado en un vector C, e imprimir el vector resultante por pantalla.*/
public class Clase4VectoresEjercicio2 {

    public static void main(String[] args) {
        final int CANTIDAD_DE_ELEMENTOS = 45;
        int[] vectorA = new int[CANTIDAD_DE_ELEMENTOS];
        int[] vectorB = new int[CANTIDAD_DE_ELEMENTOS];
        int[] vectorC = new int[CANTIDAD_DE_ELEMENTOS];

        //Cargamos los vectores 'A' y 'B'
        for (int i = 0; i < CANTIDAD_DE_ELEMENTOS; i++) {
            //Genero un numero aleatorio double con random y los casteo a un int
            vectorA[i] = (int) (Math.random() * 10 + 1);
            vectorB[i] = (int) (Math.random() * 10 + 1);
        }
        //Sumamos A + B y Guardamos en C
        for (int i = 0; i < CANTIDAD_DE_ELEMENTOS; i++) {
            vectorC[i] = vectorA[i] + vectorB[i];
        }
        //mostramos el contenido de los vectores A ,B y C
        for (int i = 0; i < CANTIDAD_DE_ELEMENTOS; i++) {
            System.out.println(vectorA[i] + " + " + vectorB[i] + " = " + vectorC[i]);

        }

    }

}
