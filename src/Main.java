public class Main {

    public static void main(String[] args) {
	    Student student1 = new Student();
	    student1.fullName="Ayşe Gündüzoğullarından";
	    student1.courseId="1";
	    student1.id="12345";
	    student1.email="aysegunduzogullarindan@email.me";
	    student1.password="ayse12345";
	    student1.courseName="Java Kursu";

        Student student2 = new Student();
        student2.fullName="Yağız Kuvvetligillerden";
        student2.courseId="2";
        student2.id="12346";
        student2.email="yagizkuvvetligillerden@email.me";
        student2.password="yagiz12346";
        student2.courseName="Python Kursu";

        Student student3 = new Student();
        student3.fullName="Fırat Mermeroğullarından";
        student3.courseId="3";
        student3.id="12347";
        student3.email="mermerogullarindan@email.me";
        student3.password="firat12347";
        student3.courseName="C++ Kursu";

        Instructor instructor1 =new Instructor();
        instructor1.fullName="Mehmet Ahmetgillerden";
        instructor1.courseId="1";
        instructor1.id="99991";
        instructor1.email="mehmetahmetgillerden@email.me";
        instructor1.password="mehmet99991";
        instructor1.courseName="Java Kursu";

        Instructor instructor1 =new Instructor();
        instructor1.fullName="Fatma Turangillerden";
        instructor1.courseId="2";
        instructor1.id="99992";
        instructor1.email="fatmaturangillerden@email.me";
        instructor1.password="fatma99992";
        instructor1.courseName="Python Kursu";

        Instructor instructor1 =new Instructor();
        instructor1.fullName="Ajda Pekkangillerden";
        instructor1.courseId="3";
        instructor1.id="99993";
        instructor1.email="ajdapekkangillerden@email.me";
        instructor1.password="ajda99993";
        instructor1.courseName="C++ Kursu";

        StudentManager studentManager = new StudentManager();
        studentManager.addCourse();
    }
}
