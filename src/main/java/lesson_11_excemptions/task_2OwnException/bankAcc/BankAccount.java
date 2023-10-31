package lesson_11_excemptions.task_2OwnException.bankAcc;

import lesson_11_excemptions.task_2OwnException.exception.IncorrectAccountOperationException;
import lesson_11_excemptions.task_2OwnException.exception.InsufficientFundsException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public double deposit(double amount){
        if(amount <= 0) throw new IncorrectAccountOperationException("Deposit must be greater than 0");
        return balance += amount;
    }
    public double withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) throw new InsufficientFundsException("Not enough money!");
        return balance -= amount;
    }
}
