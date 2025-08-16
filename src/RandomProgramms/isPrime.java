package RandomProgramms;

import java.util.Scanner;

public class isPrime {
    public static boolean isPrimeNumber(int number){
        if(number <= 1) return false;
        if(number == 2 || number == 3) return true;
        if(number %2 == 0 || number%3==0) return false;
        for(int i = 5; i*i <= number ;i = i+6){
            if(number % i == 0|| number %(i+2) == 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to be check if Prime or Not");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(isPrimeNumber(n)){
            System.out.println(n+" is a Prime number");
        }else{
            System.out.println(n+" is NOT a Prime number");
        }
    }
}
