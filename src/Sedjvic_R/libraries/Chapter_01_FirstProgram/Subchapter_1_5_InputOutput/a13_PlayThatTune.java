// created 29.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

//Листинг 1.5.7. Цифровая обработка сигналов
// pitch расстояние от ноты «ля»
// duration время воспроизведения ноты
// hz частота
// n количество точек
// a [ ] данные дискретизации синусоиды

import Sedjvic_R.libraries.StdAudio;

public class a13_PlayThatTune {
    public static void main(String[] args) {
// Чтение мелодии из Stdln и ее воспр оизведение
        int SAMPLE_RATE = 44100;
        while (!StdIn.isEmpty()){
            // Чтение и воспроизведение одной ноты
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double hz = 440 * Math.pow(2, pitch/12.0);
            int n = (int)(SAMPLE_RATE * duration);
            double[] a = new double[n+1];
            for (int i = 0; i <=n ; i++) {
                a[i] = Math.sin(2*Math.PI * i * hz/SAMPLE_RATE);
            }
            StdAudio.play(a);
        }
    }
}
