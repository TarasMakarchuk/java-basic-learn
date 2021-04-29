// created 23.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//Листинг 1.5.4. Простой фильтр
//Фильтр копирует в выходной поток только те числа из входного потока, которые входят
//в диапазону заданный аргументами командной строки. Длина потоков не ограничивается.

import Sedjvic_R.libraries.StdOut;

public class a04_RangeFilter {
    public static void main(String[] args) {
//        int low = Integer.parseInt(args[0]);
//        int high = Integer.parseInt(args[1]);
        int low = 200;
        int high = 800;

        while (!StdIn.isEmpty()){
            int value = StdIn.readInt();
            if(value >= low & value <= high){
                StdOut.println(value + " ");
            }
        }
        StdOut.print();
    }
}

//[
//        {
//        "id": 6,
//        "isActive": true,
//        "name": "Auto calculate credit memo amount"
//        },
//        {
//        "id": 4,
//        "isActive": false,
//        "name": "Auto-calculate vendor invoice amount"
//        },
//
//        {
//        "id": 5,
//        "isActive": false,
//        "name": "Credit memo is required for the Labor Credit"
//        },
//
//        {
//        "id": 3,
//        "isActive": true,
//        "name": "Credit memo is required for the 'RTV' core status"
//        },
//
//        {
//        "id": 2,
//        "isActive": true,
//        "name": "Credit memo is required for the 'RTV' part status"
//        },
//
//        {
//        "id": 1,
//        "isActive": true,
//        "name": "Vendor invoice is required for received parts"
//        }
//        ]
//
