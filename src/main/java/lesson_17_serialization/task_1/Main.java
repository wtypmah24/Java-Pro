package lesson_17_serialization.task_1;

import lesson_17_serialization.task_1.account.Account;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("wtypmah", "ff11", "taras@com");
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("account.dat"))){
            oos.writeObject(account);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}