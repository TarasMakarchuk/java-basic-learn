// created 25.12.2020
package Other_courses;

public class BitOperations_01 {
    public static void main(String[] args) {
//        int i = 0b00000100;
//        System.out.println(i);
//        System.out.println(Integer.toBinaryString(i));
//
//        System.out.println("--побитовый сдвиг вправо--");
//        System.out.println("в десятичном виде " + (i >>1));
//        System.out.println("в двоичном виде " + binaryStr(i >>1));
//
//        System.out.println("--побитовый сдвиг влево--");
//        System.out.println("в десятичном виде " + (i <<1));
//        System.out.println("в двоичном виде " + binaryStr(i <<1));
//
//        System.out.println("быстро умножить число на 4: " + (i << 2));
//        System.out.println("быстро разделить число на 4: " + binaryStr(i >> 2));

//        int b1 = 0b00001001;
//        int b2 = 0b00001010;
//
//        System.out.println("побитовое И (AND)");
//        printBinary(b1);
//        printBinary(b2);
//        printBinary(b1 & b2);
//
//        System.out.println("побитовое ИЛИ (OR)");
//        printBinary(b1);
//        printBinary(b2);
//        printBinary(b1 | b2);
//
//        System.out.println("побитовое исключающее ИЛИ (XOR)");
//        printBinary(b1);
//        printBinary(b2);
//        printBinary(b1 ^ b2);
//
//        System.out.println("побитовое отрицание инверсия (NOT)");
//        printBinary(b1);
//        printBinary(~b1);
//
//        //установка бита
//        int b = 0b1101000;
//        printBinary(b);
//        printBinary(b | 0b00000010);
//
//        //сброс бита в 0
//        printBinary(b);
//        printBinary(b & 0b11110111);
//
//        //проверка значения 4го бита
//        System.out.println((b & 0b00001000) > 0 ? "1" : "0");

//        int r = 64;
//        int g = 128;
//        int b = 32;
//        int alpha = 255;
//        int color = alpha << 24 | r << 16 | g << 8 | b;
//        System.out.println(Integer.toBinaryString(color));
//
//        int b1 = color & 0b11111111;
//        int b2 = (color & 0b1111111100000000) >> 8;
//        int b3 = (color & 0b111111110000000000000000) >> 16;
//        int b4 = (color & 0b11111111000000000000000000000000) >> 25;
//        printBinary(b1);
//        printBinary(b2);
//        printBinary(b3);
//        printBinary(b4);
//

        BitArray bitArray = new BitArray(10);
        bitArray.set(0,1);
        bitArray.set(9,1);

        bitArray.set(5,1);
        bitArray.set(5,0);

        System.out.println(bitArray.toString());
    }

    public static class BitArray {
        int size;
        byte[] bytes;

        private byte[] masks = new byte[]{ 0b00000001, 0b00000010, 0b00000100, 0b00001000,
                0b00010000, 0b00100000, 0b01000000, (byte) 0b10000000 };

        public BitArray(int size) {
            this.size = size;
            int sizeIntBytes = size / 8;

            if (size % 8 > 0) {
                sizeIntBytes = sizeIntBytes + 1;
            }
            bytes = new byte[sizeIntBytes];
        }

        public int get(int index) {
            int byteIndex = index / 8;
            int bitIndex = index % 8;
            return (bytes[byteIndex] & masks[bitIndex]) > 0 ? 1 : 0;
        }

        public void set(int index, int value) {
            int byteIndex = index / 8;
            int bitIndex = index % 8;
            if (value > 0) {
                bytes[byteIndex] = (byte) (bytes[byteIndex] | masks[bitIndex]);
            } else {
                bytes[byteIndex] = (byte) (bytes[byteIndex] & ~masks[bitIndex]);
            }
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < size; i++) {
                sb.append(get(i) > 0 ? '1' : '0');
            }
            return sb.toString();
        }

    }

    public static void printBinary(int b) {
        System.out.println("0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1));
    }

    public static String binaryStr(int b) {
        return "0b" + Integer.toBinaryString(0b100000000 | (b & 0xff)).substring(1);
    }

}
