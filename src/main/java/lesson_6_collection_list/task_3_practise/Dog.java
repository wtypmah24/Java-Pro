package lesson_6_collection_list.task_3_practise;

import java.util.ArrayList;
import java.util.List;

public class Dog {
    private String name;
    private int age;
    private Breed breed;

    public Dog(String name, int age, Breed breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Breed getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
}

enum Breed {
    TAXA,
    BOLONKA,
    OVCHARKA,
    BOXER;
}
class Main{
    public static void main(String[] args) {
        Dog dog1 = new Dog("Tizik", 3, Breed.TAXA);
        Dog dog2 = new Dog("Sharik", 2, Breed.BOLONKA);
        Dog dog3 = new Dog("Barsik", 9, Breed.OVCHARKA);
        Dog dog4 = new Dog("Tyson", 6, Breed.BOXER);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);

        for(Dog dog : dogs){
            if(dog.getBreed() == Breed.BOXER){
                System.out.println(dog);
            }
        }
    }
}
