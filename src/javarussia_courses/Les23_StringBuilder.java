// created 09.10.2020
package javarussia_courses;

public class Les23_StringBuilder {
    public static void main(String[] args) {
        //типы объектов 2: mutable immutable
        StringBuilder s1 = new StringBuilder("Hello");
        s1.append(" my").append(" friend!");
        System.out.println(s1);
    }
}
