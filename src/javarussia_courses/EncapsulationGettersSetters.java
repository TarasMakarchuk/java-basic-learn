// created 09.10.2020
package javarussia_courses;

public class EncapsulationGettersSetters {
    public static void main(String[] args) {

        PersonHuman person1 = new PersonHuman();
        person1.setName(" ");
        person1.setAge(12);
        person1.speak();
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
    }
}

class PersonHuman {
    //у класса могут быть:
    //1. данные, поля;
    //2. действия, которые он может совершать (методы);
    private String name;
    private int age;

    public void setName(String username) {
        if(username.isEmpty()){
            System.out.println("user name must not be empty");
        }
        if(username.length() <= 2){
            System.out.println("user name must not be less 2 character");
        } else {
            name = username;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userage){
        if(userage <=0 | userage >=200){
            System.out.println("user age must be more 0 and less 200");
        }
        age = userage;
    }

    public int getAge(){
        return age;
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

