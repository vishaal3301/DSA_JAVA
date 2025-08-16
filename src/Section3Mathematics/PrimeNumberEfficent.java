package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberEfficent {
    public static boolean isPrime(int n){
        if(n <= 1) return false;
        if(n ==2 || n==3 ) return true;
        if(n%2 == 0 || n%3 ==0) return false;

        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0)
                return false;

        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number to check if it is prime or NOT");
       String str = br.readLine();
       int n = Integer.parseInt(str);
       if(isPrime(n))
           System.out.println(n+" is a Prime Number");
       else
           System.out.println(n+" is NOT a prime Number");


    }
}
