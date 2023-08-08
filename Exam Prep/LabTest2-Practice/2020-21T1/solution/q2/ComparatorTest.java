import java.util.ArrayList;
import java.util.Collections;

public class ComparatorTest {
    public static void main(String[] args) {
        int num = 1;
        {
            ArrayList<Employee> employees = new ArrayList<>();

            ProjectManager pm3 = new ProjectManager("Starling", "202008");
            Project p3 = new Project("three", 10000, true);
            pm3.addProject(p3);

            ProjectManager pm4 = new ProjectManager("Bulbul", "202001");
            Project p4 = new Project("four", 8000, true);
            pm4.addProject(p4);

            Employee e2 = new Administrator("Pigeon", "202001", 2500);
            Employee e3 = new Administrator("Plover", "202001", 3000);

            employees.add(pm4);
            employees.add(pm3);
            employees.add(e2);
            employees.add(e3);

            System.out.printf("Test %d:%n", num);
            System.out.println("Expected:");
            System.out.println("[[Name: Starling, type: ProjectManager, JoinedDate: 202008, projects worth: 10000], [Name: Bulbul, type: ProjectManager, JoinedDate: 202001, projects worth: 8000], [Name: Pigeon, type: Administrator, JoinedDate: 202001], [Name: Plover, type: Administrator, JoinedDate: 202001]]");
            System.out.println();
            System.out.println("Actual:");
            Collections.sort(employees, new EmployeeComparator());
            System.out.println(employees);
        }

        {
            ArrayList<Employee> employees = new ArrayList<>();

            Employee e1 =  new Administrator("Albatross", "201801", 1000);
            Employee e3 = new Administrator("Blackbird", "202001", 3000);
            Employee e4 = new Administrator("Cowbird", "201905", 2200);

            employees.add(e3);
            employees.add(e4);
            employees.add(e1);

            num++;
            System.out.println();
            System.out.printf("Test %d:%n", num);
            System.out.println("Expected:");
            System.out.println("[[Name: Albatross, type: Administrator, JoinedDate: 201801], [Name: Blackbird, type: Administrator, JoinedDate: 202001], [Name: Cowbird, type: Administrator, JoinedDate: 201905]]");
            System.out.println();
            System.out.println("Actual:");
            Collections.sort(employees, new EmployeeComparator());
            System.out.println(employees);
        }

        {
            ArrayList<Employee> employees = new ArrayList<>();

            Employee e1 =  new Administrator("Mynah", "202003", 1000);
            Employee e3 = new Administrator("Mynah", "201905", 3000);
            Employee e4 = new Administrator("Mynah", "202001", 2200);

            employees.add(e1);
            employees.add(e3);
            employees.add(e4);

            num++;
            System.out.println();
            System.out.printf("Test %d:%n", num);
            System.out.println("Expected:");
            System.out.println("[[Name: Mynah, type: Administrator, JoinedDate: 201905], [Name: Mynah, type: Administrator, JoinedDate: 202001], [Name: Mynah, type: Administrator, JoinedDate: 202003]]");
            System.out.println();
            System.out.println("Actual:");
            Collections.sort(employees, new EmployeeComparator());
            System.out.println(employees);
        }

    }
}