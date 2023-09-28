package lesson_2_oop;

import lesson_2_oop.person.Person;

public class Main {
    public static void main(String[] args) {
        Person vasia = new Person(12345L);
        System.out.println(vasia.getTaxNumber());
        System.out.println(vasia.getFirstName());

        vasia.setFirstName("vasiliy");
        System.out.println(vasia.getFirstName());


        Person irina = new Person(34567L, "Cube");
        System.out.println(irina.getLastName());

        Person irinaClone = new Person(irina);
        System.out.println(irina == irinaClone);
        System.out.println("Irina origina = " + irina.getTaxNumber() + ", Irina clone: " + irinaClone.getTaxNumber());

        irinaClone.setTaxNumber(987654L);
        System.out.println("Irina origina = " + irina.getTaxNumber() + ", Irina clone: " + irinaClone.getTaxNumber());

    }

}
