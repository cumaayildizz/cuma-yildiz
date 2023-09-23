package metotsVeDizi;

import java.util.Arrays;
import java.util.Scanner;

public class SayiTahminOyuni {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double numberRandom = (int)(Math.random() * 100) ;
        int userNumber ;

        System.out.println();
        System.out.println("********** SAYI TAHMİN OYUNU ************");
        System.out.println();
        System.out.println("1-100 arasinda bir sayi girin");



        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        int right = 0 ;

        while (right < 5) {
            System.out.println("Sayı girin: ");
            userNumber = input.nextInt();

            if (userNumber < 0 || userNumber > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                }
                continue;
            }

            if (userNumber == numberRandom) {
                System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğini sayı : " + numberRandom);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı bir sayı girdiniz !");
                if (userNumber > numberRandom) {
                    System.out.println(userNumber + " sayısı, gizli sayıdan büyüktür.");
                } else {
                    System.out.println(numberRandom + " sayısı, gizli sayıdan küçüktür.");
                }

                wrong[right++] = userNumber;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }




    }
}
