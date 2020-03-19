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
	//private String FuncionesLisp;
	//private String Condicionales;
	//private ArrayList<String> funK = new ArrayList<String> ();
	//private ArrayList<String> funV = new ArrayList<String> ();
	/*
	public FuncionesLisp () {
		funK.add("defun");
		funK.add("cond");
		funK.add("setq");
		funK.add("atom");
		funK.add("list");
		funK.add("equal");
		funK.add("<");
		funK.add(">");
		//Aqui se colocan las cosas que hara cada funcion
		funV.add("");
		funV.add("");
		funV.add("");
		funV.add("");
		funV.add("");
		funV.add("");
		funV.add("");
		funV.add("");
		for (int i =0;i<funK.size();i++) {
			funciones.put(funK.remove(i), funV.remove(i));
		}
	}*/
	
	public String setfunciones(String funKcion,String cuerpo) {
		for (HashMap.Entry<String, String> entry:funciones.entrySet())
		{
			if (entry.getKey().equals(funKcion)) {
				return "funcion invalida";
			}
		}
		funciones.put(funKcion, cuerpo);
		return "funcion agregada";
	}
	@SuppressWarnings("null")
	public ArrayList<String> list(String val){
		ArrayList<String> resultado = null;
		resultado.add(val);
        return resultado;
    }
	public boolean equals(String valorA, String valorB){ //Tenemos 2 genericos y si son iguales regresa true, sino false
        return  valorA.equals(valorB);
    }
	

	public Boolean mayorMenor(int valorA, int valorB ){
        if(valorA > valorB){
            return true;
        }else{
            return false;
        }
	}

	public Boolean menorMayor(int valorA, int valorB ){
        if(valorA < valorB){
            return true;
        }else{
            return false;
        }
    }
	public <E> boolean atom(E val){
		if (val instanceof ArrayList) {
			return false;
		}else {
			return true;
		}
		
        
    }
	public void setq(String key, String cadena) {
		variables.put(key, cadena);
	}
	
	
	
}

