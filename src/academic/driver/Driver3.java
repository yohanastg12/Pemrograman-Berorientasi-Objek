package academic.driver;
import java.util.Scanner;
import academic.model.Enrollment;

/**
 * @author 12S22050--YOHANA SITANGGANG
 */
public class Driver3 {

    public static void main(String[] _args) {

        //create object enrollment
        Scanner scanner = new Scanner(System.in);

        //input code
        String code = scanner.nextLine();
        //input id
        String id = scanner.nextLine();
        //input academic year
        String academicYear = scanner.nextLine();
        //input semester
        String semester = scanner.nextLine();  

        //create object enrollment
        Enrollment enrollment = new Enrollment(code, id, academicYear, semester);
        System.out.println(enrollment);

        scanner.close();
    }
    

}