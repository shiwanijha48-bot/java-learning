public class type_conversion {
    public static void main(String[] args) {
        //1. Implicit conversion 
        // (byte to int)
        byte b = 24;
        int i;
        i = b;
        System.out.println(i); // 24

        // character to int
        char c = 'a';
        int i1;
        i1 = c;
        System.out.println(i1); // 97

        // 2. Explicit conversion
        int i2 = 300;
        byte b1; // -128 to +127

        b1 = (byte) i2;
        System.out.println(b1); // 300 % 256 = 44

        // 3. Truncating conversion
        float f = 15.678f;
        int i3;

        i3 = (int) f;
        System.out.println(i3); // 15

        // Boolean to any data type
        // These conversions are not possible

        boolean bool = false;
        int i4;

        // i4 = bool;
        
        byte by = 50;
        by = (byte) (by * 2); // 100

        System.out.println(by);
    }
}
