package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeFactorsOfNumberEfficient {
    public static void printPrimeFacotrs(int n){
        if(n <=1) return;

        for(int i=2 ;i*i <=n;i++){
            while(n%i==0){
                System.out.print(i+"\t");
                n=n/i;
            }
        }
        if(n>1)
            System.out.println(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Integer to print its prime factor");
        String str = br.readLine();
        int n = Integer.parseInt(str);
        printPrimeFacotrs(n);

    }
}

