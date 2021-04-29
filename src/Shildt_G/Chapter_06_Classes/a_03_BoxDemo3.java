// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_03_BoxDemo3 {
    double width;
    double height;
    double depth;

    void volume (){
        System.out.print("volume equals: ");
        System.out.println(width*height*depth);
    }
}

class BoxDemo3{
    public static void main(String[] args) {
        a_03_BoxDemo3 myBox1 = new a_03_BoxDemo3();
        a_03_BoxDemo3 myBox2 = new a_03_BoxDemo3();

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        myBox1.volume();
        myBox2.volume();
    }
}
