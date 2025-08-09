package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputingPowerEfficient {
    public static int powerOfaNumber(int x,int n){
        if(n==0) return 1;
        int temp = powerOfaNumber(x,n/2);
        temp = temp * temp;
        if(n%2==0)
            return temp;
        else
            return temp * x;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number and its exponent to calculate its  power");
        String number = Br.readLine();
        int integer = Integer.parseInt(number);
        String pow = Br.readLine();
        int power = Integer.parseInt(pow);
        System.out.println("The "+integer+" to the power "+power+" is :"+powerOfaNumber(integer,power));

    }
}
