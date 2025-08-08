package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SieveOfEratosthenesExpert {

    public static void sieveExpert(int n){
        if(n<=1) return;

        boolean[] flags = new boolean[n+1];
        Arrays.fill(flags,true);

        for(int i=2; i<=n;i++){
            if(flags[i]){
                System.out.print(i+"\t");
                for(int j = i*i;j<=n;j=j+i){
                    flags[j] =false;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer to print Prime numbers less than that");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        sieveExpert(n);
    }
}
