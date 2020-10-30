import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Vamos verificar se um número está dentro de um certo intervalo.");

        System.out.println("Introduza o número que corresponde ao início do intervalo:");
        double lowerLimit = sc.nextDouble();

        System.out.println("Introduza o número que corresponde ao fim do intervalo:");
        double upperLimit = sc.nextDouble();

        System.out.println("Introduza um número para verificar:");
        double numberToCheck = sc.nextDouble();

        if (numberToCheck >= lowerLimit && numberToCheck <= upperLimit) {
            System.out.println("O número pertence ao intervalo.");
        }
        else {
            System.out.println("O número NÃO pertence ao intervalo.");
        }

        sc.close();
    }
}