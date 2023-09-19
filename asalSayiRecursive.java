package metots;

import java.util.Scanner;

public class asalSayiRecursive {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("***ASAL MI?***");
        System.out.println();

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayı girin: ");

            int sayi = scanner.nextInt();

            if (sayi==0){
                System.out.println(" bir asal sayı değildir.");
                System.out.println("Programdan cikis yapildi");
                break;
            }

            else if (sayi <= 1) {

                System.out.println(sayi + " bir asal sayı değildir.");
            }

            else {
                boolean asalMi = isAsal(sayi, 2);
                if (asalMi) {
                    System.out.println(" bir asal sayıdır.");
                } else {
                    System.out.println(" bir asal sayı değildir.");
                }
            }

            System.out.println("Programdan cikis yapmak isterseniz lutfen 0 a basiniz");

        }while (true);
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


