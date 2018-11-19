package org.bwen.playground.core;

public class BitOps {

    static public  int add(int x, int y) {
        int carry;
        while (y !=0 ) {
            carry = x & y;
            x = x ^ y;

            y = carry <<1;
        }
        return x;
    }
}
