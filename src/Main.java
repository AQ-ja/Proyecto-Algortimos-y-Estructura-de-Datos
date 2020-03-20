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
		System.out.println("Programa ingresado:" + programa);
		System.out.println(">>Lisp " + inter.funcion(programa));
		
				
		}
	}	
}


