package Section4BitMagic;
/*
    For left shift for positive x , x<<n then x*(2^n)
* */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BitwiseLeftShift {
    public static void main(String[] args) throws IOException {
        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a Integer");
        String str = Br.readLine();
        int num = Integer.parseInt(str);
        System.out.println("Left shift by 1: "+(num<<1));
        System.out.println("Left Shift by 2: "+(num<<2));
        System.out.println("Left Shift by 4: "+(num<<4));
    }
}
