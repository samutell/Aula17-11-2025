//questão 1
import java.util.Scanner;

public class Imparpar {

	public static void main(String[] args) {
	   
	        Scanner in = new Scanner(System.in);
	        int[] A = new int[20];
	        int[] B = new int[20];
	        int num = 0;

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Digite o número " + (i + 1) + ": ");
	            A[i] = in.nextInt();
	        }

	        for (int i = 0; i < 20; i++) {
	            if (A[i] % 2 == 0) {
	                B[num] = A[i];
	                num++;
	            }
	        }

	        for (int i = 0; i < 20; i++) {
	            if (A[i] % 2 != 0) {
	                B[num] = A[i];
	                num++;
	            }
	        }

	        System.out.println("Vetor B:");
	        for (int i = 0; i < 20; i++) {
	            System.out.print(B[i] + " ");
	        }


	}

}
