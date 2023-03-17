package fr.dawan.projetmaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

class CalculMetierTest {

	private CalculMetier metier;

	@BeforeEach
	void setUp() throws Exception {
		metier = new CalculMetier();
	}

	@Test
	void testSomme() {
		double actual = 45;
		double expected = metier.somme(30, 15);
		assertEquals(expected, actual);
	}

	@Test
	void testProduit() {
		double actual = 250;
		double expected = metier.produit(10, 25);
		assertEquals(expected, actual);
	}

	//En utilisant les classes anonymes 
//	@Test
//	void divisionByZeroShouldThrowException() {
//		assertThrows(ArithmeticException.class, new Executable() {
//
//			@Override
//			public void execute() throws Throwable {
//				metier.division(15, 0);
//			}
//		});
//	}
//	
	
	//Expression lambda
	@Test 
	void divisionByZeroShouldThrowException() {
		assertThrows(ArithmeticException.class, () -> {
			metier.division(15, 0);
		});
	}
	

	@Test
	void divisionShouldReturnExpectedResult() {
		double actual = 25;
		double expected = metier.division(250, 10);
		assertTrue(expected==actual);
	}

}
