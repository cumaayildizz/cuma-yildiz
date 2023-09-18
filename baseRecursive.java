package metots;

import java.util.EventListener;
import java.util.Scanner;

public class baseRecursive {

    static double base(double number1,double number2){
        if (number2!=0){
            return number1*number1;
        }
        else {
            return 0;
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1,number2;

        System.out.print("Taban: ");
        number1= input.nextDouble();

        System.out.println();
        System.out.print("Üs: ");
        number2= input.nextDouble();
        System.out.println();


        System.out.println("SONUÇ= " + number1*base(number1-1,0));

    }
}
