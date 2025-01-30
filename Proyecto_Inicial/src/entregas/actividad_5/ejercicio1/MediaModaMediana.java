package entregas.actividad_5.ejercicio1;

// import java.util.Arrays;

public class MediaModaMediana {

    // Ejercicio 1: Sobrecarga de Funciones para Media, Moda y Mediana.

    // Descripción: Crea un programa que implemente una función sobrecargada llamada "calcular" que realice
    // las siguientes operaciones dependiendo del tipo de parámetro recibido:

    // Media (int[]): Calcula la media de un arreglo de números enteros.
    // Moda (double[]): Encuentra el valor más frecuente en un arreglo de números decimales.
    // Mediana (String[]): Determina la mediana (orden alfabético) de un arreglo de cadenas.

    // Requisitos:
    // Implementa tres versiones de la función "calcular" para manejar enteros, decimales y cadenas.
    // Muestra ejemplos para cada caso

    public static void main(String[] args) {
        int[] media = {13, 45, 1, 10, 20};
        double[] moda = {12.0, 12.5, 33.3, 33.3, 23.4, 58.9, 33.3, 58.9, 58.9, 33.3, 24.5};
        String[] mediana = {"salvar", "mueble", "padel", "cine", "lanzamiento"};

        System.out.println("La media es: "+calcular(media));
        System.out.println("La moda es: "+calcular(moda));
        System.out.println("La mediana es: "+calcular(mediana));
    }

    public static double calcular(int[] arreglo) {
        int suma = 0;
        for (int n : arreglo) {
            suma += n;
        }
        return (double) suma/arreglo.length;
    }

    // public static double calcular(double[] arreglo) {
    //     // Bucle for dentro de un do while. Vamos a recorrer el for n veces cada vez. Siendo n = arreglo.length
    //     double moda = arreglo[0]; // En el caso de que no se repita ningún número elegimos el primer valor
    //     int contador = 0;
    //     int[] repite = new int[arreglo.length]; // En este arreglo vamos a ir anotando cuantas veces se repite cada valor
    //     double x; // Utilizamos esta variable para ir comparando
    //     do {
    //         x = arreglo[contador]; // Cada vez que entremos al do while vamos a comparar con un valor del arreglo
    //         for(int i=0; i<arreglo.length; i++) {
    //             if(arreglo[i] == x) {
    //                 repite[contador]++; // Si el valor del arreglo se repite lo anotamos en el arreglo "repite"
    //             }
    //         }
    //         contador++;
    //     } while (contador < arreglo.length);
        
    //     // Cuando ya se haya ejecutado el do while n veces, tenemos que obtener el máximo del arreglo "repite"
    //     int mayor = repite[0]; // asumimos que el primer elemento es el mayor
    //     int posicion = 0; // queremos saber la posición del número mayor
    //     for(int i=1; i<repite.length; i++) {
    //         if(repite[i] > mayor) {
    //             mayor = repite[i];
    //             posicion = i;
    //         }
    //     } // Con este for sabemos en qué posición se encuentra el valor que más se repite
        
    //     moda = arreglo[posicion];
    //     return moda;
    // }

    public static double calcular (double[] numeros) {
        double moda = 0;
        int maxFrecuencia = 0;
        for (int i=0; i<numeros.length; i++) {
            int frecuencia = 0;
            for (int j=i; j<numeros.length; j++) {
                if (numeros[j] == numeros[i]) {
                    frecuencia++;
                }
            }
            if (frecuencia > maxFrecuencia) {
                moda = numeros[i];
                maxFrecuencia = frecuencia;
            }
        }
        return moda;
    }

    // public static String calcular(String[] arreglo) {
    //     Arrays.sort(arreglo); // ordenamos el arreglo alfabéticamente
    //     int n = arreglo.length;
    //     if (n%2 == 1) return arreglo[n/2]; // si el arreglo tiene un numero impar de valores cogemos el del centro
    //     else return arreglo[(n/2)-1]; // si el arreglo tiene un numero par de valores cogemos el primero del centro
    // }

    public static String calcular(String[] palabras) {
        // Ordenamiento por el método burbuja, esto es famoso, no es mío.
        for (int i=0; i<palabras.length-1; i++) {
            for (int j=i+1; j<palabras.length; j++) {
                if (palabras[i].compareTo(palabras[j]) > 0) {
                    String aux = palabras[i];
                    palabras[i] = palabras[j];
                    palabras[j] = aux;
                }
            }
        }
        // Cálculo de la mediana según la cantidad de elementos
        int medio = palabras.length / 2;
        return (palabras.length % 2 == 0) ? palabras[medio-1] : palabras[medio];
    }

}
