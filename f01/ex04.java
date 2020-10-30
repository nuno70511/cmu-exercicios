import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos transformar um valor em segundos para horas, minutos e segundos correspondentes.");

        System.out.println("Indique um valor em segundos:");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "s = " + hours + "h + " + remainingMinutes + "m + " + remainingSeconds + "s");
    }
}
