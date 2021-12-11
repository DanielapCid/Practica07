/**
 * Clase Técnico que heredara la clase Operador 
 * (Se sobreescribira el método toString y se
 *  agregará el método trabaja())
 *
 * @author Daniela Naomi Pereyra Cid
 * @version 1.0 Diciembre/2021
 * */
public class Técnico extends Operador{ //extends indica que Técnico hereda de Operador

    public Técnico(String nombre){
	super(nombre); // super indica que nombre es traido de la clase heredada
    }

    // Método toString (Sobreescribir)
    /**
     * Método especial toString que imprime
     * el estado del objeto de la clase
     *
     *  @return toString
     * */
    @Override
    public String toString(){
	String l = "El técnico: ";
	l += this.nombre;
	return l;
    }

    // Método que imprimira Estoy trabajando
    public void trabaja(){
	System.out.println("Estoy trabajando");
    }
}
	 
