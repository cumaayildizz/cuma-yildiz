package metots;


import java.util.Scanner;


public class powerRecursive {

    static double power(double number1,double number2){

        if (number2==0){
            return 1;
        }
        if(number2<0){
            return (1/number1*power(number1,number2+1));
        }
        else {
            return number1*power(number1,number2-1);
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double number1,number2;

        System.out.println();
        System.out.println("Lutfen ussu alinacak sayilari girin");
        System.out.println();

       do {
           System.out.print("Taban: ");
           number1= input.nextDouble();

           System.out.print("Üs: ");
           number2= input.nextDouble();
           System.out.println();

          System.out.println("SONUÇ= " + power(number1,number2));
           System.out.println();


       }while (number1!=0 && number2!=0);


    }
}
