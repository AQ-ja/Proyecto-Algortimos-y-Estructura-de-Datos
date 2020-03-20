import java.util.*;

public class Interprete<K extends Comparable<K>,V> 
{
	
	
	protected Map<K,ArrayList<String>> funciones = new HashMap<K,ArrayList<String>>();//funciones, para poder utilizar recursividad
	protected  ArrayList<String> value = new ArrayList<>();//guarda el cuerpo de la funcion
	protected CalculosAritmeticos opA = new CalculosAritmeticos();//instancia para realizar calculos aritmeticos
	protected Stack resultados = new Stack();//guarda los resultados obtenidos en cada parte del cuerpo de la funcion
	String[] function = null;//guarda el programa separado por parentesis
	K key;//nombre de la funcion
	
	/**
	 * Se encarga de hacer todo el cuerpo de la funcion, tecnicamente es todo el traductor cuando el usuario ingresa una funcion
	 * @pre el main lee el programa que el usuario desea compilar
	 * @post devuelve el resultado del programa leido	
	 * @param programa
	 * @return resultado
	 */
	public String funcion(String programa) {
		String resultado = "";//resultado que va a devolver
		String fun = " ";//se utiliza para reemplazar datos (defun por "" y obtener solo el nombre de la funcion
		String line;//se utiliza para reemplazar datos en todo el programa
		line = programa.replace("(", ",(");//reemplaza los ( por ,( para despues poder hacer split al string
		//System.out.println(line.trim());
		function = line.split(",");//hace split al string por medio de las comas agregadas anteriormente
		String nParametro = function[2].replace(")","");
		nParametro = nParametro.replace("(", "");
		String parametro = asignacionParametro(programa).trim();
		
		for(int a = 0; a < function.length; a++) {
						
			//System.out.println("Funcion:" + function[a]);
			
			if(function[a].toLowerCase().startsWith("(defun")) {
				fun = function[a].toLowerCase().replace("(defun", "");
				key = (K) fun.trim();
				String llave = (String) key;
				//System.out.println("Key: " + llave);
			}else {	
					function[a] = function[a].replace(nParametro,parametro);
					value.add(function[a].trim());
			}
	
		}
			resultado = String.valueOf(opAritmetica());
			funciones.put(key, value);	
			//System.out.println("Llave: " + funciones.get(key));
			return resultado;
	}
	
	/**
	 * Determina si la funcion cuenta con un parametro
	 * @pre el programa ya se encuentra separado por parentesis
	 * @post devuelve si el programa cuenta con parametro
	 * @return parametro
	 */
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
	
	/**
	 * Si existe parametro asigna el parametro, y sino pos no hace nada
	 * @pre se ha evaluado si la funcion cuenta con parametros
	 * @post asigna el parametro en la funcion (si tiene) sino no hace nada
	 * @param programa
	 * @return parametro > el parametro a asignar
	 */
	public String asignacionParametro(String programa){
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
					//System.out.println("Key: " + fun);
				}
				if(function[a].toLowerCase().startsWith("("+fun) && function[a].endsWith(")")) {
					param = function[a].toLowerCase().replace(")","");
					parametro = param.split(" ");
					//System.out.println("Parametro: "+parametro[1]);
				}
				
			}
		}
			return " " +parametro[1]+" ";
	}
	/**
	 * Revisa si dentro de la funcion hay una operacion aritmetica y la realiza
	 * @pre el programa ya se encuentra separado por parentesis
	 * @post devuelve el resultado de la operacion realizada
	 * @return resultado
	 */
	public Double opAritmetica() {
		
		String operacion = " ";
		for(int a = 0; a < function.length;a++) {
			if(function[a].startsWith("(/") || function[a].startsWith("(*") || function[a].startsWith("(+") || function[a].startsWith("(-")) {
				operacion = function[a] +" "+ function[a+1];
				//System.out.println("Operacion V: "+operacion);
				a = function.length;
				}
		}
		return opA.Calculo(operacion);
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
