package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitSetOrNotBasic {
    public static void isSet(int n,int k){
        int x =1;
        for(int i=0;i<(k-1);i++){
            x = x * 2;
        }
        if((n & x) != 0)
            System.out.println("Yes, the "+k+"th bit is Set");
        else
            System.out.println("NO, the "+k+"th bit is NOT Set");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        System.out.println("Enter a integer to check if that bit is SET or NOT");
        String bit = Br.readLine();
        int k =Integer.parseInt(bit);
        System.out.println("Number: "+n);
        System.out.println("Binary of Number: "+Integer.toBinaryString(n));

        isSet(n,k);
    }
}
