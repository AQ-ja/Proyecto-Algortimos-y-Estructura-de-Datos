import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File archivo = null;
	    FileReader fr = null;
	    BufferedReader br = null;
	    String[] translate = null,inOrder = null;
	 	String word,key = "",value="",line,traducir = "", espaniol = "",menu,words = null;
	 	ArrayList<String> funcion = null;
	 	String contenido = "";
	 	iStack asignacion = new Stack();
	 	//Map <String,String> mapa = new Map<String,String>();
	 	HashMap<String,String> map = new HashMap<String,String>();
		try {
			fr = new FileReader ("Prueba 1.lsp");
	        br = new BufferedReader(fr);

	        while((word = br.readLine())!=null) {
	        	contenido = contenido + word ;
	    
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
		
		System.out.println(contenido);
		line = contenido.replace("(", ",(");
		translate = line.split(",");
		System.out.println(" ");
		System.out.println("Lista de datos separados del programa");
		for(int i = 1; i< translate.length;i++) {
			
			System.out.println(translate[i]);
			map.put("Llave No." + i, translate[i]);
		}
		System.out.println("---------------------------------");
		
		
		System.out.println(map.size());
		for (HashMap.Entry<String, String> entry:map.entrySet())
		{
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		/*for(int a = 1; a < translate.length; a++) {
			if(translate[a].startsWith("(setq")){
				asignacion.push(translate[a]);
				asignacion.push(translate[a+1]);
				System.out.println("Estos son los valores");
				System.out.println(asignacion.pop());
				System.out.println(asignacion.pop());
			}
		}*/
		
		
		
		
		
		
	}
	

}

