// created 02.02.2021
package Shildt_G.Chapter_02;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class a_03_Variables {
    public static void main(String[] args) {
        int num;
        num = 100;
        System.out.println("Это переменная num: " + num);

        num = num *2;

        System.out.print("Значение переменной num*2 равно ");
        System.out.println(num);

        output(true, true);
        output(false, true);
        output(false, false);
        output(true, false);

        byte [][] by = {{1,2,3,4}, {1,2,3}};
        System.out.println(by[1].length +" "+ by.length);

        int x =3;
        int y = 5;
        System.out.println(x / y);
        System.out.println((double) x/y);
        System.out.println(1.0 * x/y);

        System.out.println(!(false | true) && (!false && true));

        String line1 = "123";
        String line2 = new String("123");
        System.out.println("line line2");
        System.out.println(line1 == "123");
        System.out.println(line1 == line2);

        int x1 = 1;
        Integer y1 = new Integer(x1);
        int [] z1 = {x1};
        m(x1,y1,z1);
        System.out.println(x1);
        System.out.println(y1);
        System.out.println(z1[0]);

    }

    static void output (boolean a, boolean b){
        if(a){
            System.out.println("a");
        } else if(a&&b){
            System.out.println("a&&b");
        } else{
            if(!b){
                System.out.println("!b");
            } else{
                System.out.println("else");
            }
        }
    }

    static void m (int x, Integer y, int [] z){
        x++;
        y++;
        z[0]++;
    }
}
