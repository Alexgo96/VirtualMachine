package cliente;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import calculadora.CalculadoraException;
import calculadora.ICalculadora;
import calculadora.ws.CalculadoraCalculadoraExceptionException;
import calculadora.ws.CalculadoraStub;
import calculadora.ws.CalculadoraStub.MultiplicarResponse;
import calculadora.ws.CalculadoraStub.SumarResponse;

public class ProxyWSCalculadora implements ICalculadora {

	private CalculadoraStub stub = null;// new CalculadoraStub();
	public ProxyWSCalculadora() {
		try {
			stub = new CalculadoraStub();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); throw new IllegalStateException(e.getMessage());
		}
	}

	@Override
	public double sumar(double a, double b) throws CalculadoraException 
	{
			double res=0.0; 
			CalculadoraStub.Sumar sumar = new CalculadoraStub.Sumar();
			sumar.setA(a); 
			sumar.setB(b);
			
			try { 
				SumarResponse sr=stub.sumar(sumar); 
				res=sr.get_return();
			} catch (RemoteException e) {
				e.printStackTrace(); 
				throw new IllegalStateException(e.getMessage());
			} catch (CalculadoraCalculadoraExceptionException e) {
				e.printStackTrace(); 
				throw new CalculadoraException(e.getMessage());
			}
			return res;
	}

	@Override
	public double multiplicar(double a, double b) throws CalculadoraException {
		// TODO Auto-generated method stub
		//return 0;
		double res=0.0; 
		CalculadoraStub.Multiplicar multiplicar = new CalculadoraStub.Multiplicar();
		multiplicar.setA(a);
		multiplicar.setB(b);
		
		try { 
			MultiplicarResponse sr=stub.multiplicar(multiplicar); 
			res=sr.get_return();
		} catch (RemoteException e) {
			e.printStackTrace(); 
			throw new IllegalStateException(e.getMessage());
		} catch (CalculadoraCalculadoraExceptionException e) {
			e.printStackTrace(); 
			throw new CalculadoraException(e.getMessage());
		}
		return res;
	}
}

