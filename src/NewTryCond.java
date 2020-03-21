import java.util.ArrayList;
import java.util.List;

public class NewTryCond {
public static String Fcond(List<ArrayList<String>> myList) {
		String s = "";
		for(int i=0; i<myList.size();i++){
			if(myList.get(i).contains("cond")){
				Integer a = 0;
				Integer b = 0;
				String c = "";

				a = Integer.parseInt(myList.get(i-2).get(2));
				b = Integer.parseInt(myList.get(i-2).get(3));
				c = myList.get(i-2).get(1);
			

				switch(c){
					case ">":
					if(a > b){
						for(int j=1;j<myList.get(i-1).size()-1;j++){
							s+= myList.get(i-1).get(j);
						}
						return s;
					}else{
						a = Integer.parseInt(myList.get(i-4).get(2));
						b = Integer.parseInt(myList.get(i-4).get(3));
						c = myList.get(i-4).get(1);
						switch(c){
							case ">":
								if(a > b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}
									return s;	
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 
							case "<":
								if(a < b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 

							case "=":
								if(a == b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 
						}
					}
					
					
					 

					case "<":
					if(a < b){
						for(int j=1;j<myList.get(i-1).size()-1;j++){
						s+= myList.get(i-1).get(j);
						}
						return s;
					}else{
						a = Integer.parseInt(myList.get(i-4).get(2));
						b = Integer.parseInt(myList.get(i-4).get(3));
						c = myList.get(i-4).get(1);
						switch(c){
							case ">":
								if(a > b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							case "<":
								if(a < b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 

							case "=":
								if(a == b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}
									return s;	
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 
						}
					}
					

					case "=":
					if(a == b){
						for(int j=1;j<myList.get(i-1).size()-1;j++){
						s+= myList.get(i-1).get(j);
						}
						return s;
					}else{
						a = Integer.parseInt(myList.get(i-4).get(2));
						b = Integer.parseInt(myList.get(i-4).get(3));
						c = myList.get(i-4).get(1);
						switch(c){
							case ">":
								if(a > b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 
							case "<":
								if(a < b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
									}
									return s;
								}
							 
							case "=":
								if(a == b){
								for(int j=1;j<myList.get(i-3).size()-1;j++){
									s+= myList.get(i-3).get(j);
									}	
									return s;
								}else{
								for(int j=1;j<myList.get(i-6).size()-1;j++){
									s+= myList.get(i-6).get(j);
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

public ArrayList<ArrayList<String>> stream() {
	return null;
}}