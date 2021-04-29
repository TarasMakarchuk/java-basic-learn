// created 09.10.2020
package javarussia_courses;

public class Static {
    public static void main(String[] args) {
        Human2 h2 = new Human2("Bob", 12);
        h2.printCountPeople();
        Human2 h3 = new Human2("Bill", 122);
        h3.printCountPeople();
        Human2 h4 = new Human2("Bil", 144);
        h3.printCountPeople();

    }
}

class Human2 {
    private String name;
    private int age;
    private static int countPeople;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printCountPeople() {
        System.out.println("quantity peoples: " + countPeople);
    }

}