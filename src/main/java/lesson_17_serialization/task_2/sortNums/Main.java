package lesson_17_serialization.task_2.sortNums;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream input = args.length == 0 ? System.in : new FileInputStream(args[0]);
        List<Integer> nums = getFromUser(input);
        System.out.println(nums);
    }
    private static List<Integer> getFromUser (InputStream input){
        Scanner scanner = new Scanner(input);
        List<Integer> result = new ArrayList<>();
        while (true){
            String s = scanner.nextLine();
            if ("quit".equalsIgnoreCase(s)) break;
            try {
                result.add(Integer.parseInt(s));
            } catch (NumberFormatException e) {
                System.out.println("Can't parse string to number");
            }
        }
        return result;
    }
}
