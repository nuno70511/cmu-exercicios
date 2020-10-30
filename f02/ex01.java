import java.util.Locale;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.println("Vamos calcular o seu IMC.");

        System.out.println("Qual é o seu peso, em kg?");
        float weight = sc.nextFloat();

        System.out.println("Qual é a sua altura, em metros?");
        float height = sc.nextFloat();

        float imc = weight / (height * height);

        if (imc < 18.5) {
            System.out.println("Abaixo de 18,5 - Está abaixo do peso ideal.");
        }
        else if (imc < 25) {
            System.out.println("Entre 18,5 e 24,9 - Está com um peso normal.");
        }
        else if (imc < 30) {
            System.out.println("Entre 25,0 e 29,9 - Está acima de seu peso (sobrepeso).");
        }
        else {
            System.out.println("Está obeso.");
        }

        sc.close();
    }
}
