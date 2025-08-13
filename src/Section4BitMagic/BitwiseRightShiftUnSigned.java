package Section4BitMagic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitwiseRightShiftUnSigned {
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        String str = Br.readLine();
        int num = Integer.parseInt(str);

        System.out.println("The UnSigned Right Shift by 1 is: "+(num>>1));
        System.out.println("The UnSigned Right Shift by 2 is: "+(num>>2));
        System.out.println("The UnSigned Right Shift by 4 is: "+(num>>4));
    }
}
