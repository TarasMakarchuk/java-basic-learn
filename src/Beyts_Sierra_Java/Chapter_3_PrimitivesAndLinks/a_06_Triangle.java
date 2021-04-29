// created 04.03.2021
package Beyts_Sierra_Java.Chapter_3_PrimitivesAndLinks;

public class a_06_Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        a_06_Triangle [] triangle = new a_06_Triangle[4];

        int x = 0;

        while(x < 4){
            triangle[x] = new a_06_Triangle();
            triangle[x].height = (x + 1) * 2;
            triangle[x].length = x + 4;


            triangle[x].setArea();
            System.out.print("треугольник " + x + ", зона");
            System.out.println(" = " + triangle[x].area);

            x++;
        }

        int y = x;
        x = 27;
        a_06_Triangle t5 = triangle[2];
        triangle[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", площать t5 = " + t5.area);

    }

    void setArea(){
        area = (height * length) / 2;
    }
}
