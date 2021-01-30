/*1)Calcular el promedio de 50 valores almacenados en un Vector. Determinar además
cuantos son mayores que el promedio, imprimir el promedio, el número de datos mayores
que el promedio y una lista de valores mayores que el promedio . */
package clase4vectoresejercicio1;

public class Clase4VectoresEjercicio1 {

    public static void main(String[] args) {
        float[] vectorOriginal = new float[50];
        float[] vectorMayoresAlPromedio;
        float acumuladorDeValores = 0, promedio = 0;
        int cantDatosMayoresAlPromedio = 0;

        //cargamos el vector de maera aleatoria
        for (int i = 0; i < vectorOriginal.length; i++) {
            vectorOriginal[i] = (int) (Math.random() * 10 + 1); //casting Explicito
            acumuladorDeValores += vectorOriginal[i];
        }
        //calculamos el promedio
        promedio = acumuladorDeValores / vectorOriginal.length;
        //determino cuantos valores son mayores que el promedio
        for (int i = 0; i < vectorOriginal.length; i++) {
            if (vectorOriginal[i] > promedio) {
                cantDatosMayoresAlPromedio++;
            }
        }

        vectorMayoresAlPromedio = new float[cantDatosMayoresAlPromedio];

        //cargamos la lista de valores mayores que el promedio 
        int j = 0;
        for (int i = 0; i < vectorOriginal.length; i++) {
            if (vectorOriginal[i] > promedio) {
                vectorMayoresAlPromedio[j] = vectorOriginal[i];
                j++;
            }
        }

        //mostramos el vector ya cargado 
        for (int i = 0; i < vectorOriginal.length; i++) {
            System.out.println("vectorOriginal[" + i + "]=" + vectorOriginal[i]);
        }
        System.out.println("Existen " + cantDatosMayoresAlPromedio + " Datos Mayores Al Promedio");
        System.out.println("El Promedio es : " + promedio);

        //mostramos la lista de los valores mayores al promedio 
        System.out.println("Los DAtos MAyores al promedio son :");
        for (int i = 0; i < vectorMayoresAlPromedio.length; i++) {
               System.out.println("VectorMAyoresAlPromedio[" + i + "]=" + vectorMayoresAlPromedio[i]);
        }
    }

}
