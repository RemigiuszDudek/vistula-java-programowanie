package org.vistula.homework.day1.mmm.original;

/**
 * Created by Iza on 2016-11-23.
 */
public class Rectangle {
    public int a;
    public int b;

    int field(){

        if(a == 0 || b == 0)
            return -1;

        return a*b;
    }

    int perimeter(){

        if(a == 0 || b == 0)
            return -1;

        return a+a+b+b;
    }
}
