package lesson_6_collection_list.task_3_practise;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog2 extends Faker {
    private static Faker faker = new Faker();
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dogs.add(new Dog(faker.funnyName().name(), RANDOM.nextInt(18), Breed.BOXER));
        }
        System.out.println(dogs);
    }
}
