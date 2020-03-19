import java.util.*;

public class Interprete<K extends Comparable<K>,V> 
{
	
	
	protected Map<K,ArrayList<String>> funciones = new HashMap<K,ArrayList<String>>();
	protected  ArrayList<String> value = new ArrayList<>();
	String[] function = null;
	protected Map<K,V> llamadas= new HashMap<K,V>();
	K key,keyC;
	V valueC;
	
	
	public void funcion(String programa) {
		
		String fun = " ";
		String line;
		line = programa.replace("(", ",(");
		System.out.println(line.trim());
		function = line.split(",");
		String nParametro = function[2].replace(")"," ");
		nParametro = nParametro.replace("(", "");
		String parametro = asignacionParametro(programa);
		
		for(int a = 0; a < function.length; a++) {
			
			System.out.println("Funcion:" + function[a]);
			
			if(function[a].toLowerCase().startsWith("(defun")) {
				fun = function[a].toLowerCase().replace("(defun", "");
				key = (K) fun.trim();
				String llave = (String) key;
				System.out.println("Key: " + llave);
			}else {
				function[a] = function[a].replace(" "+nParametro,parametro);
				value.add(function[a].trim());
			}
			
		}
			funciones.put(key, value);	
			System.out.println("Llave: " + funciones.get(key));
	}
	
	
	//determina si la funcion contine parametro
	public boolean funcionP() {
		boolean parametro = false;
		char caracter = this.function[2].charAt(1);
		//System.out.println("Caracter: " + caracter);
		if(Character.isLetter(caracter)){
			return parametro = true;
		}
		return parametro = false;
	}
	
	public String asignacionParametro(String programa)
	{
		String fun = " ";
		String param;
		String [] parametro = null;
		String nParametro = function[2];
		nParametro = nParametro.replace(")","");
		if(funcionP() == true) {
			for(int a = 0; a < function.length; a++) {				
				if(function[a].toLowerCase().startsWith("(defun")) {
					fun = function[a].toLowerCase().replace("(defun", "");
					fun = fun.trim();
					System.out.println("Key: " + fun);
				}
				if(function[a].toLowerCase().startsWith("("+fun) && function[a].endsWith(")")) {
					param = function[a].toLowerCase().replace(")","");
					parametro = param.split(" ");
					System.out.println("Parametro: "+parametro[1]);
			}
				
			}
		}
			return " " +parametro[1]+" ";
	}

	public static List<String> GetExpression(List<String> list ){
		int contparen = 1; 
		int ToIndex = list.size();
		for(int i = 1; (contparen != 0) && (i < list.size()); i++){
            if(list.get(i).equals("(")){
				contparen++;	
			}

			else if(list.get(i).equals(")")){
				contparen--;
			}
			if(contparen == 0 ){
				ToIndex = i;
			}
		}
		return list.subList(0, ToIndex+1);
	}

}
