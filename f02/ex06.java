import java.util.Scanner;
import java.util.ArrayList;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos inverter uma lista.");

        ArrayList<String> inputs = new ArrayList<String>();

        boolean isAskingForInput = true;
        while (isAskingForInput) {
            System.out.println("Introduza o elemento " + (inputs.size() + 1) + " da lista:");
            String input = sc.nextLine();
            inputs.add(input);

            System.out.println("Deseja adicionar mais um elemento à lista? S/N");
            String answer = sc.nextLine();

            isAskingForInput = answer.equals("S") || answer.equals("s");
        };

        String output = "";
        for (String element : reverseList(inputs)) {
            output += element + ", ";
        }
        // omitir a última vírgula
        output = output.substring(0, output.length() - 2);

        System.out.println("Lista invertida:");
        System.out.println(output);

        sc.close();
    }

    public static ArrayList<String> reverseList(ArrayList<String> originalList) {
        ArrayList<String> reversedList = new ArrayList<String>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }

        return reversedList;
    }
}
