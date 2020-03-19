import java.text.DecimalFormat;

public class CalculosAritmeticos {
	
	double resultado = 0;
	
	public void definir(String operacion) {
		
		String line = operacion.replace("(", "");
		line = line.replace(")","");
		line = line.replaceAll("  ","");
		//System.out.println(line);
		Stack<String> operaciones = new Stack();
		double op1,op2;
		String[] calculos = line.split(" ");
		
		for(int a = 0; a < calculos.length; a++){
		if(calculos[(calculos.length-1)-a].equals("+")) {
				try {
    				op1 = Double.valueOf(operaciones.pop());
					op2 = Double.valueOf(operaciones.pop());
					operaciones.push(String.valueOf(op1+op2));
    			}catch(Exception e) {
    				
    				}
		}else 
			if(calculos[(calculos.length-1)-a].equals("-")) {
				try {
    				op1 = Double.valueOf(operaciones.pop());
					op2 = Double.valueOf(operaciones.pop());
					operaciones.push(String.valueOf(op1-op2));
    			}catch(Exception e) {
    				//e.printStackTrace();
    				//operaciones.push("NO");
    				}
		}else 
			if(calculos[(calculos.length-1)-a].equals("*")) {
			try {
				op1 = Double.valueOf(operaciones.pop());
				op2 = Double.valueOf(operaciones.pop());
				operaciones.push(String.valueOf(op1*op2));
			}catch(Exception e) {

				}
    	}else
    		if(calculos[(calculos.length-1)-a].equals("/")) {
    		try {
				op1 = Double.valueOf(operaciones.pop());
				op2 = Double.valueOf(operaciones.pop());
				operaciones.push(String.valueOf(op1/op2));
			}catch(Exception e) {

				}
		}else
			operaciones.push(calculos[(calculos.length-1)-a]);

	}
		
		resultado = Double.parseDouble(operaciones.pop());

	}	
	
	public Double Calculo(String operacion) {
		definir(operacion);
		resultado = Math.round(resultado * 100) / 100d;
		return resultado;
	}
	
	
	
	


}
