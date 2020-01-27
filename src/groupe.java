import java.util.ArrayList;
import java.util.*;

public class groupe {
    int numofGroupe;
    private ArrayList<Student> listofstudents =new ArrayList<Student>();
    public Student getStudent(String student_name) {

        for (var i : this.listofstudents) {
            if (student_name.equals(i.name)) {
                System.out.println("Есть студент" + i.getName());
                return i;



            } else {
                System.out.println("Нет cтудента");
            }
        }

        return null;
    }


}
