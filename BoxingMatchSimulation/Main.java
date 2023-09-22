package BoxingMatchSimulation;

public class Main {
    public static void main(String[] args) {

        Fighter fighter1 = new Fighter( "Mike Tyson" , 25 , 100 , 110 , 80);
        Fighter fighter2 = new Fighter( "Muhammed Ali" , 15 , 100 , 105 , 60);

        Match match = new Match( fighter1 , fighter2 , 125 , 90) ;
        match.run();



    }
}
