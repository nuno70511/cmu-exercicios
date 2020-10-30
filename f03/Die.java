import java.util.Random;
import java.util.Scanner;

public class Die {
    private final int SIDES = 6;
    private int currSide;



    /*
        Constructors
     */

    public Die() {
        this.currSide = 1;
    }



    /*
        Getters and Setters
     */

    public int getCurrSide() {
        return currSide;
    }

    public void setCurrSide(int currSide) {
        if (currSide < 1 || currSide > 6) {
            System.out.println("Invalid side.");
        }
        else {
            this.currSide = currSide;
        }
    }



    /*
        Methods
     */

    public void roll() {
        Random rnd = new Random();
        this.currSide = rnd.nextInt(6) + 1;
    }

    public int getSidesTotal() {
        return this.SIDES;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Die die = new Die();

        System.out.println("We have created a die with " + die.getSidesTotal() + " sides.");

        System.out.println("current side: " + die.getCurrSide());
        while (sc.next().equals("r")) {
            die.roll();
            System.out.println("current side: " + die.getCurrSide());
        }

        sc.close();
    }
}
