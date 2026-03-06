package co.edu.cesde.pi.app;
import co.edu.cesde.pi.models.Enrollment;
import co.edu.cesde.pi.models.Students;
import co.edu.cesde.pi.models.Users;

public class Main {
    public static void main(String[] args) {

    Enrollment enrrol1 = new Enrollment(543, "12a3","01a","02p");
    System.out.println(enrrol1.toString());

    Students student1 =new Students(12737812L,234L,"093","1839274623","Julian","Gallego","2004-01-08",true);
    System.out.println(student1.toString());

    Users user1 = new Users(234L, "GallegoJulian","65rtdfhuy",true);
    System.out.println(user1.toString());
    }
}
