/**
 * Clase Quicksort para implementar el algoritmo Quicksort
 * en java para arreglos que nos permitira ordenar números
 *
 * @author Daniela Naomi Pereyra Cid
 * @version 1.0 - Diciembre 2021
 * */
import java.util.Random;
public class Quicksort{
    
    /**
     * Método principal que tendrá las variables necesarias
     * para crear y ordenar números
     *
     * @param - arreglo
     * @param - izquierda
     * @param - derecha
     * */
    public static void quicksort(int[] vector, int izquierda, int derecha){
	// pivote
	int pivote = vector[izquierda];

	/** Los elementos > van a la derecha del pivote, los < a su izquierda
	 * esta parte es el motor del ordenamiento, se utilizan 
	 * variables auxiliares:
	 * i para los elemento de la izquierda del pivote
	 * j para los elementos de la derecha del pivote
	 * */
	int i = izquierda;
	int j = derecha;

	// Variable auxiliar en la que se devera tener un alcance menor pero se respeta la implementación
	int auxIntercambio;

	// while donde mientras i sea menor a j para ubicar el nuevo pivote
	while (i < j){
	    // Mientras que vector[i] sea menor o igual al pivote, se aumentael valor de i
	    // cuando este se detenga, el elemento en vector[i] es mayor al pivote
	    // y deberá ir a su derecha
	    while (vector[i] <= pivote && i < j){
		i++;
	    }
	    // Mientras que vector[j] sea mayor al pivote, se disminuye el valor de j
	    // cuando este se detenga. el elemento en vector[j] es menor o igual a pivote
	    // y deberá ir a su izquierda
	    while (vector[j] > pivote){
		j--;
	    }
	    // Siempre y cuando i sea menor a j
	    // se hace un cambio de los elementos puestos que el elemento vector[i] debe ir a la derecha 
	    // y vector[j] a la izquierda	    
	    if (i < j){
		// OJO.Ya que no tiene otro alcance auxIntercambio podría estar declarada aquí
		auxIntercambio = vector[i];
		vector[i] = vector[j];
		vector[j] = auxIntercambio;
	    }
	}
	
	// Actualizamos la posición del pivote de j ya que por los anteriores ciclos,
	// j llegó a una posición donde su elemento (i.e. vector[j]) es menor o igual al pivote
	// Entonces se manda vector[j] a la ubicación del pivote
	// y viceversa ( el pivote a la posición vector[j])
	vector[izquierda] = vector[j];
	vector[j] = pivote;

	// Aplicar el mismo proceso para A1 y A2
	if (izquierda < j - 1){
	    // Quicksort aplicado a A1
	    quicksort (vector, izquierda, j - 1);
	}
	if (j + 1 < derecha){
	    // Quicksort aplicado a A2
	    quicksort(vector, j + 1, derecha);
	}
    }
    
    /**
     * Método Main donde se ejecutaran los parámetros
     * de la clase
     *
     * @param args - Los argumentos
     * */
    public static void main (String[] args){
	
	// Creación de un arreglo con n número de elementos que se desee generar
	int[] numeros = new int[100000];
	// Utilización de Random para generar números de manera aleatoria
	Random rnd = new Random();
	System.out.println("Números aleatorios"); // Imprimimos un mensaje

	// For con el cual se realizaran los 100,000 números generados, sean de un rango del 1-100
	for (int i = 0; i < numeros.length; i++){
	    numeros[i] = rnd.nextInt(100);
	    System.out.print(numeros[i] + ", ");
	}

	Quicksort.quicksort(numeros, 0, numeros.length - 1);
	System.out.println("\nResultado de los números ordenados con QuickSort");
	// For para imprimir los 100,000 elementos númericos 
	for (int n : numeros){
	    System.out.print(n + ", ");
	}
    }
}

    
