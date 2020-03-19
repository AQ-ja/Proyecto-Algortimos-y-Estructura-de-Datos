import java.util.ArrayList;
import java.util.HashMap;

/**
 * 
 */

/**
 * @author Orlando
 *
 */
public class FuncionesLisp {
	private HashMap<String,String> funciones = new HashMap<String,String>();
	private ArrayList<String> funK = new ArrayList<String> ();
	private ArrayList<String> funV = new ArrayList<String> ();
	
	public FuncionesLisp () {
		funK.add("defunK");
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
	}
	
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
	
	//Intento de equivalencias entre java y lisp
	// este seria el mas facil xd. 
	public boolean equals(E valorA, E valorB){ //Tenemos 2 genericos y si son iguales regresa true, sino false
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
}

