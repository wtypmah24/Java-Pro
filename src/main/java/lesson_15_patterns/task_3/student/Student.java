package lesson_15_patterns.task_3.student;

public record Student(String name, int age, double averageNote) {
    /*
   * 1 Создайте запись Student, представляющую информацию о студенте (имя, возраст, средний балл).
   2 Создайте множество студентов в отдельном методе.
   3 Изначально средний балл у студентов не заполнен, т.к. они только начали учиться.
   4 В отдельном методе заполните средний балл каждого студента случайным образом.*/
    public Student setAvgMark(double averageNote) {
        return new Student(this.name, this.age, averageNote);
    }
}