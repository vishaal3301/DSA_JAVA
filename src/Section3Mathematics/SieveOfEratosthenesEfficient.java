package Section3Mathematics;
// this Sieve Of Eratosthenes is printing all prime numbers upto user input n.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SieveOfEratosthenesEfficient {


    public static void sieve(int n){
        if(n < 1) return;

        boolean[] flags = new boolean[n+1];
        Arrays.fill(flags,true);



        for(int i=2;i*i<=n;i++){
            if(flags[i]){
                for(int j=2*i;j<=n;j=j+i){
                    flags[j] =false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(flags[i]){
                System.out.print(i+"\t");
            }
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer to print the prime numbers less than it");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        sieve(n);
    }
}
