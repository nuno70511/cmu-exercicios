import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Vamos calcular o seu IMC.");

        System.out.println("Qual é o seu peso, em kg?");
        float weight = sc.nextFloat();

        System.out.println("Qual é a sua altura, em metros?");
        float height = sc.nextFloat();

        float imc = weight / (height * height);
        System.out.println("O teu IMC é: " + imc);
    }
}
