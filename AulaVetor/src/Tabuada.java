//questão 2
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int[] A = new int[5];
        int resultado;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] =in.nextInt();
        }

      
        for (int i = 0; i < 5; i++) {
            System.out.println("Tabuada do " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                resultado = A[i] * j;
                System.out.println(A[i] + " x " + j + " = " + resultado);
            }
        }

	}

}
