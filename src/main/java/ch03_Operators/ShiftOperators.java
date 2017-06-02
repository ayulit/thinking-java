package ch03_Operators;

import static net.mindview.util.Print.print;

public class ShiftOperators {

    public static void main(String[] args) {
        
        int p =  0x55; //  85 : positive
        int n = -0x55; // -85 : negative
        
        print("DEC p " + p);
        print("DEC n " + n);
        
        // Integer.toBinaryString( ) does not print leading zeroes!
        print("BIN p " + Integer.toBinaryString(p)); //     1010101
        print("BIN n " + Integer.toBinaryString(n)); // 1..10101011
        
        print("Left Shift p " + Integer.toBinaryString(p << 1)); //      10101010, so just moving left
        print("Left Shift n " + Integer.toBinaryString(n << 1)); //  1..101010110
        
        print("Right Shift p " + Integer.toBinaryString(p >> 1)); //     101010, so just moving right
        print("Right Shift n " + Integer.toBinaryString(n >> 1)); // 1..1010101

        print("Unsigned Right Shift p " + Integer.toBinaryString(p >>> 1)); // like 'Right Shift p'
        print("Unsigned Right Shift n " + Integer.toBinaryString(n >>> 1)); // like 'Right Shift p'!!! So it ALWAYS use filling by zeros
        
        print("\nOTHER TYPES\n");
        
        char c = 'z';
        print("INT c " + Integer.valueOf(c));        // 122
        print("BIN c " + Integer.toBinaryString(c)); // 1111010

        print("Left Shift c BIN " + Integer.toBinaryString(c << 1) + " DEC " + (c << 1));            // BIN 11110100 DEC 244
        print("Right Shift c BIN " + Integer.toBinaryString(c >> 1) + " DEC " + (c >> 1));           // BIN   111101 DEC 61
        print("Unsigned Right Shift c BIN " + Integer.toBinaryString(c >>> 1) + " DEC " + (c >>> 1)); // same as above
        
    }

}
