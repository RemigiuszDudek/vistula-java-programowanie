package org.vistula.homework.day2.aaa.original;


public class MultiplicationTable {
    public void Draw() {
        System.out.print ("x" + "|  ");
        for(int b=0; b<=10; b++) {
            System.out.print(b + "|" + "  ");
        }
        System.out.println();

        for (int a=0; a<=10; a++){
            System.out.print(a + "|");
            for ( int b=0; b<=10; b++){

                int wynik=a*b;

                if (wynik>=0 && wynik<=9){
                    System.out.print("  ");
                }
                else if (wynik>=10 && wynik<=99) {
                    System.out.print(" ");
                }
                System.out.print(wynik + ",");
            }
            System.out.println();
        }

    }
}
