// created 09.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;


//1.2.10. Допустим, переменная а объявляется командой i n t а = 2 1 4 7 4 8 3 6 4 7 (или
//эквивалентной константой Integer.MAX_VALUE). Какой результат выводит каждая
//из следующих команд?
//a. S y s t e m .o u t .p r in t ln ( a ) ;
//b . S y s t e m .o u t .p r in t ln ( a + l ) ;
//c . S y s t e m .o u t .p r in t ln ( 2 - a ) ;
//d . S y s t e m . o u t . p r i n t l n ( - 2 - a ) ;
//e . S y s t e m .o u t .p r in t ln ( 2 * a ) ;
//f . S y s t e m .o u t .p r in t ln ( 4 * a ) ;

public class a12_IntResult {
    public static void main(String[] args) {
        //2 1 4 7 4 8 3 6 4 7
        int a = Integer.MAX_VALUE;
        System.out.println(-2-a);
    }
}
