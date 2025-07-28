package Section3Mathematics;

import java.util.Scanner;

public class LCM {
    public static int leastCommonMultiple(int num1,int num2){
       int result = Math.max( num1, num2);
       while(true){
           if(result % num1 ==0 && result % num2 ==0)
               return result;
           result++;
       }


    }

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the two Positive integers:");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        System.out.println("The LCM is: "+leastCommonMultiple(num1,num2));
    }

}
