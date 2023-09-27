package lesson_1;

import java.util.Random;
import java.util.Scanner;

public class RandomPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password's length: ");
        byte length = scanner.nextByte();
        String password = password(length);

        System.out.println("Your password is: " + password);

    }
//    Напишите программу «Генератор паролей».
//    Программа генерирует случайные пароли заданной длины, используя буквы, числа и один из спецсимволов
//            (!, #, %, _)
    private static String password(int length){
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#%_";
        StringBuilder password = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            char c = chars.charAt(random.nextInt(chars.length()));
            password.append(c);
        }
        return password.toString();
    }
}
