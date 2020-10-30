import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos procurar um lugar no parque de estacionamento.");

        byte[] parkingLot = {1, 0, 0, 0, 1, 1, 0, 0, 1, 1};
        printParkingLot(parkingLot);

        boolean isAskingForInput = true;
        while (isAskingForInput) {
            System.out.println("Em que lugar deseja estacionar?");
            byte parkingSpace = sc.nextByte();

            if (parkingLot[parkingSpace - 1] == 1) {
                System.out.println("Lamentamos, o lugar encontra-se ocupado.");
            }
            else {
                parkingLot[parkingSpace - 1] = 1;
            }

            printParkingLot(parkingLot);

            for (byte space : parkingLot) {
                if (space == 0) {
                    isAskingForInput = true;
                    break;
                }
                else {
                    isAskingForInput = false;
                }
            }
        };

        System.out.println("O parque de estacionamento está cheio.");

        sc.close();
    }

    public static void printParkingLot(byte[] parkingLot) {
        String outputRow = "";
        for (byte space : parkingLot) {
            if (space == 1) {
                outputRow += "1|";
            }
            else {
                outputRow += " |";
            }
        }
        // remover o último pipe (|)
        outputRow = outputRow.substring(0, outputRow.length() - 1);

        System.out.println(outputRow);
    }
}

