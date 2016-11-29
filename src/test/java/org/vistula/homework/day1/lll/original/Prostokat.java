package org.vistula.homework.day1.lll.original;

import java.util.Scanner;

/**
 * Created by Karol on 27.11.2016.
 */
public class Prostokat {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int dlugosc = 0;
        int szerokosc = 0;
        int pole = 0;
        int obwod= 0;
        System.out.println("Wpisz dlugosc prostokata");
        dlugosc = scanner.nextInt();
        System.out.println("Wpisz szerokosc prostokata");
        szerokosc = scanner.nextInt();
        pole = dlugosc * szerokosc;
        obwod = 2 * (dlugosc + szerokosc);

        System.out.println("Pole prostokata wynosi:" + pole);
        System.out.println("Obwod prostokata wynosi:" + obwod);
    }
}