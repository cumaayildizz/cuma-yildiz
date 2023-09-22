package BoxingMatchSimulation;

public class Match {

    Fighter fighter1 ;
    Fighter fighter2 ;
    int maxWeight ;
    int minWeight ;

    int start ;

    Match(Fighter fighter1 , Fighter fighter2 , int maxWeight , int minWeight ){
        this.fighter1 = fighter1 ;
        this.fighter2 = fighter2 ;
        this.maxWeight = maxWeight ;
        this.minWeight = minWeight ;
        this.start = start ;
    }

    void run(){

        if(isCheck()){
                while (this.fighter1.health > 0 && this.fighter2.health > 0){

                   if (start > 0){
                       System.out.println("**********YENI RAUND**********");

                       this.fighter2.health = this.fighter1.hit(fighter2);
                       if(isWin()){
                           break;
                       }

                       this.fighter1.health = this.fighter2.hit(fighter1);
                       if(isWin()){
                           break;
                       }

                       System.out.println( this.fighter2.name + " enerjisi = " + this.fighter2.health );
                       System.out.println( this.fighter1.name + " enerjisi = " + this.fighter1.health);
                   }

                   else {

                       System.out.println("**********YENI RAUND**********");

                       this.fighter1.health = this.fighter2.hit(fighter1);
                       if(isWin()){
                           break;
                       }

                       this.fighter2.health = this.fighter1.hit(fighter2);
                       if(isWin()){
                           break;
                       }

                       System.out.println( this.fighter1.name + " enerjisi = " + this.fighter1.health );
                       System.out.println( this.fighter2.name + " enerjisi = " + this.fighter2.health);

                   }

                }

        }

        else {
            System.out.println("Dövüşçülerin sikleti bu müsabaka için uygun değil");
        }

    }


    boolean isCheck(){
        return  (this.fighter1.weight >= minWeight) && (this.fighter1.weight <= maxWeight) &&
                (this.fighter2.weight >= minWeight) && (this.fighter2.weight <= maxWeight);
    }

    boolean isWin(){
        if( this.fighter1.health <= 0 ){
            System.out.println(this.fighter2.name + " KAZANDI");
            return true ;
        }
        if( this.fighter2.health <= 0 ){
            System.out.println(this.fighter1.name + " KAZANDI");
            return true ;
        }
        return false ;
    }

    boolean isStart(){
        double star = Math.random()*100;
        if (start >= 0){
            return true ;
        }if (start < 0){
            return true ;
        }
        return false;

    }




}
