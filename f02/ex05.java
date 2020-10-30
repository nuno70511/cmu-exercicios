import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos encriptar usando a Cifra de César.");

        System.out.println("Escreva a palavra a ser encriptada:");
        String plaintextWord = sc.nextLine();

        System.out.println("Introduza um número inteiro que servirá de chave de encriptação:");
        int encryptionKey = sc.nextInt();

        String output = "";
        for (int i = 0; i < plaintextWord.length(); i++) {
            int letterInAscii = plaintextWord.charAt(i);
            int nextLetterInAscii = letterInAscii + encryptionKey;

            // Entre 'A' e 'Z', maiúsculos
            if (letterInAscii >= 65 && letterInAscii <= 90) {

                // Se for maior que 'Z', retornar a 'A'
                if (nextLetterInAscii > 90) {
                    output += (char) (65 + (nextLetterInAscii - letterInAscii) - 1);
                }
                else {
                    output += (char) nextLetterInAscii;
                }

                continue;
            }

            // Entre 'a' e 'z', minúsculos
            if (letterInAscii >= 97 && letterInAscii <= 122) {

                // Se for maior que 'z', retornar a 'a'
                if (nextLetterInAscii > 122) {
                    output += (char) (97 + (nextLetterInAscii - letterInAscii) - 1);
                }
                else {
                    output += (char) nextLetterInAscii;
                }
            }
        }

        System.out.println("Palavra encriptada:");
        System.out.println(output);

        sc.close();
    }
}
