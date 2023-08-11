import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ATM Atm = new ATM("white", 14, "SHAH'S");

        System.out.printf("Hello user, welcome to %s. This is ATM number %d which you can recognize by the %s colour. ", Atm.getCompany(), Atm.getAtmNumber(), Atm.getColour());

        System.out.println("\n Would you like to deposit or withdraw today?:  ");
        String choice1 = scanner.nextLine();

        System.out.println("Would you like to confirm this action? Enter Yes or No: ");
        String choice2 = scanner.nextLine();

        if (choice2.equalsIgnoreCase("No")) {
            System.out.println("Ending Task. Please Try Again Later...");


        } else if (choice2.equalsIgnoreCase("yes")) {
            if (choice1.equalsIgnoreCase("deposit")) {
                System.out.println("How much money would you like to deposit? Enter the amount below: ");
            } else if (choice1.equalsIgnoreCase("withdraw")) {
                System.out.println("How much money would you like to withdraw? Enter below: ");
            }
        } else {
            System.out.println("Invalid input. Please try again later.");
        }
        String amount = scanner.nextLine();
        System.out.println("Amount entered" + amount + "$");
        scanner.close();
    }
}

