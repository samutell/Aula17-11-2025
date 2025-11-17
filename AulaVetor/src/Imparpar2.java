//questao 14
import java.util.Scanner;

public class Imparpar2 {
	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (A[i] % 2 == 0) {
                B[i] = 1;
            } else {
                B[i] = 0; 
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}