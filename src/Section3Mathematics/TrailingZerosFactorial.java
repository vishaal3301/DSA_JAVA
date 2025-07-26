package Section3Mathematics;

import java.util.Scanner;

// Count the trailing zeros in a Facorial
// 5! is 120, so trailing zero is 1.
public class TrailingZerosFactorial {
    public static int countZeros(int number){
        int factorial = 1;
        for(int i=2;i <=number; i++ ){
            factorial = factorial * i;
        }

        int result = 0;
        while(factorial % 10  ==0){
            result++;
            factorial /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the positive integer");

        int number = scan.nextInt();
        System.out.println("the Trailing Zeros: "+countZeros(number));
    }

}
