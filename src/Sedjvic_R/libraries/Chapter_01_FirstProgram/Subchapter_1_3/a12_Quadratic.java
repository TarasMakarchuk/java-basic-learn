// created 10.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_3;

//1.3.2. Напишите более универсальную и надежную версию программы Q u a d ra t ic
//(листинг 1.2.3), которая выводит корни многочлена ах? + Ьх + с> либо соответствующее
//сообщение, если дискриминант отрицателен, при этом избегая деления на
//нуль, если значение а равно нулю.

public class a12_Quadratic {
    public static void main(String[] args) {
        double b = 2;
        double c = 1;

        double discriminant = b*b - 4*c;
        if(discriminant < 0){
            System.out.println("discriminant is negative number");
        } else {
            double d = Math.sqrt(discriminant);
            System.out.println((-b + d)/2);
            System.out.println((-b - d)/2);
        }

    }
}
