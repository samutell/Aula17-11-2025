//questao 11
import java.util.Scanner;

public class Rotina {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] A = new int[10];
        int X;
        int encontro = 0; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            A[i] = in.nextInt();
        }

        System.out.print("Digite o valor que deseja buscar (X): ");
        X = in.nextInt();

        for (int i = 0; i < 10; i++) {
            if (A[i] == X) {
                encontro = 1; 
            }
        }

        if (encontro == 1) {
            System.out.println("O valor " + X + " foi encontrado no vetor A!");
        } else {
            System.out.println("O valor " + X + " Nao esta no vetor A.");
        }

    }
}