package denemeler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class palindromSayiMi {
    static boolean isPalindromSayi(int number){

        int temp;
        int reverseNumber=0;
        int lastNumber;

        temp=number;


        while (temp!=0){
            lastNumber=temp%10;
            reverseNumber=(reverseNumber*10)+lastNumber;
            temp/=10;
        }

        if (number==reverseNumber){
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println();
        System.out.println("***POLİNDROMİK SAYI MI***");
        System.out.println();
        System.out.print("Sayı girin: ");
        int number=input.nextInt();

        if (number>=0){
            System.out.println(isPalindromSayi(number) );
        }
        else {
            System.out.println("Lütfen POZİTİF TAM SAYI giriniz!!");
        }









    }


}
