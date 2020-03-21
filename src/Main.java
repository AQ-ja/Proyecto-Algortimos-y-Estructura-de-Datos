import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import sun.rmi.runtime.NewThreadAction;

public class Main {

	public static void main(final String[] args) {
		// TODO Auto-generated method stub

		final File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
		String linea, programa = "";
		FuncionesLisp lisp = new FuncionesLisp();
		final ArrayList<ArrayList<String>> Arrpro  = new ArrayList<ArrayList<String>>();
	 	final ArrayList<String> funcion = null;
	 	final CalculosAritmeticos opA = new CalculosAritmeticos();
		 final Interprete inter = new Interprete();
		 final NewTryCond conds = new NewTryCond();
		 final StringBuffer sb = new StringBuffer();
		int contador = 0;
		int contador2 = 0;
	 	
//-------------------------------------LECTURA DEL PROGRAMA	 	
		try {
			fr = new FileReader ("lisp.txt");
			br = new BufferedReader(fr);

	        while((linea = br.readLine())!=null) {
	        	programa = programa + linea;
	    
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
			
			try{
				//funcion.add(NewTryCond.Fcond(Arrpro));
				//programa.add(NewTryCond.Fcond(funcion));
			//} catch (Exception e) {	
			//	e.printStackTrace();

			}catch (final Exception e){
	            e.printStackTrace();
			}
//----------------------------------------PRESENTACION AL USUARIO
		System.out.println("------------INTERPRETE LISP AlDiOr--------");
		System.out.println("*TENGA PRESENTE que si desea realizar una operacion aritmetica tome en cuenta las siguientes instrucciones de sintaxis: ");
		System.out.println("*Tambien tome en cuenta que si quiere realizar dos operaciones a la vez, el programa realizara unicamente la primera que fue Ingresada: ");	
		System.out.println("*Ejemplo: (Defun funcion ... ) (+ 5 2), el programa realizara unicamente la funcion ");	
		System.out.println("-No dejar espacios entre un operador y un parentesis: (/(* 5 9) 5)");			
		System.out.println("-Cuando se cierra un parentesis y a continuacion va un numero dejar un espacio de por medio:(/(* 5 9) 5) ");			
		System.out.println("*RECUERDE es unicamente una version Beta del interprete por lo tanto, unicamente realiza operaciones y funciones basicas");			
			if(programa.toLowerCase().startsWith("(defun")){
				System.out.println("La funcion ingresada fue: "+programa);
				System.out.println(">>Lisp " + inter.funcion(programa));
			}else if(programa.startsWith("(/") || programa.startsWith("(*") ||programa.startsWith("(-") ||programa.startsWith("(+")) {
				System.out.println("La operacion aritmetica ingresada fue: ");
				System.out.println(">>Lisp " + opA.Calculo(programa));
			}else if(programa.startsWith("(cond")) {
				//System.out.println(">>Lisp " + conds.str(programa));
			}else if(programa.toLowerCase().startsWith("(atom") || programa.toLowerCase().startsWith("(list") || programa.toLowerCase().startsWith("(equal")) {
				if (programa.toLowerCase().startsWith("(atom")) {
					System.out.println(">>Lisp " + lisp.atom(programa));
					
				}
			}
		
				
		}
	}	
}


