import java.util.*;

public class Interprete<K,V> {
	
	
	protected Map<K,ArrayList<String>> funciones;
	ArrayList proceso = null;
	String[] function = null;
	K key;
	
	public void funcion(String programa) {

		String line;
		line = programa.replace("(", ",(");
		function = line.split(",");
		
		for(int a = 0; a< function.length;a++) {
			if(function[a].toLowerCase().startsWith("(defun")) {
				function[a].replace("(", "");
				function[a].trim();
				key = (K) function[a];
			}else {
				proceso.add(function[a]);
			}
				
		}
		funciones.put(key, proceso);
	}


}
