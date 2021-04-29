// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_07_BoxDemo7 {
    double height;
    double width;
    double depth;

    //это конструктор с параметрами класса Box
    a_07_BoxDemo7(double h, double w, double d) {
        height = h;
        width = w;
        depth = d;
    }

    double volume() {
        return height * width * depth;
    }
}

class BoxDemo7{
    public static void main(String[] args) {
        a_07_BoxDemo7 myBox1 = new a_07_BoxDemo7(10,20,15);
        a_07_BoxDemo7 myBox2 = new a_07_BoxDemo7(3,6,9);
        double volume;

        volume = myBox1.volume();
        System.out.println("volume 1 equals " + volume);

        volume = myBox2.volume();
        System.out.println("volume 2 equals " + volume);


    }
}
