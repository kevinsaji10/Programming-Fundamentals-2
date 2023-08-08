import java.io.*;
import java.util.*;

public class Utility {
    
    public static Map<String, List<Person>> load(String filename) throws FileNotFoundException, InvalidInfoException   
    {
        Map<String, List<Person>> result = new HashMap<>();
       
        String name = "";
        int count = 0;

        try (Scanner sc = new Scanner(new File(filename));) {
          sc.nextLine();
          while (sc.hasNext()){
                count++;
                String row = sc.nextLine();
                Scanner lineSc = new Scanner(row);
                lineSc.useDelimiter(":");

                name = lineSc.next();
                int age = lineSc.nextInt();
                String school = "";

                String[] medical = lineSc.next().split(",");
                List<String> medicalCondition = null;
                if (!medical[0].equals("NA")){
                    medicalCondition = Arrays.asList(medical);
                }

                if (age <= 18){
                    school = lineSc.next();
                }
                
                String vaccineCentre = lineSc.next();
                String vaccine = lineSc.next();
                char shotType = lineSc.next().charAt(0);
               
                Person person = null;
                if (age <= 18){
                    person = new Youth(name, age, medicalCondition, school, vaccineCentre, vaccine, shotType);
                } else {
                    person = new Adult(name, age, medicalCondition, vaccineCentre, vaccine, shotType, age>=65 );
                }

                List<Person> p = new ArrayList<>();
                if (result.containsKey(vaccineCentre)){
                    p = result.get(vaccineCentre);
                } 

                p.add(person);
                Collections.sort(p);
                result.put(vaccineCentre, p);
                lineSc.close();
            }
        } catch (FileNotFoundException e){
            throw new InvalidInfoException("Missing file - " + filename);
        } catch (NoSuchElementException e){
            throw new InvalidInfoException("Missing information at Line " + count + " - " + name);
        }
        return result;
    } 
}