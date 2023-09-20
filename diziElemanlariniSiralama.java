package metots;

import java.util.Arrays;
import java.util.Scanner;

public class diziElemanlariniSiralama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println();
        System.out.println("***Dizideki sayilari kucukten buyuge siralama***");
        System.out.println();

        System.out.print("Eleman sayisi: ");
        int elemanSayisi = input.nextInt();

        int[] dizi = new int[elemanSayisi];

        System.out.println("RASTGELE OLUSTURULAN DIZI: ");

        for( int i=0; i< dizi.length; i++) {
            dizi[i] = (int) (Math.random()*100);
            System.out.print(dizi[i] + "  ");
        }

        System.out.println();
        System.out.println("Kucukten buyuge siralanmis hali:");

        Arrays.sort(dizi);  // listeyi kucukten buyuge siraladik
        System.out.println(Arrays.toString(dizi)); // listeyi arrays sinifi ile yazdirdik




    }
}
