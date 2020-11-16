package calculadora;


public interface ICalculadora{
	
	public double sumar(double a, double b) throws CalculadoraException;
	public double multiplicar(double a, double b) throws CalculadoraException;
	
}