// created 03.03.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_10_Lesson_1_DrumKit {
    boolean topHat = true;
    boolean snare = true;

    void playSnare() {
        System.out.println("бах бах ба-бах");
    }

    void playTopHat() {
        System.out.println("динь динь ди-динь");
    }
}

class DrumKitTestDrive {
    public static void main(String[] args) {
        a_10_Lesson_1_DrumKit drumKIt = new a_10_Lesson_1_DrumKit();

        drumKIt.snare = false;
        if (drumKIt.snare == true) {
            drumKIt.playSnare();
        }

        drumKIt.playSnare();
        drumKIt.playTopHat();
    }
}
