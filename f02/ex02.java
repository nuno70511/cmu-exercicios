import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos verificar se um número é par ou ímpar.");

        System.out.println("Introduza um número inteiro:");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número é par.");
        }
        else {
            System.out.println("O número é ímpar.");
        }

        sc.close();
    }
}
