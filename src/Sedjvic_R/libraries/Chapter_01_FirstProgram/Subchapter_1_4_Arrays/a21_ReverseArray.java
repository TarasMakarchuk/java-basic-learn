// created 17.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_4_Arrays;

//1.4.4. Напишите фрагмент кода, который переставляет в обратном порядке значения
//в одномерном строковом массиве. Не создавайте другой массив для хранения
//результатов. Подсказка: воспользуйтесь кодом, приведенным в тексте, для перестановки
//значений двух элементов.


import java.io.*;
import java.util.*;

public class a21_ReverseArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int n = a.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = temp;
        }
        System.out.println(Arrays.toString(a));

    }
}


class FindFile {
    public void findFile(String name, File file) {
        File[] list = file.listFiles();
        if (list != null)
            for (File item : list) {
                if (item.isDirectory()) {
                    findFile(name, item);
                } else if (name.equalsIgnoreCase(item.getName())) {
                    System.out.println(item.getParentFile());
                }
            }
    }

    public static void main(String[] args) {
        FindFile ff = new FindFile();
        String name = "T_01_MoveRobot.java";
        String directory = "C:\\Users\\User\\IdeaProjects";
        ff.findFile(name, new File(directory));
    }
}
