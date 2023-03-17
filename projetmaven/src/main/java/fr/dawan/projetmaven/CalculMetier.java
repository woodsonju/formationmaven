package fr.dawan.projetmaven;

public class CalculMetier {

	public double somme(double a, double b) {
		return a + b;
	}

	public double produit(double a, double b) {
		return a * b;
	}

	public double division(double dividend, double divisor) {
		if (divisor == 0) {
            throw new ArithmeticException("Divisor cannot be zero");
        }
        return dividend / divisor;
	}

}
