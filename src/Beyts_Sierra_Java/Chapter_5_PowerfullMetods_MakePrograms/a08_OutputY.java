// created 08.03.2021
package Beyts_Sierra_Java.Chapter_5_PowerfullMetods_MakePrograms;

public class a08_OutputY {
    public static void main(String[] args) {
        a08_OutputY o = new a08_OutputY();
        o.go();
    }

    void go() {
        int y =7;
        for (int x = 1; x < 8; x++) {
            y++;
            if(x > 4){
                System.out.print(++y + " ");
            }
            System.out.println(y);
            if(y > 14){
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}


