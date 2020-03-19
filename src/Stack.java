import java.util.Vector;

/**
 * 
 * @author Diana Zaray Corado #191025 && Javier Alejandro Cotto #19324
 * @version 30/01/2020
 * Implementacion de Stack
 *
 */
public class Stack<E>  implements iStack<E>{

	private Vector<E> vector = new Vector<E>();
	
	@Override
	/**
	 * Push
	 * @param E item
	 * Agregar un nuevo elemento al stack
	 * 
	 */
	public void push(E item) {
		// TODO Auto-generated method stub
		vector.add(item);
		
	}

	@Override
	/**
	 * Pop
	 * Retira el ultimo elemento del stack
	 * @return E ultimo
	 */
	public E pop() {
		// TODO Auto-generated method stub
		return vector.remove(size()-1);
	}

	@Override
	/**
	 * Peek
	 * Muestra el elemento que se encuentra en la ultima posicion en el stack
	 * @return E multimo
	 */
	public E peek() {
		// TODO Auto-generated method stub
		return vector.get(size()-1);
	}
	
	@Override
	/**
	 * Size
	 * Devuelve el tamanio del stack
	 * @return int size
	 */
	public int size() {
		// TODO Auto-generated method stub
		return vector.size();
	}

	@Override
	/**
	 * Empty
	 * Devuelve si el stack se encuentra vacio
	 * @return vacio
	 */
	public boolean empty() {
		// TODO Auto-generated method stub
		boolean vacio = false;
		if(size() != 0)
			vacio = true;
			
		return vacio;
	}

	

}
