package Section3Mathematics;

import java.util.Scanner;

public class GCDEuclidRecursion {
    public static int gcd(int num1,int num2){
        if(num2 == 0)
            return 0;
        else
            return gcd(num2,num1 % num2);
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two positive integer");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("The GCD is: "+gcd(num1,num2));
    }
}
