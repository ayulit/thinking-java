package ch03_Operators;

public class E08_LongLiterals {

    public static void main(String[] args) {
        
        long hex = 0x2f; // DEC 57
        long oct = 0177; // DEC 127
        
        System.out.println("hex=" + hex);
        System.out.println("oct=" + oct);
        
        System.out.println(Long.toBinaryString(hex));
        System.out.println(Long.toBinaryString(oct));

    }

}
