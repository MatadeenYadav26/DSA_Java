import java.math.BigInteger;
import java.util.Scanner;

public class input {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number:");
        int num1 = sc.nextInt();
        System.out.println("enter another number:");
        int num2 = sc.nextInt();
        System.out.println(num1+num2);
        System.out.println("enter big int val:");
        BigInteger bg = sc.nextBigInteger();
        System.out.println(bg);
        System.out.println("enter boolean val:");
        boolean var = sc.nextBoolean();
        System.out.println(var);
        System.out.println("enter another float:");
        float f = sc.nextFloat();
        System.out.println(f);
        System.out.println("enter another short val:");
        short s = sc.nextShort();
        System.out.println(s);


    }
}
