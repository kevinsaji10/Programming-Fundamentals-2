
// Name:
// Email ID:

//##############################################################
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App {
    public Map<Integer, Employee> loadFile(String filename) throws InvalidDataException, FileNotFoundException {
        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException();
        }
        Map<Integer, Employee> map = new HashMap<>();
        // variable initialisation
        // employee variables
        String firstNameEmp = null;
        String lastNameEmp = "";
        int ageEmp;
        int empid;
        // spouse variables
        String firstNameSp = null;
        String lastNameSp = "";
        int ageSpouse;
        // child variables
        String childFirstName = null;

        try (Scanner fileSc = new Scanner(file)) {

            System.out.println("x");
            while (fileSc.hasNextLine()) {
                // split each row into different components
                String[] current = fileSc.nextLine().split("#");
                int index = 0;
                // emp id
                empid = Integer.parseInt(current[index]);
                index++;

                // for employee details
                // emp name
                String[] employeeDetails = (current[index]).split(",");
                // emp age
                ageEmp = Integer.parseInt(employeeDetails[employeeDetails.length - 1]);
                String[] fullName = employeeDetails[0].split(" ");
                // first name emp
                if (fullName.length > 1) {
                    // emp first name if present
                    firstNameEmp = "";
                    for (int i = 0; i < fullName.length - 1; i++) {
                        firstNameEmp += fullName[i];
                    }
                }
                // lastnameEmp emp
                lastNameEmp = fullName[fullName.length - 1];
                index++;
                Employee e = new Employee(firstNameEmp, lastNameEmp, ageEmp);
                // create dependent array for spouse and child details
                ArrayList<Dependent> dependents = new ArrayList<>();

                // for spouse details
                if (current.length >= 3) {

                    // spouse name
                    String[] spouseDetails = (current[index]).split(",");
                    // spouse age
                    ageSpouse = Integer.parseInt(spouseDetails[spouseDetails.length - 1]);
                    String[] spfullName = spouseDetails[0].split(" ");
                    // first name spouse
                    if (spfullName.length > 1) {
                        // spouse first name if present
                        firstNameSp = "";
                        for (int i = 0; i < spfullName.length - 1; i++) {
                            firstNameSp += spfullName[i];
                        }
                    }
                    // lastname of spouse
                    lastNameSp = spfullName[spfullName.length - 1];
                    // add spouse to dependent
                    dependents.add(new Dependent(firstNameSp, lastNameSp, ageSpouse, 'S'));
                    index++;
                }
                // for children
                if (current.length == 4) {
                    String childLastName = "";
                    int childAge;
                    String[] allChildrenDetails = current[index].split(",");
                    for (int i = 0; i < allChildrenDetails.length - 1; i += 2) {
                        String[] childFullName = allChildrenDetails[i].split(" ");

                        if (childFullName.length > 1) {
                            // first name if present
                            childFirstName = childFullName[0];
                            for (int j = 1; j < childFullName.length - 1; j++) {
                                childFirstName += " " + childFullName[j];
                            }
                        }
                        // lastname for child
                        childLastName = childFullName[childFullName.length - 1];

                        childAge = Integer.parseInt(allChildrenDetails[i + 1]);
                        dependents.add(new Dependent(childFirstName, childLastName, childAge, 'C'));
                    }
                }
                Collections.sort(dependents);
                e.setDependents(dependents);
                map.put(empid, e);
            }

            return map;
        } catch (Exception e) {
            throw new InvalidDataException(e);
        }
    }
}