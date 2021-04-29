// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_02_2xBox {
    double width;
    double height;
    double depth;
}

class BoxDemo2 {
    public static void main(String[] args) {
        a_02_2xBox myBox1 = new a_02_2xBox();
        a_02_2xBox myBox2 = new a_02_2xBox();
        double volume;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        volume = myBox1.width * myBox1.height * myBox1.depth;
        System.out.println("volume box 1 = " + volume);

        volume = myBox2.width * myBox2.height * myBox2.depth;
        System.out.println("volume box 2 = " + volume);
    }
}