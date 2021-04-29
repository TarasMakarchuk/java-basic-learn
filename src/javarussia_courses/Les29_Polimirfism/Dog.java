// created 10.10.2020
package javarussia_courses.Les29_Polimirfism;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("dog is eating...");
    }

    public void voice(){
        System.out.println("dog say is burk");
    }
}
