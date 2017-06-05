package ch03_Operators;

import static net.mindview.util.Print.print;

public class E11_SignedRightShift {

    public static void main(String[] args) {
        
        int i = 0x80000000; // Integer.MIN_VALUE
        
        print("DEC i " + i);
        print("Integer.MIN_VALUE " + Integer.MIN_VALUE);
        
        // Integer.toBinaryString( ) does not print leading zeroes!
        // BIN
        print(Integer.toBinaryString(i) + " .DEC:" + i);
        
        do {
            // Signed Right Shift >> 
            print(Integer.toBinaryString(i >>= 1) + " .DEC:" + i); // it's like dividing by 2
        } while (i != -1);

    }

}
