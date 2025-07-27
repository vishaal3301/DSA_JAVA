package Section3Mathematics;

import java.util.Scanner;

/*
                        Euclidean Algorithm
    Basic Idea:
        Let 'b' be the smaller number than 'a' number,
        GCD(a,b) = GCD((a-b),b)

        Why?
            Because, Let 'g' be the GCD of 'a' and 'b',

            a= gx, b=gy and GCD(x,y) =1 ,
            (a-b) = g(x,y)

 */
public class GreatestCommonDivisorEuclid {
    public static int euclieanGCD(int num1,int num2){
        while( num1 != num2){
            if(num1 > num2)
                num1 = num1-num2;
            else
                num2 = num2-num1;
        }

        return  num1;
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two positive integer to calculate their GCD");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        System.out.println("The GCD is: "+euclieanGCD(num1,num2));
    }
}
