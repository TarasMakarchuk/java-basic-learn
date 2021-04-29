// created 04.03.2021
package Beyts_Sierra_Java.Chapter_3_PrimitivesAndLinks;

public class a_01_ArrayOfObjects {
    public static void main(String[] args) {
        //пример1
        int[] nums;
        nums  = new int[7];
        nums[0] = 6;
        nums[1] = 42;
        nums[2] = 7;
        nums[3] = 8;
        nums[4] = 5;
        nums[5] = 12;
        nums[6] = 19;

        //пример 2 создание массива объектов
        Dog [] pets;
        pets = new Dog[7];
        pets[0] = new Dog();
        // значение pets[2] равно null;
        pets[3] = pets[0];


        //пример 3
        Dog fido = new Dog();
        fido.name = "Fido";
        System.out.println(fido.name);


        //пример 4
        Dog [] myDogs = new Dog [3];
        myDogs[0] = new Dog();
        myDogs[0].name = "Bobik";
        System.out.println(myDogs[0].name);
        myDogs[0].bark();

    }
}

class Dog {
    String name;
    String nameDefault = "pet";


    void sayName(){
        System.out.println("my name is" + nameDefault + " - " + Math.floor(Math.random()*100));
    }

    void bark(){
        System.out.println("bark! bark!");
    }
}
