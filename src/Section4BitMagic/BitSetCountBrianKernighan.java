package Section4BitMagic;

public class BitSetCountBrianKernighan {
    // Function to count set bits using Brian Kernighan's Algorithm
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);  // clear the rightmost set bit
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 13;
        System.out.println("Number: " + num);
        System.out.println("Binary: " + Integer.toBinaryString(num));
        System.out.println("Set bits: " + countSetBits(num));
    }
}
