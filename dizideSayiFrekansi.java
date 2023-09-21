package metotsVeDizi;

import java.util.Arrays;
import java.util.Scanner;

public class dizideSayiFrekansi {

    static void frekans(int[] yeniDizi){

        Arrays.sort(yeniDizi);  // once diziyi kucukten buyuge siraliyoruz

        int i = 0;

        while (i < yeniDizi.length) {

                                    // bir sayac olusturup 1 e esitliyoruz. Neden 0 degilde 1?
            int counter = 1;       // Asagida tanimladigimiz donguye hic girmeyecek elemanlarda dizi de mevcuttur ve
                                  // donguye girmese bile frekansi 1 olmalidir

            while (i < yeniDizi.length  && yeniDizi[i] == yeniDizi[i + 1]) {
                // dizi zaten sirali oldugundan donguye soktugumuz elemani dahil etmeyip ,
                // dongu uzunlugu - 1 kez dongu ceviriyoruz
                counter++;
                i++;
            }

            System.out.println( yeniDizi[i] + " sayisinin  frekansi : " + counter);

            i++;
        }


    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Dizi boyutunu giriniz: " );
        int lenght = input.nextInt();

        int[] dizi = new int[lenght];

        for ( int i=0 ; i< dizi.length ; i++){
            System.out.print( (i+1) + ". eleman: ");
            dizi[i] = input.nextInt();
        }
        System.out.println();
        System.out.println("Dizi = " + Arrays.toString(dizi));
        System.out.println();


        frekans(dizi);

    }
}
