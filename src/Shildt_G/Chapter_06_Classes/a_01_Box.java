// created 22.02.2021
package Shildt_G.Chapter_06_Classes;

public class a_01_Box {
    double width;
    double heigth;
    double depht;
}

class BoxDemo {
    public static void main(String[] args) {
        a_01_Box myBox = new a_01_Box();
        double volume;

        myBox.width = 10;
        myBox.heigth = 20;
        myBox.depht = 15;

        volume = myBox.width * myBox.heigth * myBox.depht;

        System.out.println("volume figure equals " + volume);
    }
}


