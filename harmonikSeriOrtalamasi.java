package metots;

import java.util.Scanner;

public class harmonikSeriOrtalamasi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double sum = 0 ;
        double harmonicAverage = 0 ;

        System.out.println();
        System.out.println("Calculating harmonic mean in series");
        System.out.println();

        System.out.println("Number of elements of the array: ");

        System.out.print("Enter the number of LIST LEGHT: ");
        int listLeght = input.nextInt();
        System.out.println();

        int[] list = new int[listLeght];

        System.out.print("Enter array elements: ");
        System.out.println();

        for (int i=0 ; i<list.length ; i++) {
            System.out.print( i + ". element: ");
            list[i] = input.nextInt();
            System.out.println();
        }

        for (int i=0 ; i < list.length ; i++) {
            System.out.print( i + ". element: ");
            System.out.print(list[i]);
            System.out.println();

        }
        System.out.println();

        for  (int i=0 ; i<list.length ; i++){
            sum+= 1/list[i];
        }

        System.out.print("List : {");

        for  (int i=0 ; i<list.length ; i++){
            System.out.print(list[i] + ", ");
        }
        System.out.println("}");

        System.out.println();

        harmonicAverage = sum/ list.length;

        System.out.println();
        System.out.println("HARMONIC AVERAGE = " + harmonicAverage);




    }

}
