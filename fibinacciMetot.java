package denemeler;

import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;
import java.util.Scanner;

public class fibinacciMetot {

    static int fiboSeri(int n){

        if ( n==1 || n== 2) { return 1; }

        return fiboSeri(n-1) + fiboSeri(n-2);

    }

    public static void main(String[] args) {

        int n;
        Scanner input = new Scanner(System.in);

        System.out.println("***FIBONACCI SERISI N.elemanı bulma programı***");
        System.out.println();
        System.out.print("Bulmak istediğiniz elemanı giriniz: ");
        n=input.nextInt();

        if (n>0){

            System.out.println();
            System.out.println( "Fibonacci Serisinin  " + n +".  elemanı= "  + fiboSeri(n));

        }

        else {

            System.out.println("Lütfen bir POZİTİF TAM SAYI giriniz!!");

        }



    }
}
