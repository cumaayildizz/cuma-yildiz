package metots;

public class bHarfiYazdir {
    public static void main(String[] args) {

        String[][] harf = new String[5][5];

        System.out.println();
        System.out.println(" * ile B harfi yazdirma ----");
        System.out.println();

        for (int i=0 ; i< harf.length ; i++){
            for (int j=0 ; j < harf.length ;j++ ){
                if( i==0 || i==2 || i==4 || j==0 || j==4){
                    if((i==0 && j==4) || (i==2 && j==4 || (i==4 && j==4))){
                        System.out.print("  ");
                    }
                    else {
                        System.out.print("* ");
                    }

                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }



    }
}
