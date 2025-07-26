//package Section3Mathematics;

import java.util.Scanner;

public class TrailingZerosFactorialErrichtto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter positive integer");
        int n = scanner.nextInt();
        int answer = 0;

        for (long m = 5; m <= n; m *= 5) {
            answer += n / m;
        }

        //System.out.println("Number of Trailing zeros are: "+answer);
        System.out.println(answer);
    }
}
