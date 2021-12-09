/**
 * Clase Bubblesort para implementa el algoritmo
 * Bubblesort en java para arreglos que nos permitira
 * crear y ordenar números aleatorios
 *
 * @author  Daniela Naomi Pereyra Cid
 * @version 1.0 - Diciembre 2021 
 * */
import java.util.Random; // Se hará uso del código de la clase Aleatorio como apoyo

public class Bubblesort{

    /**
     * Método principal donde se tiene lo esencial 
     * para la creación de números y ordenarlos
     *
     * @param Arreglo args - Los argumentos
     * */
    public static void main (String[] args){
	// Código para generar números de manera aleatoria(random)
	Random rnd = new Random();
	// Crear arreglo con la cantidad de elementos que se quieran
	int [] arr = new int[100000]; // Arreglo de 100,000 elementos
	    System.out.println("Números aleatorios; "); // Imprime números aleatorios

	// Se crea un for para que los números generados sean en uun rango de 1-100 de manera al azar
	for (int i = 0; i < arr.length; i ++){
	    arr[i] = rnd.nextInt(100);
	}

	// For que imprimira los 100,000 elementos uno por uno
	for (int i = 0; i < arr.length; i++){
	    System.out.print(arr[i] + ", ");
	}
	
	System.out.println("\nResultado de los números ordenados con Bubblesort");
      bubblesort(arr);
      // For para imprimir los 100,000 números/elementos ordenadamente
      for (int i = 0; i < arr.length; i++){
          System.out.print(arr[i] + ", ");
      }
    }

    // Arreglo Bubblesort para ordenar números

    /**
     * Arreglo para ordenar números de forma ordenada
     *
     * @param arr - Arreglo para ordenar  
     * */
    public static void bubblesort(int[] arr){
	// For que sirve para saber cuantas vueltas tiene que dar el programa
	for (int i = 0; i < arr.length; i++){
	    // For para ordenar el arreglo y para ir intercalando los números con un condicional dentro de este
	    for (int j = 0; j < arr.length - 1; j++){
		// Se intercambia el valor en el caso que el arr[j] sea mayor a arr[j+1]
		if (arr[j] > arr[j + 1]){
		    arr[j] = arr[j] + arr[j+1];
		    arr[j+1] = arr[j] - arr[j+1];
		    arr[j] = arr[j] - arr[j+1];
		}
	    }
	}
    }
}
