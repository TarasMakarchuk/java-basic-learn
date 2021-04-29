// created 12.10.2020
package javarussia_courses.Les35_AnonimousClasses;

interface AbleToEat{
     public void eat();
}


public class Test {
    public static void main(String[] args) {
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("animal is eating");
            }
        };
        ableToEat.eat();

    }
}


