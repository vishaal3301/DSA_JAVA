package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// this Sieve Of Eratosthenes is printing all prime numbers upto user input n.
public class SieveOfEratosthenesBasic {

    public static boolean isPrime(int n){
        if(n<=1) return false;
        if(n == 2 || n==3) return true;
        if(n%2==0 || n%3==0) return false;

        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0)
                return false;
        }
        return true;
    }
    public static void printAllPrime(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i))
                System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Number, to print the ALl Prime numbers Less then it");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        printAllPrime(n);
    }
}
