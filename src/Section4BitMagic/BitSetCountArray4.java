package Section4BitMagic;

public class BitSetCountArray4 {
    public static int[] tbl = new int[256];  // lookup table for 8-bit chunks

    // 🔹 Static block: fill the table once
    static {
        tbl[0] = 0;
        for (int i = 1; i < 256; i++) {
            tbl[i] = tbl[i & (i - 1)] + 1;
        }
    }

    // ✅ Generic method for any integer type
    public static int countSetBits(long n) {
        int count = 0;
        while (n != 0) {
            count += tbl[(int)(n & 255)];  // take lowest 8 bits
            n >>>= 8;                      // unsigned shift right by 8
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 13;
        long bigNum = 123456789123456789L;

        // Works for int
        System.out.println("Number (int): " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Set Bits: " + countSetBits(num));

        // Works for long
        System.out.println("\nNumber (long): " + bigNum);
        System.out.println("Binary: " + Long.toBinaryString(bigNum));
        System.out.println("Set Bits: " + countSetBits(bigNum));
    }
}
