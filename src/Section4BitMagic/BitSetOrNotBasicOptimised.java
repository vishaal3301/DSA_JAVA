package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitSetOrNotBasicOptimised {
    public static void isSet(int n,int k){
        for(int i=0;i<(k-1);i++){
            n = n/2;
        }

        if((n & 1 ) != 0)
            System.out.println("Yes, the "+k+" ht bit is Set");
        else
            System.out.println("NO, the "+k+" ht bit is NOT Set");
    }

    public static void main(String[] args)throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        System.out.println("Enter a Integer K, to check that bit is SET or NOT");
        String bit = Br.readLine();
        int k = Integer.parseInt(bit);

        isSet(n,k);
    }
}
