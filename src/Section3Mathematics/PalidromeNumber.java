package Section3Mathematics;

import java.util.Scanner;

public class PalidromeNumber {
    public static boolean isPalindrome(int number){
        if(number == 0 ) return true;
        int reverse = 0;
        int duplicate = number;
        while(duplicate != 0){
            int lastDigit = duplicate %10;
            reverse = reverse * 10 +lastDigit;
            duplicate /= 10;

        }
       return (reverse == number);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Integer");
        int number = scan.nextInt();
        if(isPalindrome(number)){
            System.out.println("Number is palindrome");
        }else{
            System.out.println("Number is NOT Plaindrome");
        }

    }
}
