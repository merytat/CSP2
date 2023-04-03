package Unit4;

import java.util.Scanner;

public class PokemonTrainerTester {
    public static void main(String[] args) {
        int option = 1;
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Pokemon Battle!");
        System.out.print("How many Pokemons will you train? ");
        int max = kb.nextInt();
        PokemonTrainer pt = new PokemonTrainer(max);

        while (option != 0) {
            System.out.println("Select an option from the menu or 0 to exit.");
            System.out.println("1 - Add Pokemon");
            System.out.println("2 - Search Pokemon");
            System.out.println("3 - Print Pokemon in species");
            System.out.println("4 - Print Pokemons faster than");
            System.out.println("5 - Get Healthiest Pokemon");
            System.out.println("6 - Get Weakest Pokemon");
            System.out.println("7 - Check if ready for battle");
            System.out.println("8 - Remove Pokemon");
            System.out.println("0 - quit");
            System.out.print(">> ");
            option = kb.nextInt();

            if (option == 1) {
                kb.nextLine();
                System.out.print("Enter Pokemon name: ");
                String name = kb.nextLine();
                System.out.print("Enter health: ");
                int health = kb.nextInt();
                System.out.print("Enter speed: ");
                int speed = kb.nextInt();
                kb.nextLine();
                System.out.print("Enter species: ");
                String species = kb.nextLine();

                pt.add(new Pokemon(name, health, speed, species));
                //pt.printAll(); this is not in the list methods
            } else if (option == 2) {
                kb.nextLine();
                System.out.print("Enter name of Pokemon to search: ");
                String name = kb.nextLine();
                Pokemon found = pt.search(name);
                if (found != null) {
                    System.out.println("Complete information of " + name);
                    System.out.format("%-15s %-15s %-15s %-15s",
                            "Name", "Health", "Speed", "Species" + "\n");
                    System.out.println(found);
                } else {
                    System.out.println(name + " was not found");
                }
            } else if (option == 3) {
                //1 mark
                kb.nextLine();
                System.out.print("Enter species: ");
                String species = kb.nextLine();
                System.out.println(species + " pokemon...");
                //1 mark
                pt.list(species);
                //add your code for option 3 here according to the sample output
            } else if (option == 4) {
                //add your code for option 3 here according to the sample output
            } else if (option == 5) {
                //add your code for option 3 here according to the sample output
            } else if (option == 6) {
                //add your code for option 3 here according to the sample output
            } else if (option == 7) {
                //add your code for option 3 here according to the sample output
            } else if (option == 8) {
                //add your code for option 3 here according to the sample output
            } else if (option == 0) {
                System.out.println("Thank you");
            } else {
                System.out.println("Invalid option, try again");
            }
        }
    }
}

