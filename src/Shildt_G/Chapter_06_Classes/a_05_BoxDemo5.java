// created 23.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_05_BoxDemo5 {
    double height;
    double width;
    double depth;

    double volume(){
        return height*width*depth;
    }

    void setDimensions(double w, double h, double d){
        height = h;
        width = w;
        depth = d;
    }
}

class BoxDemo5{
    public static void main(String[] args) {
        a_05_BoxDemo5 myBox1 = new a_05_BoxDemo5();
        a_05_BoxDemo5 myBox2 = new a_05_BoxDemo5();
        double volume;

        myBox1.setDimensions(10,20,15);
        myBox2.setDimensions(3,6,9);

        volume = myBox1.volume();
        System.out.println("volume equals: " + volume);

        volume = myBox2.volume();
        System.out.println("volume equals: " + volume);
    }
}
