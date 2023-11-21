package lesson_15_patterns.task_3;

import lesson_15_patterns.task_3.student.Student;

import java.util.*;

public class Main {
    private static final List<String> NAMES = List.of("Kiwi", "John", "Gabe", "George", "Pod-rick",
            "Morty", "Rick", "Beth", "Peter", "Lois", "Stew", "Meg");

    public static void main(String[] args) {
        List<Student> students = getGroup();
        System.out.println(students);
    }

    /*
    * 1 Создайте запись Student, представляющую информацию о студенте (имя, возраст, средний балл).
    2 Создайте множество студентов в отдельном методе.
    3 Изначально средний балл у студентов не заполнен, т.к. они только начали учиться.
    4 В отдельном методе заполните средний балл каждого студента случайным образом.*/
    public static List<Student> getGroup() {
        Random random = new Random();
        int size = random.nextInt(3, 11);
        List<Student> students = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            students.add(new Student(NAMES.get(random.nextInt(NAMES.size())), random.nextInt(18, 100), 0));
        }
        return students;
    }

    public static List<Student> getAvgMark(List<Student> students) {
        Random random = new Random();
        List<Student> result = new ArrayList<>(students.size());
        for (Student s : students) {
            s.setAvgMark(random.nextDouble(5));
            result.add(s);
        }
        return result;
    }
}