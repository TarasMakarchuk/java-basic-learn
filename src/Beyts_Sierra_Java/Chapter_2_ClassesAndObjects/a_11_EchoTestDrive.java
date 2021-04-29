// created 03.03.2021
package Beyts_Sierra_Java.Chapter_2_ClassesAndObjects;

public class a_11_EchoTestDrive {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = new Echo();

        int x = 0;

        while (x < 4) {
            e1.hello();
            e1.count = e1.count + 1;
            System.out.println("e1.count " + e1.count);
            e2 = e1;

            if (x == 3) {
                e2.count = e2.count + 1;
                System.out.println("if1 " + e2.count);
            }
            if (x == 3) {
                e2.count = e2.count + 1;
                System.out.println("if1 " + e2.count);
            }

            if (x == 3) {
                e2.count = e2.count + e1.count;
                System.out.println("if2 " + e2.count);

            } if (x == 3) {
                e2.count = e2.count + e1.count;
                System.out.println("if2 " + e2.count);

            }
            x = x + 1;
        }
        System.out.println(e2.count);
    }
}

class Echo {
    int count = 0;
    void hello() {
        System.out.println("привееееет...");
    }
}
