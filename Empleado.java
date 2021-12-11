/**
 *Clase Empleado que hereda a la clase Directivo 
 * y a la clase Operador
 *
 * @author Daniela Naomi Pereyra Cid
 * @version  1.0 Diciembre/2021
 * */

public class Empleado{
    
    // Atributo
    protected String nombre;  

    // Constructores
    // Constructor vacío    
    public Empleado(){
    }

    // Constructor sin argumentos
    public Empleado(String nombre){
	this.nombre = nombre;
    }


    // Métodos get y set    
    /**
     * Método que devuelve el valor
     * nombre del empleado
     *
     * @return nombre - El nombre del empleado
     * */
    public String getNombre(){
	return this.nombre;
    }
    
    /**
     * Método que asigna un nuevo valor a 
     * nombre del empleado
     *
     * @param nombre - El nombre del empleado
     * */
    public void setNombre(String nombre){
	this.nombre = nombre;
    }

    // Método toString

    /**
     * Método toString que imprime el estado 
     * del objeto de la clase
     *
     * @return toString
     * */
    @Override
    public String toString(){
	String l = "El empleado ";
	l += this.nombre;
	return l;
    }

    // Método equals
    /**
     * Método equals que permite comparar
     * si el estado de dos objetos es el mismo
     *
     * @return - comparación de los  objetos
     * */
    @Override
    public boolean equals(Object emp){
	Empleado e  = (Empleado) emp;
	boolean p = false;
	p = this.nombre.equals(e.getNombre());
	return p;
    }
}	    
	
