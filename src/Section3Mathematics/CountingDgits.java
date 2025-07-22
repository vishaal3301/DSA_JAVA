package Section3Mathematics;

import java.util.Scanner;

public class CountingDgits {
    public static void countingDigits(int num){
        if(num < 0) {
            System.out.println("Please Enter valid positive integer");

        }

        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }

        System.out.println("Total digits in number are: "+count);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Positive Integer");
        int number = scan.nextInt();
        countingDigits(number);
    }

}
