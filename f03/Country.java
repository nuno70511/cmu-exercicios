import java.util.ArrayList;
import java.util.Scanner;

public class Country {
    private String name;
    private int population;
    private double areaKm2;



    /*
        Constructors
     */

    public Country(String name, int population, double areaKm2) {
        this.name = name;
        this.population = population;
        this.areaKm2 = areaKm2;
    }



    /*
        Getters and Setters
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getAreaKm2() {
        return areaKm2;
    }

    public void setAreaKm2(double areaKm2) {
        this.areaKm2 = areaKm2;
    }



    /*
        Methods
     */

    public double calcPopulationDensity() {
        return this.population / this.areaKm2;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Country> countries = new ArrayList<Country>();

        boolean isRunning = true;
        while (isRunning) {
            printMenu();
            byte selectedOption = sc.nextByte();

            switch (selectedOption) {
                case 0:
                    System.out.println("Name:");
                    String name = sc.next();

                    System.out.println("Population:");
                    int population = sc.nextInt();

                    System.out.println("Area (km2):");
                    int areaKm2 = sc.nextInt();

                    Country newCountry = new Country(name, population, areaKm2);
                    countries.add(newCountry);

                    System.out.println("");

                    break;
                case 1:
                    if (countries.size() == 0) {
                        System.out.println("There are no countries saved.");
                    }
                    else if (countries.size() == 1) {
                        System.out.println("By area: " + countries.get(0).getName());
                        System.out.println("By population: " + countries.get(0).getName());
                        System.out.println("By population density: " + countries.get(0).getName());
                    }
                    else {
                        Country countryWithLargestArea = countries.get(0);
                        Country countryWithLargestPop = countries.get(0);
                        Country countryWithHighestDensity = countries.get(0);

                        for (int i = 1; i < countries.size(); i++) {
                            Country currCountry = countries.get(i);

                            if (currCountry.getAreaKm2() > countryWithLargestArea.getAreaKm2()) {
                                countryWithLargestArea = currCountry;
                            }

                            if (currCountry.getPopulation() > countryWithLargestPop.getPopulation()) {
                                countryWithLargestPop = currCountry;
                            }

                            if (currCountry.calcPopulationDensity() > countryWithHighestDensity.calcPopulationDensity()) {
                                countryWithHighestDensity = currCountry;
                            }
                        }

                        System.out.println("By area: " + countryWithLargestArea.getName());
                        System.out.println("By population: " + countryWithLargestPop.getName());
                        System.out.println("By population density: " + countryWithHighestDensity.getName());
                    }

                    System.out.println("");

                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        };
    }

    public static void printMenu() {
        System.out.println("0 | Add Country");
        System.out.println("1 | Show Results");
        System.out.println("Selecione uma opção:");
    }
}
