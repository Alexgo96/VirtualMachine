package calculadora;

import cliente.ProxyWSCalculadora;

public class ApliCalculadora {

		public static void main(String[] args) {
	        try{
	        	ICalculadora c;
	        	//modo distribuido
	        	//c = new cliente.ProxyRPCCalculadora();
	        	c =new ProxyWSCalculadora();
	        	//modo local
	        	//c= new Calculadora();
	        	System.out.println(c.sumar(3,1));
	        	System.out.println(c.multiplicar(1,2));

	        } catch(Exception e){
	            e.printStackTrace();
	        }
	    }
		

}