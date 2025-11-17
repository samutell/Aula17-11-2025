//questao 6
public class Potencia {

	public static void main(String[] args) {
		
		int[] A = new int[11];
		int base = 2;
		int resultado;
		
	    for (int i = 0; i <= 10; i++) {
	    	resultado = 1;
	        for (int j = 1; j <= i; j++) {
	            	resultado = resultado * base; 
	        }
	        A[i] = resultado;
	    }
	    for (int i = 0; i <= 10; i++) {
	    	System.out.println("2 elevado a " + i + " = " + A[i]);
	    }

	}

}
