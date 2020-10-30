import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your initial amount?");
        short amount = sc.nextShort();
        //System.out.println("Initial amount: " + amount);

        amount *= 1.05;
        System.out.println("After the first year: " + amount);

        amount *= 1.05;
        System.out.println("After the second year: " + amount);

        amount *= 1.05;
        System.out.println("After the third year: " + amount);
    }
}
