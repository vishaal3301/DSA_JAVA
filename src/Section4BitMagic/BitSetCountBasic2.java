package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitSetCountBasic2 {
    public static int countSetBits(int n){
        int res = 0;
        while(n > 0){
            res = res + (n & 1);
            n = n/2;
        }
        return res;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer");
        String str = Br.readLine();
        int n = Integer.parseInt(str);

        int setBits = countSetBits(n);
        System.out.println("the SetBits in "+n+" are "+setBits);
    }

}
