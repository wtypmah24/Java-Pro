package lesson_25_thread_locks.atm.atm;

import lesson_25_thread_locks.atm.bankaccount.BankAccount;

public class ATM implements Runnable{
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            bankAccount.deposit(1040);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            bankAccount.withdraw(433);
        }
    }
}
