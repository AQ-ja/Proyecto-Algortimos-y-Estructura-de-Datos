import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PruebasVarias<New> {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    final String[] translate = null,inOrder = null;
	 	String word;
		final String key = "", value="", line, traducir = "", espaniol = "", menu;
		String words="";
	 	final ArrayList<String> funcion = null;
	 	final Stack asignacion = new Stack();
	 	final CaculosAritmeticos opA = new CaculosAritmeticos();
	 	final Interprete inter = new Interprete();
	 	
		try {
			fr = new FileReader ("lisp.txt");
	        br = new BufferedReader(fr);

	        while((word = br.readLine())!=null) {
	        	words = words + word;
	    
	        }
	    }
			catch(final Exception e){
	        e.printStackTrace();
	    }finally{

	        try{
	            if( null != fr ){
	                fr.close();
	            }
	        }catch (final Exception e){
	            e.printStackTrace();
	        }

			}
		

		}
		
		if(words.contains("Cond")){
			condicionales = New Condicionales(opera);
		}
	    } else if (words.contains("<") || words.contains(">") || words.contains("Atom") || words.contains("List") || words.contains("Equal")) {
		condicionales = new Condicionales("(Cond " + opera + ")");


		inter.funcion(words);
		if(inter.funcionP() == true) 
			System.out.println("Hay parametro");
		else
			System.out.println("No hay parametro");
			
		//System.out.println(inter.asignacionParametro(words));
		inter.asignacionParametro(words);
		//resultado cuando se mete un texto para calcular su resultado de operacion aritmetica 
		//System.out.println(opA.Calculo(words));
		
		
				
	}

}
