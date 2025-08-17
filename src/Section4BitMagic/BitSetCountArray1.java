package Section4BitMagic;

public class BitSetCountArray {
    public static int[] tbl = new int[256];

    public BitSetCountArray(){
        tbl[0] = 0;
        for(int i=1; i<256;i++){
            tbl[i] = tbl[i & (i-1)] +1;
        }
    }

    public static int countSetBits(int n){
        return tbl[ n & 255] +
                tbl[(n>>8) & 255] +
                tbl[(n >> 16) & 255] +
                tbl [(n >> 24)];
    }

    public static void main(String[] args) {
        int num = 13;
        new BitSetCountArray();
        System.out.println("Number :"+num);
        System.out.println("Binary :"+Integer.toBinaryString(num));
        System.out.println("Set Bits : "+countSetBits(num));
    }
}
