import java.util.ArrayList;

public class NewTryCond {
public static String str(ArrayList<ArrayList<String>> listado) {
		String s = "";
		for(int i=0; i<listado.size();i++){
			if(listado.get(i).contains("cond")){
				Integer a = 0;
				Integer b = 0;
				String c = "";

				a = Integer.parseInt(listado.get(i-2).get(2));
				b = Integer.parseInt(listado.get(i-2).get(3));
				c = listado.get(i-2).get(1);
			

				switch(c){
					case ">":
					if(a > b){
						for(int j=1;j<listado.get(i-1).size()-1;j++){
							s+= listado.get(i-1).get(j);
						}
						return s;
					}else{
						a = Integer.parseInt(listado.get(i-4).get(2));
						b = Integer.parseInt(listado.get(i-4).get(3));
						c = listado.get(i-4).get(1);
						switch(c){
							case ">":
								if(a > b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}
									return s;	
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 
							case "<":
								if(a < b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 

							case "=":
								if(a == b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 
						}
					}
					
					
					 

					case "<":
					if(a < b){
						for(int j=1;j<listado.get(i-1).size()-1;j++){
						s+= listado.get(i-1).get(j);
						}
						return s;
					}else{
						a = Integer.parseInt(listado.get(i-4).get(2));
						b = Integer.parseInt(listado.get(i-4).get(3));
						c = listado.get(i-4).get(1);
						switch(c){
							case ">":
								if(a > b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							case "<":
								if(a < b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 

							case "=":
								if(a == b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}
									return s;	
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 
						}
					}
					

					case "=":
					if(a == b){
						for(int j=1;j<listado.get(i-1).size()-1;j++){
						s+= listado.get(i-1).get(j);
						}
						return s;
					}else{
						a = Integer.parseInt(listado.get(i-4).get(2));
						b = Integer.parseInt(listado.get(i-4).get(3));
						c = listado.get(i-4).get(1);
						switch(c){
							case ">":
								if(a > b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 
							case "<":
								if(a < b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 
							case "=":
								if(a == b){
								for(int j=1;j<listado.get(i-3).size()-1;j++){
									s+= listado.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<listado.get(i-6).size()-1;j++){
									s+= listado.get(i-6).get(j);
									}
									return s;
								}
							 
						}
					}
					


				}

				
			}	
		
		
		}
		return "Fallo funcion cond";
	}


}
