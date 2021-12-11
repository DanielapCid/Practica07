/**
 * Clase Oficial  que heredara la clase Operador 
 * (Se sobreescribira el método toString y se 
 * agregará el  método trabaja())
 *
 * @author Daniela Naomi Pereyra Cid
 * @version 1.0 Diciembre-2021
 * */
public class Oficial extends Operador{ // extends indica que Oficial hereda de Operador
    
    public Oficial(String nombre){
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
	String l = "El oficial: ";
	l += this.nombre;
	return l;
    }

    // Mẃtodo que imprime Estoy trabajando
    public void trabaja(){
	System.out.println("Estoy trabajando");
    }
}
	
