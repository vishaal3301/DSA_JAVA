package Section4BitMagic;



public class BitSetCountArray1 {
    public static int[] tbl = new int[256];

    // 🔹 Static block runs only once when the class is loaded
    static {
        tbl[0] = 0;
        for (int i = 1; i < 256; i++) {
            tbl[i] = tbl[i & (i - 1)] + 1;
        }
    }

    public static int countSetBits(int n) {
        return tbl[n & 255] +             // lowest 8 bits
                tbl[(n >> 8) & 255] +      // next 8 bits
                tbl[(n >> 16) & 255] +     // next 8 bits
                tbl[(n >> 24)];            // highest 8 bits
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println("Number : " + num);
        System.out.println("Binary : " + Integer.toBinaryString(num));
        System.out.println("Set Bits : " + countSetBits(num));
    }
}

