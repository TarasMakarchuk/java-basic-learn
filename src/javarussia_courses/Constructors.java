// created 09.10.2020
package javarussia_courses;

public class Constructors {
    public static void main(String[] args) {
        Human1 human1 = new Human1();
    }
}

class Human1 {
    private String name;
    private int age;

    public Human1(){
        this.name = "default";
        this.age = 0;
    }

    public Human1(String name){
        System.out.println("hello of second constructor");
        this.name = name;
    }

    public Human1(String name, int age){
        System.out.println("hello of third constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
