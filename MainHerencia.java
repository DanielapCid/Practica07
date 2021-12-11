/**
 * Clase MainHerencia para ejecutar 
 * las clases relacionadas a herencia  
 * 
 * @author Daniela Naomi Pereyra Cid
 * @version 1.0 Diciembre/2021
 * */
public class MainHerencia{
    
    /**
     * Método principal main donde ejecutamos
     * los parámetros 
     *
     * @param args - Los argumentos
     * */
    public static void main(String[] args){
	 
	// Creación de objetos
	Empleado a = new Empleado("Kevin");
	Operador b = new Operador("Omar");
	Directivo dx= new Directivo("Bruno");
	Oficial dy= new Oficial("Pablo");
	Técnico dz= new Técnico("Yisus");

	// Imprimimos toString de a(Empleado)
	System.out.println(a.toString());
	// Imprimimos toString de b(Operador)
	System.out.println(b.toString());
	// Se ejecuta el método equals entre a y b y se imprime el resultado
	System.out.println(a.equals(b));

	// Imprimimos toString de dx(Directivo)
	System.out.println(dx.toString());
	// Imprimimos toString de dy(Oficial)
	System.out.println(dy.toString());
	// Imptimimos el método trabaja de dy(Oficial)
	dy.trabaja();
	// Imprimimos toString de dz(Técnico)
	System.out.println(dz.toString());
	// Imprimimos el método trabaja de dz(Técnico)
	dz.trabaja();
    }
}


	
			   
				

	
	
