// created 23.02.2021
package Shildt_G.Chapter_07_ClassesAndMethodsMoreDetails;

public class a_05_OverloadConstructors2 {
    double width;
    double height;
    double depth;

    a_05_OverloadConstructors2(a_05_OverloadConstructors2 object) {
        width = object.width;
        height = object.height;
        depth = object.depth;
    }

    a_05_OverloadConstructors2(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    a_05_OverloadConstructors2() {
        width = -1;
        height = -1;
        depth = -1;
    }

    a_05_OverloadConstructors2(double cube) {
        width = height = depth = cube;
    }

    double volume (){
        return width*height*depth;
    }
}

class OverloadConstructors2{
    public static void main(String[] args) {
        a_05_OverloadConstructors2 myBox1 = new a_05_OverloadConstructors2(10,20,15);
        a_05_OverloadConstructors2 myBox2 = new a_05_OverloadConstructors2();
        a_05_OverloadConstructors2 myBox3 = new a_05_OverloadConstructors2(7);
        double volume;
        a_05_OverloadConstructors2 myClone = new a_05_OverloadConstructors2(myBox1);

        volume = myBox1.volume();
        System.out.println("myBox1.volume(): " + volume);
        volume = myBox2.volume();
        System.out.println("myBox2.volume(): " + volume);
        volume = myBox3.volume();
        System.out.println("myBox3.volume(): " + volume);
        volume = myClone.volume();
        System.out.println("myClone.volume(): " + volume);
    }
}
