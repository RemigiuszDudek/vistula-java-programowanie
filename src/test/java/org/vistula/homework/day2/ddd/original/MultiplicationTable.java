package org.vistula.homework.day2.ddd.original;

import java.util.Arrays;

public class MultiplicationTable {
        public static void main(String[] args) {
            int[][] multiplicationTable = new int[11][11];
            int a,b;

            for(a=0;a<11;a++) {
                for(b=0;b<11;b++) {
                    multiplicationTable[a][b] = a * b;
                    multiplicationTable[b][a] = a * b;
                }
            }
            for(int temp[] : multiplicationTable) {
                System.out.println(Arrays.toString(temp));
            }
        }
    }