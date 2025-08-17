package Section4BitMagic;



public class BitSetCountArray3 {
    public static int[] tbl = new int[256];  // table for 8-bit chunks

    // 🔹 Static block: runs once when class is loaded
    static {
        tbl[0] = 0;
        for (int i = 1; i < 256; i++) {
            tbl[i] = tbl[i & (i - 1)] + 1;
        }
    }

    // ✅ Count set bits in a 32-bit integer
    public static int countSetBits(int n) {
        return tbl[n & 255] +
                tbl[(n >> 8) & 255] +
                tbl[(n >> 16) & 255] +
                tbl[(n >> 24) & 255];
    }

    // ✅ Count set bits in a 64-bit long
    public static int countSetBits(long n) {
        return tbl[(int)(n & 255)] +
                tbl[(int)((n >> 8) & 255)] +
                tbl[(int)((n >> 16) & 255)] +
                tbl[(int)((n >> 24) & 255)] +
                tbl[(int)((n >> 32) & 255)] +
                tbl[(int)((n >> 40) & 255)] +
                tbl[(int)((n >> 48) & 255)] +
                tbl[(int)((n >> 56) & 255)];
    }

    public static void main(String[] args) {
        int num = 13;
        long bigNum = 123456789123456789L;

        System.out.println("Number (int): " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Set Bits: " + countSetBits(num));

        System.out.println("\nNumber (long): " + bigNum);
        System.out.println("Binary: " + Long.toBinaryString(bigNum));
        System.out.println("Set Bits: " + countSetBits(bigNum));
    }
}
