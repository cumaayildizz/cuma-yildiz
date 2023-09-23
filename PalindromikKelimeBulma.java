package metotsVeDizi;

import java.util.Scanner;

public class PalindromikKelimeBulma {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userWord ;

        System.out.println();
        System.out.println("*******PALINDROMIK KELIME BULMA PROGRAMI*******");
        System.out.println();

        System.out.print("Kelime girin : ");
        userWord = input.nextLine();
        System.out.println();

        String reverseWord = "";
        for (int i = userWord.length() - 1; i >= 0; i--) {
            reverseWord += userWord.charAt(i);
        }

        if ( userWord.equals(reverseWord)){
            System.out.println( "* " + userWord + " *" + "  palindoromik bir kelimedir.");
        }
        else  {
            System.out.println( "* " + userWord + " *" + "  palindoromik DEGILDIR.");
        }

        

    }
}
