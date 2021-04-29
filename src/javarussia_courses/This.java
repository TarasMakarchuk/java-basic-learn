// created 09.10.2020
package javarussia_courses;

public class This {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Vasya");
        human1.setAge(11);
        System.out.println(human1.getName());
        System.out.println(human1.getAge());
        human1.getInfo();
    }
}

class Human{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println("name: " + name + " age " + age);
    }

}
