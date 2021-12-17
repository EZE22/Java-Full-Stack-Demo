package banking;

import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * Refactor to be more pollymorphic and use OOPs concepts
 * */

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final HashMap<Integer, Long> accounts = new HashMap<>();
    // maybe use a map or list to store balance. :)
    // Use records
    // Poly use pattern matching

    public static void main(String[] args) {
        while(true) {
            try {
                int userInput = intro();
                switch (userInput) {
                    case 1:
                        createAnAccount();
                        break;
                    case 2:
                        logInToAccount();
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please pick 1 - 3");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Please pick 1 - 3");
                scanner.nextLine();
            }
        }
    }

    public static int intro() {
        System.out.println("\n1. Create an account");
        System.out.println("2. Log into account");
        System.out.println("3. Exit");
        return scanner.nextInt();
    }

    public static void createAnAccount() {
        long cardNumber = generateCardNumber();
        int pinNumber = generatePinNumber();
        accounts.put(pinNumber, cardNumber);

        System.out.println("\nYou card has been created");
        System.out.println("Your card number \n" + cardNumber);
        System.out.println("Pin number generated \n" + pinNumber);
    }
    public static long generateCardNumber() {
        String bin = "400000";
        String accountNumber = String.valueOf(ThreadLocalRandom.current().nextLong(0, 999999999L));
        String checkSum = String.valueOf(ThreadLocalRandom.current().nextInt(0, 9));
        String fullCardNumber = bin + accountNumber + checkSum;
        return Long.parseLong(fullCardNumber);
    }
    public static int generatePinNumber() {
        return Integer.parseInt(String.format("%04d", ThreadLocalRandom.current().nextInt(1,9999)));
    }

    public static void logInToAccount() {
        System.out.println("Enter your card number:");
        long cardNumber = scanner.nextInt();
        System.out.println("Enter your PIN:");
        int pinNumber = scanner.nextInt();

        if(accounts.containsKey(pinNumber)) {
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }
    }

}

