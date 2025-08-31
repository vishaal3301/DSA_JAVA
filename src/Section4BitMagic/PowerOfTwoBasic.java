package Section4BitMagic;

public class PowerOfTwoBasic {
    public static boolean isPowerOfTwo(int n){
        if(n == 0)
            return false;
        while(n != 1){
            if(n % 2 != 0)
                return false;
            n = n/2;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = -8;
        System.out.println("Number: "+n);
        System.out.println("Binary: "+Integer.toBinaryString(n));
        System.out.println("The Number "+n+" is Power of 2 is: "+isPowerOfTwo(n));
    }
}
