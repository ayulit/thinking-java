package ch03_Operators;

import static net.mindview.util.Print.print;

public class E13_BinaryChar {

    public static void main(String[] args) {

        print("BIN:" + char2bin('A') + " DEC:" + Integer.valueOf('A'));
        print("BIN:" + char2bin('.') + " DEC:" + Integer.valueOf('.'));

    }

    private static String char2bin(char c) {
        return Integer.toBinaryString(c);
    }

}
