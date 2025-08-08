package Section3Mathematics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ComputingPowerBasic {
    public static int power(int x,int n){
        int result =1;
        for(int i=0;i<n;i++){
            result = result * x;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a integer");
        String number = Br.readLine();
        int n = Integer.parseInt(number);
        System.out.println("Enter a power");
        String exponent = Br.readLine();
        int x = Integer.parseInt(exponent);
        System.out.println("The power "+x+" of a number "+n+" is: "+power(n,x));


    }
}
