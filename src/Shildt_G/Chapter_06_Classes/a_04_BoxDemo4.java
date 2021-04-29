// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_04_BoxDemo4 {
    double height;
    double width;
    double depth;

    double volume(){
        return height*width*depth;
    }
}

class BoxDemo4{
    public static void main(String[] args) {
        a_04_BoxDemo4 myBox1 = new a_04_BoxDemo4();
        a_04_BoxDemo4 myBox2 = new a_04_BoxDemo4();
        double volume;

        myBox1.height = 10;
        myBox1.width =20;
        myBox1.depth =15;

        myBox2.height = 3;
        myBox2.width = 6;
        myBox2.depth = 9;

        volume = myBox1.volume();
        System.out.println("volume myBox1 equals: " + volume);

        volume = myBox2.volume();
        System.out.println("volume myBox2 equals: " + volume);


    }
}
