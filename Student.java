package StudentGrandingSystes;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;
    int matverbalNote;
    int fizikverbalNote;
    int kimyaverbalNote;



    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya,int matverbalNote,int fizikverbalNote,int kimyaverbalNote) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
        this.matverbalNote = matverbalNote;
        this.fizikverbalNote = fizikverbalNote ;
        this.kimyaverbalNote = kimyaverbalNote ;



    }


    public void addBulkExamNote(int mat, int fizik, int kimya , int matverbalNote , int fizikverbalNote , int kimyaverbalNote) {

        if (mat >= 0 && mat <= 100 && matverbalNote >= 0 && matverbalNote <= 100 ) {
            this.mat.note = mat;
            this.matverbalNote = matverbalNote ;
        }

        if (fizik >= 0 && fizik <= 100 && fizikverbalNote >= 0 && fizikverbalNote <= 100) {
            this.fizik.note = fizik;
            this.fizikverbalNote = fizikverbalNote ;
        }

        if (kimya >= 0 && kimya <= 100 && kimyaverbalNote >= 0 && kimyaverbalNote <= 100) {
            this.kimya.note = kimya;
            this.kimyaverbalNote = kimyaverbalNote ;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.matverbalNote==0 || this.fizik.note == 0 || this.fizikverbalNote == 0 || this.kimya.note == 0 || this.kimyaverbalNote==0){
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNoteStudent();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.8) + (this.fizikverbalNote* 0.2)) + ((this.mat.note * 0.8) + (this.matverbalNote * 0.2)) + ((this.kimya.note * 0.8) + (this.kimyaverbalNote * 0.2))) / 3;
        if ( this.avarage>100 && this.avarage<0){
            System.out.println("Hatali not girisi");
        }
    }





    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNoteStudent(){
        System.out.println("<><><><><><><><><><><><><><><><><><>");
        System.out.println("Öğrenci \t: " + this.name);
        System.out.println("Matematik Notu \t: " + this.mat.note);
        System.out.println("Fizik Notu \t: " + this.fizik.note);
        System.out.println("Kimya Notu \t: " + this.kimya.note);
        System.out.println("Matematik Sözlü Notu \t: " + this.matverbalNote);
        System.out.println("Fizik Sözlü Notu \t: " + this.fizikverbalNote);
        System.out.println("Kimya Sözlü Notu \t: " + this.kimyaverbalNote);

    }

}