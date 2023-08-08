import java.util.*;
import java.io.*;

public class AppTest {
   
    private static void testMissingFile() {
        String filename = "testdata0.txt";
        System.out.println("*** Test File : \"" + filename + "\" ***");
        
        System.out.println("Expected : FileNotFoundException");
        try {
            Map<Integer, Employee> employees = new App().loadFile(filename);
            System.out.println("  Actual : No exception caught");
            System.out.println("  Result : Fail.  ");
        } catch (FileNotFoundException e) {
            System.out.println("  Actual : FileNotFoundException");
            System.out.println("  Result : Passed");
        } catch (Throwable ex) {
            System.out.println("  Result : Fail.");
            ex.printStackTrace();
        }
        System.out.println();
    }

    private static void testInvalidFile() {
        String filename = "testdata1.txt";
        System.out.println("*** Test File : \"" + filename + "\" ***");
      
        System.out.println("Expected : InvalidDataException java.lang.NumberFormatException: For input string: \"b\"");
        System.out.println("OR");
        System.out.println("Expected : InvalidDataException java.util.InputMismatchException");

        try {
            Map<Integer, Employee> employees = new App().loadFile(filename);
            System.out.println("  Actual : No exception caught");
            System.out.println("  Result : Fail.  ");
        } catch (InvalidDataException e) {
            System.out.println("  Actual : InvalidDataException " + e.getMessage());
        } catch (Throwable ex) {
            System.out.println("Result: Fail.");
            ex.printStackTrace();
        }
        System.out.println();
    }
    
    private static void testValidFile() {
        String filename = "testdata2.txt";
        
        System.out.println("*** Test File : \"" + filename + "\" ***");
        
        try {
            Map<Integer, Employee> employees = new App().loadFile(filename);
            System.out.println("Expected : 4 employees loaded");
           
            if (employees == null) {
                System.out.println("  Actual : No employees loaded");
                System.out.println("  Result : Fail");
                System.out.println();
            } else {    
                System.out.println("  Actual : " + employees.size() + " employees loaded");
                if (employees.size() == 4){
                    System.out.println("  Result : Passed");
                } else {
                    System.out.println("  Result : Fail");
                }
                System.out.println();

                System.out.println("Expected : Employee and Dependents");
                System.out.println("---------------------------------------");
                System.out.println("1.Name : Steven Lim - Age : 35");
                System.out.println("Spouse Name : Lee - Age : 20");
                System.out.println("---------------------------------------");
                System.out.println("2.Name : Johnson Lee - Age : 45");
                System.out.println("Child Name : Lee - Age : 2");
                System.out.println("Child Name : Ah Seng Lee - Age : 10");
                System.out.println("Child Name : Janice Lee - Age : 15");
                System.out.println("Spouse Name : Jane Tan - Age : 30");
                System.out.println("---------------------------------------");
                System.out.println("3.Name : Low - Age : 30");
                System.out.println("Child Name : Daniel Low - Age : 3");
                System.out.println("Child Name : Danny Low - Age : 5");
                System.out.println("Spouse Name : Daisy Tan - Age : 25");
                System.out.println("---------------------------------------");
                System.out.println("4.Name : Andy Tan - Age : 25");
                System.out.println("---------------------------------------");

                System.out.println();
                System.out.println("Actual : Employee and Dependents");
                for (Map.Entry<Integer,Employee> entry : employees.entrySet())  {
                    System.out.println("---------------------------------------");
                    Employee e = entry.getValue();
                    System.out.println(entry.getKey().toString() + "." + e);
                    for (Dependent d : e.getDependents()){
                        System.out.println(d);
                    }
                }
                System.out.println("---------------------------------------");  
            }
        }catch (Throwable ex) {
            System.out.println("  Result : Fail");
            ex.printStackTrace();
        }
        System.out.println();
    }    
    
    public static void main(String[] args) {
        testMissingFile();
        testInvalidFile();
        testValidFile();
    }
}