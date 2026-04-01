public class Lec_6_DataTypes {

    static void main(String[] args) {
        // Number DT : short , byte , int ,long

        byte num1 = 100; // range from -128 to 127
        System.out.println(num1);
        short num2 = 5000;// ranges from -32768 to 32767
        System.out.println(num2);
        int num3 = 3456789;
        System.out.println(num3);
        long num4 = 123456789;
        System.out.println(num4);
        long num5 = 123456789;
        System.out.println(num5);


        //floating DT:
        float num6 = 123.45678999f; // upto 6 decimals round off.
        System.out.println(num6);
        double num7 = 123.45678999999999999d;
        System.out.println(num7);


        // Bool and char

        boolean var1 = true; // in java , we cant give 0 and 1 in boolean
        boolean var2 = false;
        System.out.println(var1);
        System.out.println(var2);
        char var3 = 'a'; // char in single '' and strong on dpuble inverted comma ""/
        System.out.println(var3);


        // ASCII value for char
        System.out.println("My first character is "+ (var3+2)); // as a = 97.
        System.out.println("My first character is "+ (char)(var3+2)); // do jabardasti conversion of number to char , explicitly.


        // Type-Casting:

        //Implicit COnversion:


        byte a = 127;
        long newnum = a;
        System.out.println(newnum); // byte implicit converted into long.


        // explicit:

        long num = 12345678999;  // for intellij it shows : integer number too large : no typecasting if value is out of range.
        int value = (int)num;
        System.out.println(value);
    }
}
