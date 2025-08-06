package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedAllDivisiorOfNumberEfficient {
    public static void printAllDivisor(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+"\t");
                if(i != n/i){
                    System.out.print(n/i+"\t");
                }
            }
        }
        System.out.println();
    }

    public static void sortedAllDivisor(int n){
              int i;
              for(i=1;i*i<n;i++){
                  if(n%i==0)
                      System.out.print(i+"\t");
              }
              for(;i>=1;i--){
                  if(n%i==0)
                  System.out.print(n/i+"\t");
              }
    }



    public static void main(String[] args)throws IOException {
        BufferedReader Br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Positiver integer to pront its all divisor");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        System.out.println("Unsorted Factors");
        printAllDivisor(n);
        System.out.println("*".repeat(70));
        System.out.println("Sorted Factors");
        sortedAllDivisor(n);
        System.out.println("*".repeat(70));



    }

}
