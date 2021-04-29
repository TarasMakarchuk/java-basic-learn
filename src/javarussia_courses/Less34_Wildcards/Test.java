// created 10.10.2020
package javarussia_courses.Less34_Wildcards;


import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animals> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animals(1));
        listOfAnimals.add(new Animals(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimals);
        test(listOfDogs);


    }
    private static void test(List<? extends Animals> list){
        for (Animals animal: list) {
            animal.eat();

        }
    }
}
