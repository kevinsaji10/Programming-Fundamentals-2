import java.util.Scanner;

public class CompanyTest {
    // h
    public static void checkEmployee(Company comp, int id) {
        System.out.println(comp.getEmployee(id).getName());
        System.out.println(comp.getEmployee(id).getSalary());
        if ( comp.getEmployee(id).getSpouse() == null) {
            System.out.println("He/she does not have a spouse.");
        } else {
            System.out.println(comp.getEmployee(id).getSpouse().getName());
        }
    }
    public static void main(String[] args) {
        //a
        Company company = new Company("UMS");
        // b
        Spouse spouse = new Spouse("Kate", 37);
        Employee employee = new Employee("John", 5, 2500, 'M', spouse);
        company.addEmployee(employee);
        // c
        System.out.printf("$%.1f\n", company.getAllEmployeesSalary());
        // d
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter gender: ");
        char gender = sc.next().charAt(0);

        Employee maidenless = new Employee(name, id, salary, gender);
        company.addEmployee(maidenless);
        // e
        System.out.printf("Total salary (after addition): $%.1f\n", company.getAllEmployeesSalary());
        // f
        //g
        checkEmployee(company, 4);
        checkEmployee(company, 5);
        

;



    }
}
