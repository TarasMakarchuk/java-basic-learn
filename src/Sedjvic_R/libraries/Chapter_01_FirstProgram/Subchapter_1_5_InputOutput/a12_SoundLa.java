// created 29.03.2021
package Sedjvic_R.libraries.Chapter_01_FirstProgram.Subchapter_1_5_InputOutput;

import Sedjvic_R.libraries.StdAudio;

public class a12_SoundLa {
    public static void main(String[] args) {
        int SAMPLE_RATE = 44100;
        int hz880 = 880;
        double duration = 0.5;
        int n = (int)(SAMPLE_RATE * duration);
        double[] array = new double[n + 1];

        for (int i = 0; i <= n; i++) {
            array[i] = Math.sin(2*Math.PI*i*hz880 / SAMPLE_RATE);
        }
        StdAudio.play(array);

        int hz440 = 440;
        double[] array2 = new double[n+1];
        for (int i = 0; i <= n ; i++) {
            array2[i] = Math.sin(2*Math.PI * i * hz440 /SAMPLE_RATE);
        }
        StdAudio.play(array2);

    }
}
