package metotsVeDizi;

import java.util.Arrays;
import java.util.Scanner;

public class dizideTekrarEdenCiftSayilat {

    static boolean tekrarEdiyorMu ( int[] diziTekrar , int deger ){

        for ( int i : diziTekrar){
            if ( i == deger ){
                return true;
            }
        }
        return false;
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


        int[] tekrarEdenSayilar = new int[dizi.length];
        int counter = 0;  //sayac

        for ( int i = 0 ; i < dizi.length ; i++){

            for ( int j = 0 ; j < dizi.length ; j++){
                if( (i != j) && (dizi[i] == dizi[j])){
                    if (!tekrarEdiyorMu(tekrarEdenSayilar,dizi[i]) ){

                            tekrarEdenSayilar[counter++] = dizi[i];
                        }
                    break;
                }



            }

        }
        System.out.println("TEKRAR EDEN CIFT SAYILARI BULMA");
        System.out.println();

        for( int deger : tekrarEdenSayilar){
            if ( deger != 0 && deger%2==0){
                System.out.print(deger + " , ");
            }
        }

    }
}
