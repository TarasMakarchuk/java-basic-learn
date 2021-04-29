// created 22.02.2021
package Shildt_G.Chapter_04_Operations;

public class a_07_MultByTwo {
    public static void main(String[] args) {
        int i;
        int num = 0xFFFFFFE;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }
    }
}
