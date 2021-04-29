// created 09.10.2020
package javarussia_courses;

public class ClassesAndObjects {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Viktor";
        person1.age = 12;
        person1.speak();
        person1.sayHello();
        person1.setNameAndAge("Vasya", 15);
        person1.getName();
        person1.speak();

        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        person2.sayHello();

    }
}

class Person {
    //у класса могут быть:
    //1. данные, поля;
    //2. действия, которые он может совершать (методы);
    String name;
    int age;

    void setNameAndAge(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    void getName() {
        System.out.println(name);
    }

    void speak() {
            System.out.println("my name is " + name + ", I am " + age + " years old");
    }

    void sayHello() {
        System.out.println(name + " say is Hello!");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

}
