package co.edu.cesde.pi.app;
import co.edu.cesde.pi.models.Groups;
import co.edu.cesde.pi.models.Subjects;
import co.edu.cesde.pi.models.Teachers;

public class Main {

    public static void main(String[] args) {
        Groups group1= new Groups(12345L, 234, "abc", "def", "hij");
        System.out.println(group1.toString());

        Subjects group2= new Subjects();
        System.out.println(group2.toString());

        Teachers group3= new Teachers();
        System.out.println(group3.toString());
    }

}
