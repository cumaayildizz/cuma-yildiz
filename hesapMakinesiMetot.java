package metots;

import java.util.Scanner;

public class hesapMakinesiMetot {

    static int plus(int number1 , int number2 ){
        int result = number1 + number2;
        System.out.println( number1 + "+" + number2 + "=" + result);
        return number1+number2;
    }


    static int minus(int number1 , int number2 ){
        int result = number1 - number2;
        System.out.println( number1 + "-" + number2 + "=" + result);
        return number1-number2;
    }


    static int times(int number1 , int number2 ){
        int result = number1 * number2;
        System.out.println( number1 + "*" + number2 + "=" + result);
        return number1*number2;
    }


    static int divided(int number1 , int number2 ){
        int result = number1 / number2;
        if (number2==0)
        {
            System.out.println("2. sayı(Bölen eleman) 0 olamaz!! \n" +
                    "Lütfen başka bir sayı giriniz. ");
            return 0;
        }
        System.out.println( number1 + "/" + number2 + "=" + result);
        return number1 / number2;
    }


    static int base(int number1 , int number2 ){
        int result = 1;

        for(int i=1 ; i<=number2 ; i++){
            result*=number1;
        }

        System.out.println( number1 + "^" + number2 + "=" + result);
        return number1 / number2;
    }


    static int mode(int number1 , int number2 ){
        int result = number1 % number2;
        System.out.println( number1 + "%" + number2 + "=" + result);
        return number1 / number2;
    }


    static int rectangle(int number1 , int number2 ){

        int rectangularPerimeter = 2*number1 + 2*number2;
        int rectangularArea = number1 * number2;

        System.out.println( "Dikdörtgen Çevre= " + rectangularPerimeter);
        System.out.println("Dikdörtgen Alan= " + rectangularArea);

        return number1 / number2;
    }



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.println("****MİNİ HESAP MAKİNESİ****");

        do{

            System.out.println();
            System.out.println("Yapmak istedğiniz işlemi seçiniz");
            System.out.println();

            System.out.println( "1(+)  2(-)  3(*)  4(/)  5(^)   6(%)  7(Didörtgen Çevre-Alan)" );
            System.out.print("İşlem : " );

            int select=input.nextInt();

            System.out.println( "İşlem yapılacak sayıları seçiniz" );

            System.out.println("1.Sayı: ");
            int number1 = input.nextInt();

            System.out.println("2.Sayı: ");
            int number2 = input.nextInt();

            System.out.print("SONUÇ= ");

            switch (select){

                case 1 :
                    plus(number1,number2) ;
                    break;

                case 2:
                    minus(number1,number2) ;
                    break;

                case 3 :
                    times(number1,number2) ;
                    break;

                case 4:
                    divided(number1,number2) ;
                    break;

                case 5:
                    base(number1,number2) ;
                    break;

                case 6 :
                    mode(number1,number2) ;
                    break;

                case 7:
                    rectangle(number1,number2) ;
                    break;


            }

        }while (true);



    }
}
