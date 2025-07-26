package Section3Mathematics;

import java.util.Scanner;

public class Factorial {

    public static int factCalculation(int number){
        if (number == 0 || number == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
    public static void FactorialCalculation(int number){
        if(number == 0 || number ==1){
            System.out.println("The factorual is: 1");
        }else {
            for (int i = number - 1; i > 0; i--) {
                number *= i;
            }
            System.out.println("The factorial is "+number);
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Positive integer");
        int number = scan.nextInt();
        if(number < 0){
            System.out.println("Number is Negative, cant print factorial");
        }else{
           FactorialCalculation(number);
            System.out.println("The factorial is: "+factCalculation(number));
        }
    }
}
