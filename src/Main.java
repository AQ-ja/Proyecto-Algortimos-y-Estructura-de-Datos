import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String[] translate = null,inOrder = null;
	 	String word,key = "",value="",line,traducir = "", espaniol = "",menu,words="";
	 	ArrayList<String> funcion = null;
	 	iStack asignacion = new Stack();
	 	CalculosAritmeticos opA = new CalculosAritmeticos();
	 	Interprete inter = new Interprete();
	 	
		try {
			fr = new FileReader ("lisp.txt");
	        br = new BufferedReader(fr);

	        while((word = br.readLine())!=null) {
	        	words = words + word;
	    
	        }
	    }
			catch(Exception e){
	        e.printStackTrace();
	    }finally{

	        try{
	            if( null != fr ){
	                fr.close();
	            }
	        }catch (Exception e){
	            e.printStackTrace();
	        }

			}
		
		System.out.println("Resultado:" + inter.funcion(words));
		//Codigo a ejecutar
		/*(DEFUN FTOC (TEMP)    ; farenheit to centrigrados
		   (/ (- TEMP 32) 1.8))*/
		
		/*if(words.contains("Cond")){
			condicionales = New Condicionales(opera);
		}
	    } else if (words.contains("<") || words.contains(">") || words.contains("Atom") || words.contains("List") || words.contains("Equal")) {
		condicionales = new Condicionales("(Cond " + opera + ")");*/
				
	}

}
