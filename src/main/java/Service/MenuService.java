package Service;

import models.Account;
import models.Bank;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.Scanner;

public class MenuService {
    private ATMService atmService;
    private Bank bank;
    private Scanner scanner;

    public MenuService(ATMService atmService, Bank bank) {
        this.atmService = atmService;
        this.bank = bank;
        this.scanner = new Scanner(System.in);
    }

    public void startApp() {
        System.out.println("=== Welcome to ATM ===");
        System.out.println("=== Enter your card number ===");
        String cardNumber = scanner.nextLine();
        System.out.println(cardNumber);
        System.out.println("=== Enter your PIN code ===");
        int pin = scanner.nextInt();
        System.out.println(pin);

        Optional<Account> account = bank.findAccount(cardNumber);

        if(atmService.login(cardNumber, pin)) {
            System.out.println("=== You successfully authorized ===");
            mainMenu();
        } else {
            System.out.println("=== Authorization error! Incorrect number or pin code");
        }

    }
    private void mainMenu() {
        boolean serviceOn = true;
        while (serviceOn) {
            System.out.println(" MAIN MENU ");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Logout");

            int userChoice = scanner.nextInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Your card balance: " + atmService.getUserBalance());
                    break;
                case 2:
                    System.out.println("Enter amount of deposit");
                    BigDecimal depositAmount = scanner.nextBigDecimal();
                    if(atmService.depositMoney(depositAmount)) {
                        System.out.println("Your balance successfully deposited");
                    } else {
                        System.out.println("Incorrect sum of deposit");
                    }
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount");
                    BigDecimal withdrawalAmount = scanner.nextBigDecimal();
                    if(atmService.withdrawMoney(withdrawalAmount)) {
                        System.out.println("Please take your money");
                    } else {
                        System.out.println("Not enough money");
                    }
                    break;
                case 4:
                    serviceOn = false;
                    atmService.logout();
                    System.out.println("The end!");
                    break;
                default:
                    System.out.println("Incorrect choice, try again");
            }


        }
        scanner.close();
    }

}
