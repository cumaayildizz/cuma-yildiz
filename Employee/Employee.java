package Employee;

public class Employee {

    String name ;
    double salary ;
    int workHours ;
    int hearYear ;
    int bonusTimeFee = 30 ;
    int thisYear = 2021 ;

/*
    Employee(name,salary,workHours,hireYear) : Kurucu metot olup 4 parametre alacaktır.
    tax() : Maaşa uygulanan vergiyi hesaplayacaktır.
    Çalışanın maaşı 1000 TL'den az ise vergi uygulanmayacaktır.
    Çalışanın maaşı 1000 TL'den fazla ise maaşının %3'ü kadar vergi uygulanacaktır.
    bonus() : Eğer çalışan haftada 40 saatten fazla çalışmış ise fazladan çalıştığı her saat başına 30 TL olacak şekilde bonus ücretleri hesaplayacaktır.
    raiseSalary() : Çalışanın işe başlangıç yılına göre maaş artışını hesaplayacaktır. Şuan ki yılı 2021 olarak alın.
    Eğer çalışan 10 yıldan az bir süredir çalışıyorsa maaşına %5 zam yapılacaktır.
    Eğer çalışan 9 yıldan fazla ve 20 yıldan az çalışıyorsa maaşına %10 zam yapılacaktır.
    Eğer çalışan 19 yıldan fazla çalışıyorsa %15 zam yapılacaktır.
    toString() : Çalışana ait bilgileri ekrana bastıracaktır.
*/
    Employee( String name , int salary , int workHours , int hearYear ){

        this.name = name ;
        this.salary = salary ;
        this.workHours = workHours ;
        this.hearYear = hearYear ;

    }

    private double tax (){
        double tax = 0 ;
        if (this.salary > 1000){
            tax = (this.salary*0.003) ;
            return tax;
        }
        else return tax;
    }

    private double bonus() {
        double bonus = 0 ;
        if (workHours>40){
            bonus = (this.workHours - 40)*this.bonusTimeFee ;
            return bonus ;
        }
        return 0 ;
    }

    private double riseSalary(){

        double riseSalary ;

       if ((this.thisYear - hearYear) > 9 && (this.thisYear - hearYear) < 19 ){
           riseSalary = (this.salary * 0.10) ;
           return riseSalary ;
       }
        else if ((this.thisYear - hearYear) > 20 ){
            riseSalary = (this.salary * 0.15) ;
            return riseSalary ;
        }
       else if ((this.thisYear - hearYear) < 10 ){
           riseSalary = (this.salary * 0.05) ;
           return riseSalary ;
       }
       else {
           System.out.println("Girdiğiniz değerler hatalı!! Lütfen kontrol ediniz");
           return 0 ;
       }

    }
    private double totalSalary(){
        double totalSalary = this.salary + riseSalary() + bonus() - tax() ;
        return totalSalary;
    }

    private double salaryTaxAndBonus (){
        double salaryTB = this.salary + bonus() + riseSalary() - tax() ;
        return salaryTB ;
    }


    public void employeeInformationPrint(){
        System.out.println( "İSİM                              : " + this.name  );
        System.out.println( "MAAŞ                              : " + this.salary  );
        System.out.println( "ÇALIŞMA SAATİ                     : " + this.workHours  );
        System.out.println( "İŞE BAŞLAMA TARİHİ                : " + this.workHours  );
        System.out.println( "VERGİ                             : " + tax()  );
        System.out.println( "İSİM                              : " + bonus()  );
        System.out.println( "MAAŞ ARTIŞI                       : " + riseSalary()  );
        System.out.println( "VERGİ VE BONUSLARLA BİRLİKTE MAAŞ : " + salaryTaxAndBonus() );
        System.out.println( "TOPLAM MAAŞ                       : " + totalSalary()  );
    }



    public static void main(String[] args) {

        Employee employee1 = new Employee("Cuma" , 2500 , 48 , 2018);
        Employee employee2 = new Employee("Ahmet" , 1000 , 55 , 2000);
        Employee employee3 = new Employee("Ali" , 5000 , 35 , 2008);

        employee1.employeeInformationPrint();
        System.out.println("===============================================================");
        employee2.employeeInformationPrint();
        System.out.println("===============================================================");
        employee3.employeeInformationPrint();








    }
}
