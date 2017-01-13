package org.vistula.homework.day2.aaa.original;

public class TriangleValidator { 
    public boolean Validate(double a, double b, double c) {
        return a + b > c 
              && a + c > b 
              && b + c > a; 
     } 
 } 
