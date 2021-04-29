// created 09.10.2020
package javarussia_courses.Les26_Interfaices;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12);
        Person person1 = new Person("Mike");
       outputInfo(animal1);
       outputInfo(person1);

    }
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
