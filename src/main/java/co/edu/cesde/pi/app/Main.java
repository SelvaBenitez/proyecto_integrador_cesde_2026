package co.edu.cesde.pi.app;
import co.edu.cesde.pi.models.*;



public class Main {

    public static void main(String[] args) {

    Enrollment enrrol1 = new Enrollment(543, "12a3","01a","02p");
    System.out.println(enrrol1.toString());

    Students student1 =new Students(12737812L,234L,"093","1839274623","Julian","Gallego","2004-01-08",true);
    System.out.println(student1.toString());

    Users user1 = new Users(234L, "GallegoJulian","65rtdfhuy",true);
    System.out.println(user1.toString());

    Grades grade1 = new Grades(543L,678273L,3.8, "observation");
    System.out.println(grade1.toString());

    Period period1 = new Period(34567,"02/04/26","30/11/26");
    System.out.println(period1.toString());

    Programs program1 = new Programs(97787,"Logica de programación");
    System.out.println(program1.toString());
    }

}
