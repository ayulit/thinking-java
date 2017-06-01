package ch03_Operators;

import static net.mindview.util.Print.*;

public class E10_BitwiseOperators {

    public static void main(String[] args) {
        
        int a = 0xAA; // 170
        int b = 0x55; // 85
        
        print("DEC a " + a);
        print("DEC b " + b);
        
        // Integer.toBinaryString( ) does not print leading zeroes!
        print("BIN a " + Integer.toBinaryString(a)); // 10101010
        print("BIN b " + Integer.toBinaryString(b)); // 01010101
        
        // NOR
        print("~a = " + Integer.toBinaryString(~a)); // 111...01010101
        print("~b = " + Integer.toBinaryString(~b)); // 111...10101010
        
        // AND
        print("AND " + Integer.toBinaryString(a & b)); // 0
        
        // OR
        print("OR " + Integer.toBinaryString(a | b)); // 11111111
        
        // XOR
        print("XOR " + Integer.toBinaryString(a ^ b)); // 11111111
        
        

    }

}
