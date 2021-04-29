// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_06_BoxDemo6 {
    double height;
    double width;
    double depth;

    a_06_BoxDemo6() {
        System.out.println("building object Box");
        height = 10;
        width = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxDemo6 {
    public static void main(String[] args) {
        a_06_BoxDemo6 myBox1 = new a_06_BoxDemo6();
        a_06_BoxDemo6 myBox2 = new a_06_BoxDemo6();
        double volume;

        volume = myBox1.volume();
        System.out.println("volume 1 equals: " + volume);

        volume = myBox2.volume();
        System.out.println("volume 2 equals: " + volume);

    }
}
