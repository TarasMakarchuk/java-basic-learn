// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_03_OverloadConstructors {
    double height;
    double width;
    double depth;

    a_03_OverloadConstructors(int h, int w, int d){
        height = h;
        width = w;
        depth = d;
    }

    a_03_OverloadConstructors(){
        width = -1;
        height =-1;
        depth = -1;
    }

    a_03_OverloadConstructors(double cube){
        width = height = depth = cube;
    }

    double volume(){
        return height*width*depth;
    }
}

class OverloadConstructors{
    public static void main(String[] args) {
        a_03_OverloadConstructors myBox1 = new a_03_OverloadConstructors(10,20,15);
        a_03_OverloadConstructors myBox2 = new a_03_OverloadConstructors();
        a_03_OverloadConstructors myCube3 = new a_03_OverloadConstructors(7);
        double volume;

        volume = myBox1.volume();
        System.out.println("myBox1.volume() " + volume);
        volume = myBox2.volume();
        System.out.println("myBox2.volume() " + volume);
        volume = myCube3.volume();
        System.out.println("myBox3.volume() " + volume);
    }
}
