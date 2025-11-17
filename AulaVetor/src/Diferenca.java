//questão 10
import java.util.Scanner;

public class Diferenca {
	
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int vetorc = 0;
        int encontro;

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

            encontro = 0;

            for (int j = 0; j < 10; j++) {
                if (A[i] == B[j]) {
                    encontro = 1; 
                }
            }

            if (encontro == 0) {  
                C[vetorc] = A[i];
                vetorc++;
            }
        }
;
        if (vetorc == 0) {
            System.out.println("Nenhum elemento de A é diferente de B.");
        } else {
            for (int i = 0; i < vetorc; i++) {
                System.out.println("C[" + i + "] = " + C[i]);
            }
            
        }

    }
}