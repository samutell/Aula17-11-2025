//questao 15 }:/
import java.util.Scanner;

public class question15 {
	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        System.out.println("Digite os 10 valores do vetor A:");
        for (int i = 0; i < 10; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = in.nextInt();
        }

        System.out.println("\nDigite os 10 valores do vetor B:");
        for (int i = 0; i < 10; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {

            if (A[i] > B[i]) {
                C[i] = 1;
            } else if (A[i] == B[i]) {
                C[i] = 0;
            } else {
                C[i] = -1;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}