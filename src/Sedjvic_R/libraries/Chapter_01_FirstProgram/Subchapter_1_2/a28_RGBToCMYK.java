// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_2;

// 1.2.32. Преобразование цветов. Для представления цвета используются несколько
//разных форматов. Например, RGB — основной формат для ЖК-экранов, цифровых
//камер и веб-страниц — задает интенсивность красной (R), зеленой (G)
//и синей (В) цветовой составляющей в диапазоне от 0 до 255. В полиграфии чаще
//всего используется формат CMYK, определяющий уровень голубого (С), малинового
//(М), желтого (Y) и черного (К) цветов по вещественной шкале от 0,0 до
//1,0. Напишите программу RGBtoCMYK, преобразующую значение RGB в CMYK.
//Программа получает в командной строке три целых числа г , g и b и выводит
//эквивалентные значения в формате CMYK. Если все компоненты RGB равны
//0, то все значения CMY равны 0, а значение К равно 1; в остальных случаях используются
//следующие формулы:
//w = max ( г / 255, g / 255, Ь / 255 )
//с = (w - ( г / 255)) / w
//m = (w - ( g / 255)) / w
//у = (w - ( b / 255)) / w
//k = 1 - w

import java.text.DecimalFormat;

public class a28_RGBToCMYK {
    public static void main(String[] args) {
        short r = 150;
        short g = 100;
        short b = 50;

        double wMax1 = Math.max(r/255.0, g/255.0);
        double wMax2 = Math.max(g/255.0, b/255.0);
        double w = Math.max(wMax1, wMax2);

        double cayman;
        double magenta;
        double yellow;
        double k;

        if(r == 0 && g == 0 && b==0){
            cayman = 0;
            magenta = 0;
            yellow = 0;
            k=1;

        } else {
            cayman = (w - (r /255.0)) / w;
            magenta = (w - (g /255.0)) / w;
            yellow = (w - (b /255.0)) / w;
            k = 1 - w;
        }

        System.out.println("cayman: " + new DecimalFormat("##.##%").format((cayman)) + '\n'
                + "magenta:" + " " + new DecimalFormat("##.##%").format((magenta)) + '\n'
                + "yellow:" +  " " + new DecimalFormat("##.##%").format((yellow)) + '\n'
                + "k:" + " " + new DecimalFormat("##.##%").format((k)));
    }
}
