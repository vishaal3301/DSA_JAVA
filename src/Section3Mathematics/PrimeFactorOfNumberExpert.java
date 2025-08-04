package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorOfNumberExpert {
    public static void printPrimeFacotrs(int n){
        if(n <= 1) return;
        while(n % 2 ==0){
            System.out.print(2+"\t");
            n = n/2;
        }
        while(n % 3 ==0 ){
            System.out.print(3+"\t");
            n = n/3;
        }
        for(int i=5;i*i<=n;i=i+6){
            while(n % i ==0){
                System.out.print(i+"\t");
                n = n/i;
            }
            while(n % (i+2) ==0){
                System.out.print(i+2+"\t");
                n =n/(i+2);
            }
        }
        if(n > 3)
            System.out.print(n+"\t");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Integer to find it prime factors");
        String str = br.readLine();
        int n = Integer.parseInt(str);
        printPrimeFacotrs(n);

    }
}
