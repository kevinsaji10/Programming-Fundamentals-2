import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        // a
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details of the first person:");

        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        sc.nextLine();

        //b
        Person aPerson = new Person(firstName, lastName, age);
        
        //c
        System.out.println(aPerson.toString());

        //d
        System.out.println("Enter details of the second person:");

        System.out.print("Enter first name: ");
        String firstName1 = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName1 = sc.nextLine();

        //e
        Person otherPerson = new Person(firstName1, lastName1);

        //f
        System.out.println(otherPerson.toString());

        //g
        System.out.print("Enter age: ");
        int age1 = sc.nextInt();
        otherPerson.setAge(age1);

        // h
        System.out.println(otherPerson.toString());

        sc.close();
    }
    
}