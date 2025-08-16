package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitSetOrNotEfficient1 {
    public static void isSet(int n,int k){
        int x = (1 << (k-1));

        if((n & x) != 0)
            System.out.println("Yes, the "+k+" th bit is SET");
        else
            System.out.println("NO, the "+k+" th bit is NOT Set");
    }

    public static void main(String[] args)throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a INteger ");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        System.out.println("Enter a Intger k, to check that bit is Set or NOT");
        String bit = Br.readLine();
        int k = Integer.parseInt(bit);
        isSet(n,k);
    }
}
