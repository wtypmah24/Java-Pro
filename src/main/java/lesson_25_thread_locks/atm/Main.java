package lesson_25_thread_locks.atm;

import lesson_25_thread_locks.atm.atm.ATM;
import lesson_25_thread_locks.atm.bankaccount.BankAccount;

import java.util.Arrays;

public class Main {
    /*
    * Разработайте программу, которая имитирует работу банка с
    * несколькими банкоматами. Создайте класс BankAccount, содержащий поле
    * int balance и методы withdraw и deposit, которые изменяют значение счета.
    Создайте класс ATM (банкомат), представляющий поток. Каждый банкомат
    * должен иметь доступ к общему объекту BankAccount и выполнять операции снятия и внесения денег.
    Используйте ReentrantLock для обеспечения атомарности операций счета и избежания состояний гонки.*/
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        Arrays.stream(new int[2]).mapToObj(e -> new Thread(new ATM(bankAccount))).forEach(Thread::start);
    }
}
