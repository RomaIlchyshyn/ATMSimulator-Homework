package service;

import models.Account;
import models.Bank;
import utils.InputUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Optional;

public class MenuService {
    private ATMService atmService;
    private Bank bank;
    private final BufferedReader reader;

    public MenuService(ATMService atmService, Bank bank) {
        this.atmService = atmService;
        this.bank = bank;
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void startApp() throws IOException{
        System.out.println("=== Welcome to ATM ===");
        System.out.println("=== Enter your card number ===");
        String cardNumber = InputUtils.readString();
        System.out.println(cardNumber);
        System.out.println("=== Enter your PIN code ===");
        int pin = InputUtils.readInt();
        System.out.println(pin);

        Optional<Account> account = bank.findAccount(cardNumber);

        if(atmService.login(cardNumber, pin)) {
            System.out.println("=== You successfully authorized ===");
            mainMenu();
        } else {
            System.out.println("=== Authorization error! Incorrect number or pin code");
        }

    }
    private void mainMenu() throws IOException{
        boolean serviceOn = true;
        while (serviceOn) {
            System.out.println(" MAIN MENU ");
            System.out.println("1. Check balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw money");
            System.out.println("4. Logout");

            int userChoice = InputUtils.readInt();
            switch (userChoice) {
                case 1:
                    System.out.println("Your card balance: " + atmService.getUserBalance());
                    break;
                case 2:
                    System.out.println("Enter amount of deposit");
                    BigDecimal depositAmount = InputUtils.readBigDecimal();
                    if(atmService.depositMoney(depositAmount)) {
                        System.out.println("Your balance successfully deposited");
                    } else {
                        System.out.println("Incorrect sum of deposit");
                    }
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount");
                    BigDecimal withdrawalAmount = InputUtils.readBigDecimal();
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
        reader.close();
    }

}
