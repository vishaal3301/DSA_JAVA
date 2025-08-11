package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitwiseOR {
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Eneter first Integer");
        String str1 = Br.readLine();
        int num1 = Integer.parseInt(str1);
        System.out.println("Eneter Second Integer");
        String str2 = Br.readLine();
        int num2 = Integer.parseInt(str2);
        System.out.println("The OR operation between "+num1+" and "+num2+" is "+(num1 | num2));

    }
}
