package ch03_Operators;

import static net.mindview.util.Print.print;

public class E12_UnsignedRightShift {

    public static void main(String[] args) {
        
        int i = -1;
        print(Integer.toBinaryString(i) + " .DEC:" + i);
        
        do {
            // Unsigned Right Shift >>>
            print(Integer.toBinaryString(i >>>= 1) + " .DEC:" + i);
        } while (i != 0);
        

    }

}
