/**
 * Clase Operador que heredara la clase Empleado 
 * (Se sobreescribira el método toString)
 *
 * @author Daniela Naomi Pereyra Cid
 * @version 1.0 Diciembre/2021
 * */
public class Operador extends Empleado{ // extends indica que Operador hereda de Empleado

	public Operador(String nombre){
	    super(nombre); // super indica que nombre es traido de la clase heredada
	}
	
	// Método toString (Sobreescribir)
	/**
	 * Método especial toString que imprime
	 * el estado del objeto de la clase
	 *
	 * @return toString
	 * */
	@Override
	public String toString(){
	    String l = "El operador: ";
	    l += this.nombre;
	    return l;
	}
}
    
