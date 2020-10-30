import java.util.ArrayList;
import java.util.Scanner;

public class ex08 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> movies = new ArrayList<String>();

    public static void main(String[] args) {

        boolean isRunning = true;
        while (isRunning) {
            printMenu();
            byte selectedOption = sc.nextByte();

            switch (selectedOption) {
                case 0:
                    addMovie();
                    break;
                case 1:
                    removeMovie();
                    break;
                case 2:
                    editMovie();
                    break;
                case 3:
                    showMovies();
                    break;
                default:
                    System.out.println("Input inválido.");
                    break;
            }
        };

        sc.close();
    }

    public static void addMovie() {
        System.out.println("Pressione 'ENTER' para confirmar a submissão.");
        System.out.println("Introduza 's' para sair.");

        boolean isAddingMovies = true;
        while (isAddingMovies) {
            String input = sc.next();

            if (input.equals("s")) {
                isAddingMovies = false;
            }
            else if (movies.contains(input)) {
                System.out.println("Filme repetido.");
            }
            else {
                movies.add(input);
            }
        }
    }

    public static void removeMovie() {
        System.out.println("Introduza o nome do filme a remover:");
        String movie = sc.next();

        if (movies.contains(movie)) {
            movies.remove(movie);
            System.out.println("");
        }
        else {
            System.out.println("Filme não encontrado.");
            System.out.println("");
        }
    }

    public static void editMovie() {
        System.out.println("Introduza o nome do filme a editar:");
        String movie = sc.next();

        if (movies.contains(movie)) {
            System.out.println("Introduza o novo nome:");
            String newMovieName = sc.next();

            movies.set(movies.indexOf(movie), newMovieName);
            System.out.println("");
        }
        else {
            System.out.println("Filme não encontrado.");
            System.out.println("");
        }
    }

    public static void showMovies() {
        if (movies.size() == 0) {
            System.out.println("A lista está vazia.");
            System.out.println("");
        }
        else {
            for (String movie : movies) {
                System.out.println(movie);
            }
            System.out.println("");
        }
    }

    public static void printMenu() {
        System.out.println("0 | Adicionar filme");
        System.out.println("1 | Apagar filme");
        System.out.println("2 | Editar filme");
        System.out.println("3 | Listar filmes");
        System.out.println("Selecione uma opção:");
    }
}

