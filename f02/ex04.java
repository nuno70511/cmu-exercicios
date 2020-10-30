import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduza o número de uma carta ou a sua inicial (se tiver), seguido da inicial do naipe:");
        String userInput = sc.nextLine();

        String card = userInput.substring(0, userInput.length() - 1);
        char suit = userInput.charAt(userInput.length() - 1);

        String output = "";
        switch(card) {
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
            case "10":
                output += card;
                break;
            case "1":
            case "14":
                output += "Ás";
                break;
            case "D":
            case "11":
                output += "Dama";
                break;
            case "V":
            case "12":
                output += "Valete";
                break;
            case "R":
            case "13":
                output += "Rei";
                break;
            default:
                System.out.println("Carta desconhecida.");
                break;
        }

        if (output != "") {
            switch(suit) {
                case 'O':
                    output += " de Ouros";
                    System.out.println(output);
                    break;
                case 'E':
                    output += " de Espadas";
                    System.out.println(output);
                    break;
                case 'P':
                    output += " de Paus";
                    System.out.println(output);
                    break;
                case 'C':
                    output += " de Copas";
                    System.out.println(output);
                    break;
                default:
                    System.out.println("Naipe desconhecido.");
                    break;
            }
        }

        sc.close();
    }
}
