import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestInterprete {
	
	Interprete inter = new Interprete();
	FuncionesLisp lisp = new FuncionesLisp();
	CalculosAritmeticos cal = new CalculosAritmeticos();
	@Test
	public void testFuncion(){		
		String resultado = inter.funcion("(DEFUN FTOC (TEMP)(/(- TEMP 32) 1.8))(PRINT (FTOC 100))");
		System.out.println(resultado);
		if (resultado.equals("37.78")) {
			assertEquals(-15, -15);
		}else {
			assertEquals(2, -15);
		}
						
	}
	/**
	 * Prueba para las operaciones basicas de lisp
	 */
	@Test
	public void testCalculo(){		
		Double resultado = cal.Calculo("(+ 2 3)");
		assertEquals(resultado, 5);								
	}
	/**
	 * Prueba para las operaciones basicas de lisp
	 */
	@Test
	public void testCalculo2(){		
		Double resultado = cal.Calculo("(- 5 3)");
		assertEquals(resultado, 2);								
	}
	/**
	 * Prueba para las operaciones basicas de lisp
	 */
	@Test
	public void testCalculo3(){		
		Double resultado = cal.Calculo("(* 2 3)");
		assertEquals(resultado, 6);								
	}
	/**
	 * Prueba para las operaciones basicas de lisp
	 */
	@Test
	public void testCalculo4(){		
		Double resultado = cal.Calculo("(/ 3 3)");
		assertEquals(resultado, 1);								
	}
	@Test
	/**
	 * Test para comprobar si atom funciona
	 */
	public void testCondicionales(){		
		boolean resultado = lisp.atom("(atom 5)");
		//boolean resultado = lisp.atom("(atom (list 1 2))");
		if (resultado) {
			assertEquals(1, 1);	
		}else {
			assertEquals(2, 1);	
		}
									
	}
	@Test
	/**
	 * Test para comprobar si atom funciona
	 */
	public void testCondicionales2(){		
		boolean resultado = lisp.atom("(atom (list 1 2))");
		//boolean resultado = lisp.atom("(atom 2)");
		System.out.println(resultado);
		if (!resultado) {
			assertEquals(1, 1);	
		} else {
			assertEquals(2, 1);	
		}
									
	}

}
