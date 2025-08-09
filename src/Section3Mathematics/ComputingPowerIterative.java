package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputingPowerIterative {
    public static int powerOfNumber(int x,int n){
        int result = 1;
        while(n>0){
            if(n%2 != 0){
                result = result * x;
            }
            x = x * x;
            n = n/2;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer and its Exponent to Calculate the Power");
        String num = Br.readLine();
        int number = Integer.parseInt(num);
        String pow = Br.readLine();
        int power = Integer.parseInt(pow);
        System.out.println("The "+number+" to the power "+power+" is: "+powerOfNumber(number,power));

    }
}
