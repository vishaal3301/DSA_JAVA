package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitSetOrNotEfficient2 {
    public static void isSet(int n,int k){
        int x = (n >> (k-1)); // n/(2^(k-1))
        if((x & 1) != 0)
            System.out.println("Yes, the "+k+" bit is SET");
        else
            System.out.println("NO, the "+k+" bit is NOT SET");

    }

    public static void main(String[] args)throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        String str = Br.readLine();
        int n = Integer.parseInt(str);

        System.out.println("Enter a Integer k, to check if That bit is SET or NOT");
        String bit = Br.readLine();
        int k = Integer.parseInt(bit);

        isSet(n,k);
    }

}
