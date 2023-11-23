package lesson_17_serialization.task_1;

import lesson_17_serialization.task_1.account.Account;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main_1 {
    private static Account deserialize(String path) {
        Account account = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path))) {
            Object o = ois.readObject();
            if (o instanceof Account) account = (Account) o;
        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
        return account;
    }

    public static void main(String[] args) {
        String path = "/Users/taras/Documents/Java theory/account.dat";
        Account account = deserialize(path);

        System.out.println(account);
    }
}
