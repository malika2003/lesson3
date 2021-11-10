package com.company;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000.0);

        while (true) {
            try {
                bankAccount.withDraw(6000);

            }catch (LimitException e) {
                System.out.println(e.getMessage());
                try {
                    bankAccount.withDraw(2000);
                    System.out.println("У тебя не осталось денег");
                } catch (LimitException limitException) {
                    System.out.println(limitException.getMessage());
                }
                break;
            }
        }
    }
}
