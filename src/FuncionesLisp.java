import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Orlando
 *
 */
public class FuncionesLisp  {
	private HashMap<String,String> funciones = new HashMap<String,String>();
	private HashMap<String,String> variables = new HashMap<String,String>();
	
	
	
	/**
	 * @pre Se utiliza la funcion list en el codigo
	 * @post Crea una lista con los valores que le mete el usuario
	 * @param val
	 * @return La lista ya creada
	 */
	@SuppressWarnings("null")
	public String [] list(String val){
		String[] resultado = new String [1];
		resultado [0] = val;
        return resultado;
    }
	/**
	 * @pre Hay dos valores para evaluar
	 * @post Indica si son iguales o no
	 * @param valorA
	 * @param valorB
	 * @return True si los valores son iguales, False si no lo son
	 */
	public boolean equals(String valorA, String valorB){ //Tenemos 2 genericos y si son iguales regresa true, sino false
        return  valorA.equals(valorB);
    }
	
	/**
	 * @pre Hay dos valores para comparar
	 * @post Indica si se cumple con que el primero sea mayor al segundo
	 * @param valorA
	 * @param valorB
	 * @return True si el primer valor es mayor al segundo, False si no se cumple la condicion
	 */
	public Boolean mayorMenor(int valorA, int valorB ){
        if(valorA > valorB){
            return true;
        }else{
            return false;
        }
	}
	/**
	 * @pre Hay dos valores para comparar
	 * @post Indica si se cumple con que el primero sea menor al segundo
	 * @param valorA
	 * @param valorB
	 * @return True si el primero es menor al segundo, False si no se cumple la condicion
	 */
	public Boolean menorMayor(int valorA, int valorB ){
        if(valorA < valorB){
            return true;
        }else{
            return false;
        }
    }
	/**
	 * @pre La funcion atom esta en el codigo de lisp
	 * @post Regresa True o False dependiendo si es un atom la cadena
	 * @param <E>
	 * @param val
	 * @return True si es un atom, False si no es un atom
	 */
	public <E> boolean atom(E val){
		int contador = 0;
		int contador2 = 0;
		String[] list = null;
		for (int i = 0; i< ((String) val).length(); i++) {						
			if (((String) val).substring(i, i + 1).equals("(")) {
				contador = i;							
			}else if (((String) val).substring(i, i + 1).equals(")"))	{
				contador2 = i;
				break;
			}						
		}
		if (contador > 5) {
			list = list(((String) val).substring(contador + 6, contador2));
		}							
		if (list instanceof String []) {
			return false;
		}else {
			return true;
		}
		
        
    }
	/**
	 * @post Hay una nueva variable
	 * @param key
	 * @param cadena
	 */
	public void setq(String key, String cadena) {
		variables.put(key, cadena);
	}
	
	
	
}

