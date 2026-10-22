public class first {
    public static void main(String[] args) {
        //Integers --> byte, short, int, long
        // Binary(2), Octal(8), Hexadecimal (16) number system
        byte b1 = 5;  // decimal
        byte b2 = 0b101; // Binary
        byte b3 = 07; // 0 - 7 --> octal
        byte b4 = 0XA; // hexadecimal (0 - 15) --> 0-9, A,B,C,D,E,F

        System.out.println("values=>"+b1+"," +b2+","+b3+","+b4);

    
        short s = 10;
        int i = 4000;
        long l = 3412__56_789;

        // Real numbers
        float f = 10.5_4f;  // single precision
        //double d = 23.0987;  // double precision --> standard way
        double d  = 6.02____2e23; // 6.022 * 10^23

        //charcters
        char c = 'a'; // 'a' --> integer --> binary --> store

        // boolean
        boolean bool = false;

        System.out.println("Integer values --> " + b1 +  " , " + s + " , " + i + " , " + l);
        System.out.println("Floating values --> " + f +  " , " + d);
        System.out.println("Character values --> " + c);
        System.out.println("Boolean values --> " + bool);

         
    } 
}