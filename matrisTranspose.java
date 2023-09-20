package metots;

import java.util.Scanner;

public class matrisTranspose {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("***MATRIS TRANSPOSE***");
        System.out.println();
        System.out.println("Please enter the matrix values you want to create");

        System.out.print("ROW: ");
        int row = input.nextInt();

        System.out.print("COLUMN: ");
        int column = input.nextInt();

        System.out.println("Enter in matris number");

        int[][] transpose = new int [column][column];

        for(int j = 0; j<row; j++){
            for (int i=0; i<column ; i++)
            {
             transpose[j][i] = input.nextInt();
            }
        }

        System.out.println("TRASPOSE MATRIS");

        for(int i=0; i<column; i++){    // change column and row
            for (int j=0; j< row ; j++){
                System.out.print(transpose[j][i] + " , ");
            }
            System.out.println();
        }



    }
}
