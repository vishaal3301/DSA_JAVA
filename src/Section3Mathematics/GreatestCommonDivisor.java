package Section3Mathematics;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static int calculartionGCD(int num1,int num2){
        int result = Math.min(num1,num2);

        while(result >0){
            if(num1 % result == 0 && num2 % result == 0){
                break;
            }
            result--;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Two number to find GCD");
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();

        System.out.println("The GCD is: "+calculartionGCD(number1,number2));
    }
}
