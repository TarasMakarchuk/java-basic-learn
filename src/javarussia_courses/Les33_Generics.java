// created 10.10.2020
package javarussia_courses;

import java.util.ArrayList;
import java.util.List;

public class Les33_Generics {
    public static void main(String[] args) {

        //java5//
        List animals = new ArrayList();
        Animal ourAnimal = new Animal();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");
        animals.add(ourAnimal);

        String animal = (String) animals.get(3);
        System.out.println(animal);

        //с появлением дженериков//
        List<String> animals2 = new ArrayList<String>();
        animals2.add("pig");
        animals2.add("fish");
        animals2.add("cow");

        String animal2 = animals2.get(1);
        System.out.println(animal2);

        /// java 7 ///
        List<String> animals3 = new ArrayList<>();

    }

}

class Animal{

}