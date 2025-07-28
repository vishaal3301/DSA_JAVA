package Section3Mathematics;
/*
            LCM = (multiplication of two numbers) / (GCD of two numbers)

            number1 * number2 = GCD(number1,number2) * LCM(number1,number2)
 */
import java.util.Scanner;

public class LCMEfficientSolution {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static int LCM(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter two integer to calculate LCM");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("the LCM is: "+LCM(num1,num2));
    }
}
