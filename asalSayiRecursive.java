package metots;

import java.util.Scanner;

public class asalSayiRecursive {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");


        int sayi = scanner.nextInt();
        scanner.close();


        if (sayi <= 1) {

            System.out.println(sayi + " bir asal sayı değildir.");
        } else {
            boolean asalMi = isAsal(sayi, 2);
            if (asalMi) {
                System.out.println(" bir asal sayıdır.");
            } else {
                System.out.println(" bir asal sayı değildir.");
            }

        }

    }

    public static boolean isAsal(int sayi, int bolen) {
        if (sayi <= 2) {
            return (sayi == 2);
        }

        if (sayi % bolen == 0) {


            return false;
        }

        if (bolen * bolen > sayi) {
            return true;
        }

             return isAsal(sayi, bolen + 1);

    }



}


