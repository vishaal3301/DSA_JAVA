package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFacotorsOfNumberBasic {
    public static boolean isPrime(int n){
        if(n == 1) return false;
        if(n ==2 || n == 3) return true;
        if(n % 2 ==0 || n % 3 ==0) return false;

        for(int i =5;i*i<=n;i=i+6){
            if(n % i ==0 || n % (i+2) ==0)
                return false;
        }
        return true;
    }

    public static void primeFactors(int n){
        for(int i=2;i<n;i++){
            if(isPrime(i)){
                int x = i;
                while(n % x ==0){
                    System.out.print(i +"\t");
                    x =x*i;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number to list its Prime factors:");
        String str = br.readLine();
        int n = Integer.parseInt(str);
        primeFactors(n);
    }
}
