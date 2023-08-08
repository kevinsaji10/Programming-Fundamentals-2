import java.io.*;
import java.util.*;

public class App {
    
    public Map<Integer, Employee> loadFile(String filename) throws FileNotFoundException, InvalidDataException   
    {
        Map<Integer, Employee> result = new TreeMap<>();
        try (Scanner sc = new Scanner(new File(filename));) {
          while (sc.hasNext()){
                String row = sc.nextLine();
                Scanner lineSc = new Scanner(row);
                lineSc.useDelimiter("#");

                 int id = lineSc.nextInt();
               // int id = Integer.parseInt(lineSc.next());

                String employee = lineSc.next();
                Scanner employeeSc = new Scanner(employee);
                employeeSc.useDelimiter(",");

                String fullName = employeeSc.next();
                String[] name = splitName(fullName);
                int age = employeeSc.nextInt();
                employeeSc.close();
                
                ArrayList<Dependent> dependents = new ArrayList<>();
                Employee e = new Employee(name[0], name[1], age);
            
                if (lineSc.hasNext()){
                    String Spouse = lineSc.next();
                    Scanner spouseSc = new Scanner(Spouse);
                    spouseSc.useDelimiter(",");

                    String sFullName = spouseSc.next();
                    String[] sName = splitName(sFullName);
                    int sAge = spouseSc.nextInt();
                    Dependent spouse = new Dependent(sName[0], sName[1], sAge, 'S');
                    dependents.add(spouse);
                    spouseSc.close();
                }

                if (lineSc.hasNext()){
                    String children = lineSc.next();
                    Scanner childrenSc = new Scanner(children);
                    childrenSc.useDelimiter(",");

                    while (childrenSc.hasNext()){
                        String cFullName = childrenSc.next();
                        String[] cName = splitName(cFullName);
                        int cAge = childrenSc.nextInt();
                        Dependent child = new Dependent(cName[0], cName[1], cAge, 'C');
                        dependents.add(child);
                    }
                    childrenSc.close();  
                }
            
                Collections.sort(dependents);
                e.setDependents(dependents);
                result.put(id, e);
                lineSc.close();
            }
        } catch (FileNotFoundException e){
            throw new FileNotFoundException();
        } catch (Throwable e){
            throw new InvalidDataException(e);
        }
        return result;
    }

    private String[] splitName(String fullName){
        String[] temp = fullName.split(" ");
        String[] result = new String[2]; 

        int numWords = temp.length;

        for (int i=0; i<temp.length-1; i++){
            if (result[0] == null){
                result[0] = "";
            } 
            result[0] += temp[i];
            if (i < temp.length -2){
                result[0] += " ";
            }
        }

        result[1] = temp[numWords-1];
     
        return result; 
    }
}