import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos unir as tuas iniciais com um \"e\" comercial (&).");

        System.out.println("Qual é o teu primeiro nome?");
        String firstName = sc.nextLine();

        System.out.println("Qual é o teu último nome?");
        String lastName = sc.nextLine();

        System.out.println(firstName.charAt(0) + "&" + lastName.charAt(0));
    }
}
