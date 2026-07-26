package homework;

import service.ATMService;
import service.MenuService;
import models.Bank;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        ATMService atmService = new ATMService(bank);
        MenuService menuService = new MenuService(atmService, bank);
        menuService.startApp();
        }
    }
