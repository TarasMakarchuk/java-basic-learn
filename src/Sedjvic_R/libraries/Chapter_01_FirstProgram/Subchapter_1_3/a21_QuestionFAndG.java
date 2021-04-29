// created 11.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;


//1.3.14. Ч то в ы в о д и т следующий фрагмент кода?
//i n t f = 0 , g = 1 ;
//f o r ( i n t i = 0 ; i <= 1 5 ; i+ + )
//{
//S y s tem .o u t . p r i n t l n ( f ) ;
//f = f + g ;
//g = f - g ;
//}

public class a21_QuestionFAndG {
    public static void main(String[] args) {
        int f = 0, g =1;
        for (int i = 0; i <=15 ; i++) {
            System.out.println(f);
            f = f+g;
            g = f-g;
        }
    }
}
