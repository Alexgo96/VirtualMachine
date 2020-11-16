package calculadora;


public class Calculadora implements ICalculadora{

	public double sumar(double a, double b) throws CalculadoraException{
		if ((a +b) == Double.POSITIVE_INFINITY || (a +b) == Double.NEGATIVE_INFINITY)
			throw new CalculadoraException("Desbordamiento");
		return a+b;
	};
	public double multiplicar(double a, double b) throws CalculadoraException{
		if ((a *b) == Double.POSITIVE_INFINITY || (a *b) ==Double.NEGATIVE_INFINITY)
			throw new CalculadoraException("Desbordamiento");
		return a*b;
	};
	
	
	
}