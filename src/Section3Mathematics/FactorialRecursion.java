package Section3Mathematics;

import java.util.Scanner;

public class FactorialRecursion {
    public static int calculateFactorial(int number){
        if(number == 0 || number ==1){
            return 1;
        }
        return (number * calculateFactorial(number - 1));

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Positive Integer");
        int number = scan.nextInt();
        System.out.println("The factorial is: "+calculateFactorial(number));
    }
}
