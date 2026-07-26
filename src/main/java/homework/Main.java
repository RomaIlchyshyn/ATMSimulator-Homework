package homework;

import Service.ATMService;
import Service.MenuService;
import models.Bank;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        ATMService atmService = new ATMService(bank);
        MenuService menuService = new MenuService(atmService, bank);
        menuService.startApp();
        }
    }
