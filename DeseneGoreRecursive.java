package metots;
import java.util.Scanner;
public class DeseneGoreRecursive {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("***SAYI DESENI***");
        System.out.println();
        System.out.println("Ornek: ( 11 )  ( 6 )  ( 1 )  ( -4 )  ( 1 )  ( 6 )  ( 11 ) ");
        System.out.println();

        do {
            System.out.print("Sayi girin: ");
            int number = input.nextInt();

            desen(number, number, true);

            if (number<0){
                System.out.println("Islem hatali!! Lutfen pozitif tam sayi giriniz");
                break;
            }

            System.out.println();

        }while (true);

    }

    public static void desen(int number2, int number, boolean isDecreasing) {

        if (number2 > 0 && isDecreasing) {
            desen(number2 - 5, number, true);
        }
        else if (number2 < number) {
            desen(number2 + 5, number, false);
        }

        System.out.print( " ( "+ number2 + " ) "  );

    }


}
