package StudentGrandingSystes;

public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "101", "MAT");
        Course fizik = new Course("Fizik", "102", "FZK");
        Course kimya = new Course("Kimya", "103", "KMY");


        Teacher teacherMat = new Teacher("Cuma YILDIZ", "90 555 555 55 55", "MAT");
        Teacher teacherFizik = new Teacher("Adnan OKTAR", "90 500 500 50 50", "FZK");
        Teacher teacherKimya = new Teacher("Patika DEV", "90 545 222 22 22", "KMY");

        mat.addTeacher(teacherMat);
        fizik.addTeacher(teacherFizik);
        kimya.addTeacher(teacherKimya);

        Student s1 = new Student("Leyla MECNUN", 12, "1453", mat, fizik, kimya,
                50, 60, 80);

        s1.addBulkExamNote(50,60,20 , 80 , 20 , 35 );
        s1.isPass();

        Student s2 = new Student("Kerem ASLI", 12, "1945", mat, fizik, kimya,
                50 , 45 , 85);

        s2.addBulkExamNote(90,40,80 , 70 , 50 , 85 );
        s2.isPass();

        Student s3 = new Student("Ferhat ŞİRİN", 12, "1789", mat, fizik, kimya
        ,80,70,65);
        s3.addBulkExamNote(30,60,40 ,70 , 50 , 85);
        s3.isPass();

    }
}