package lesson_25_thread_locks.atm.bankaccount;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private int balance;
    private Lock lock;

    public BankAccount() {
        this.balance = 1000;
        this.lock = new ReentrantLock();
    }

    public void withdraw (int amount){
        lock.lock();
        try {
            if (balance >= amount){
                balance -= amount;
                System.out.println(Thread.currentThread().getId() + " Withdraw: " + amount);
            } else {
                System.out.println("Not enough money on acc balance.");
            }
        } finally {
            lock.unlock();
        }
    }
    public void deposit(int amount){
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getId()+ " Deposit " + amount);
        }finally {
            lock.unlock();
        }
    }
    public int getBalance() {
        return balance;
    }
}