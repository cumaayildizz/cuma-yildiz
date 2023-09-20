package metots;

import java.util.Scanner;
import java.util.Arrays;

public class numberRightAndsLeftValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the list leght: ");

        int value = input.nextInt();
        int[] list = new int[value];



        for( int i=0; i< list.length; i++) {
            list[i] = (int) (Math.random() * 100);
        }

        Arrays.sort(list);  // listeyi kucukten buyuge siraladik
        System.out.println(Arrays.toString(list));

        System.out.println();
        System.out.print("Enter the element (0-100) you want to add to the array: ");
        System.out.println();


        int numberUser = input.nextInt();

        int smallNumbers = 0;

        for (int i=0; i<list.length; i++ ){
            if (numberUser>list[i]) {
                smallNumbers++;
            }
        }

        if (smallNumbers==0){
            System.out.println("smal number: " + numberUser  );
            System.out.println("big number: " + list[smallNumbers] );
        }
        else if (smallNumbers==list.length) {
            System.out.println("smal number: " + list[smallNumbers-1] );
            System.out.println("big number: " + numberUser );
        }

        else {
            System.out.println("smal number: " + list[smallNumbers-1] );
            System.out.println("big number: " + list[smallNumbers] );
        }


    }
}
