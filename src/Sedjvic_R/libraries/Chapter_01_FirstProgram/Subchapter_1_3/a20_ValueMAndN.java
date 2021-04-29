// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.13. Какие значения принимают переменные т и п после выполнения следующего
//кода?
//i n t п = 1 2 3 4 5 6 7 8 9 ;
//i n t т = 0 ;
//w h i le (п != 0 )
//{
//т = (1 0 * т) + (п % 1 0 ) ;
//п = п / 1 0 ;
//}

public class a20_ValueMAndN {
    public static void main(String[] args) {
        int n = 123456789;
        int m = 0;
        int i = 1;
        while (n !=0){
            System.out.println(n);
            m = (10*m) - (n%10);
            System.out.println(n%10);
            n= n/10;
            i++;
        }
        System.out.println(n);
        System.out.println(m);
        System.out.println(i);
    }
}
