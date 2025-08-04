package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SortedAllDivisiorOfNumberBasic {
    public static void printDivisior(int n){
        for(int i =1;i <=n;i++){
            if(n%i==0)
                System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer to print its all facotrs in Ascending order");
        String str = Br.readLine();
        int n = Integer.parseInt(str);
        printDivisior(n);
    }
}
