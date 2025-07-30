package Section3Mathematics;

import java.util.Scanner;

public class PrimeNumberBasic {
    public static boolean isPrime(int num){
       if(num ==1) return false;
        for(int i =2;i<num;i++){
            if(num % i ==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a positive integer to check if it is prime or NOT");
        int number = scan.nextInt();
        if(number <0)
            System.out.println("Enter Valid Positive number");
        else if(isPrime(number))
            System.out.println("The given number is a Prime");
        else
            System.out.println("the given number is NOT a Prime");

    }
}
