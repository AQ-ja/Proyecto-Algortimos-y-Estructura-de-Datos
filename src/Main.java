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
	    String linea, programa = " ";
	 	ArrayList<String> funcion = null;
	 	CalculosAritmeticos opA = new CalculosAritmeticos();
	 	Interprete inter = new Interprete();
	 	
//-------------------------------------LECTURA DEL PROGRAMA	 	
		try {
			fr = new FileReader ("lisp.txt");
	        br = new BufferedReader(fr);

	        while((linea = br.readLine())!=null) {
	        	programa = programa + linea;
	    
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
//----------------------------------------PRESENTACION AL USUARIO
		System.out.println("Programa ingresado:" + programa);
		System.out.println(">>Lisp " + inter.funcion(programa)+ " grados Centigrados");
		
		/*if(words.contains("Cond")){
			condicionales = New Condicionales(opera);
		}
	    } else if (words.contains("<") || words.contains(">") || words.contains("Atom") || words.contains("List") || words.contains("Equal")) {
		condicionales = new Condicionales("(Cond " + opera + ")");*/
				
	}

}
