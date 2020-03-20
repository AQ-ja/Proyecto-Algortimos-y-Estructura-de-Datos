import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import sun.rmi.runtime.NewThreadAction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		String linea, programa = "";
		ArrayList<ArrayList<String>> Arrpro = new ArrayList<ArrayList<String>>();
	 	ArrayList<String> funcion = null;
	 	CalculosAritmeticos opA = new CalculosAritmeticos();
		 Interprete inter = new Interprete();
		 NewTryCond fCond = new NewTryCond();
	 	
//-------------------------------------LECTURA DEL PROGRAMA	 	
		try {
			fr = new FileReader ("lisp.txt");
			br = new BufferedReader(fr);
			Arrpro = new ArrayList<ArrayList<String>>();
			System.out.println(Arrpro);

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
			
			try{
				funcion.add(NewTryCond.Fcond(Arrpro));
				//programa.add(NewTryCond.Fcond(funcion));
			} catch (Exception e) {	
				e.printStackTrace();

			}
//----------------------------------------PRESENTACION AL USUARIO
		System.out.println("------------INTERPRETE LISP AlDiOr--------");
		System.out.println("*TENGA PRESENTE que si desea realizar una operacion aritmetica tome en cuenta las siguientes instrucciones de sintaxis: ");			
		System.out.println("-No dejar espacios entre un operador y un parentesis: (/(* 5 9) 5)");			
		System.out.println("-Cuando se cierra un parentesis y a continuacion va un numero dejar un espacio de por medio:(/(* 5 9) 5) ");			
		System.out.println("*RECUERDE es unicamente una version Beta del interprete por lo tanto, solo realiza operaciones y funciones basicas");			
			if(programa.toLowerCase().startsWith("(defun")){
				System.out.println("La funcion ingresada fue: "+programa);
				System.out.println(">>Lisp " + inter.funcion(programa));
			}else if(programa.startsWith("(/") || programa.startsWith("(*") ||programa.startsWith("(-") ||programa.startsWith("(+")) {
				System.out.println("La operacion aritmetica ingresada fue: ");
				System.out.println(">>Lisp " + opA.Calculo(programa));
			}else if(programa.startsWith("(cond")) {
			
			}else if(programa.toLowerCase().startsWith("(atom") || programa.toLowerCase().startsWith("(list") || programa.toLowerCase().startsWith("(equal")) {
			
			}
		
				
		}
	}	
}


