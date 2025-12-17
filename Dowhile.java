package Hotel;   // Package name

import java.util.Scanner;   // Import Scanner class for user input

public class Dowhile {

    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner sc = new Scanner(System.in);

        // Variable to store main menu choice and item choice
        int Choice, itemChoice;

        // do-while loop to repeat menu until user chooses Exit
        do {
            // Display main hotel menu
            System.out.println("Hotel Menu");
            System.out.println("1.Veg");
            System.out.println("2.Non-Veg");
            System.out.println("3.Exit");
            System.out.print("Enter your choice= ");

            // Read user's main choice
            Choice = sc.nextInt();

            // Switch case for main menu
            switch (Choice) {

                case 1:
                    // Veg menu options
                    System.out.println("Veg Menu");
                    System.out.println("1.Paneer");
                    System.out.println("2.Fried Rice");
                    System.out.println("3.Dal Rice");
                    System.out.print("Select item= ");

                    // Read veg item choice
                    itemChoice = sc.nextInt();

                    // Switch case for veg items
                    switch (itemChoice) {
                        case 1:
                            System.out.println("Selected Paneer");
                            break;
                        case 2:
                            System.out.println("Selected Fried Rice");
                            break;
                        case 3:
                            System.out.println("Selected Dal Rice");
                            break;
                        default:
                            // Invalid veg item selection
                            System.out.println("Invalid input");
                    }
                    break;

                case 2:
                    // Non-Veg menu options
                    System.out.println("Non-Veg Menu");
                    System.out.println("1.Chicken Biryani");
                    System.out.println("2.Mutton Biryani");
                    System.out.println("3.Fish Fry");
                    System.out.print("Select item= ");

                    // Read non-veg item choice
                    itemChoice = sc.nextInt();

                    // Switch case for non-veg items
                    switch (itemChoice) {
                        case 1:
                            System.out.println("Selected Chicken Biryani");
                            break;
                        case 2:
                            System.out.println("Selected Mutton Biryani");
                            break;
                        case 3:
                            System.out.println("Selected Fish Fry");
                            break;
                        default:
                            // Invalid non-veg item selection
                            System.out.println("Invalid input");
                    }
                    break;

                case 3:
                    // Exit option
                    System.out.println("Thank you");
                    break;

                default:
                    // Invalid main menu choice
                    System.out.println("Invalid choice");
            }

        } while (Choice != 3);   // Loop continues until user selects Exit

        // Close the Scanner object
        sc.close();
    }
}
