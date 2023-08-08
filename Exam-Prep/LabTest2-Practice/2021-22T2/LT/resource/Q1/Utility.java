/*
 *
 * Name: Kevin K Saji
 */
import java.util.*;
import java.io.*;
public class Utility {
   public static Map<String,List<Person>> load(String fileName) throws InvalidInfoException{
      Map<String, List<Person>> map = new HashMap<>();
      // initialise line and name outside try block as they are needed in catch
      int line = 0;
      String name = null;
     try(Scanner filesc = new Scanner(new File(fileName))) {
         // skip the header
         filesc.nextLine();
         
         while(filesc.hasNext()) {
            line++;
            // initialise boolean variables isAdult, isYouth and isElderly
            boolean isAdult = false;
            boolean isYouth = false;
            boolean isElderly = false;
            String currentStr = filesc.nextLine();
            // create string array containing the parameters in each row
            String[] current = currentStr.split(":");
            // initialise index to 0
            int index = 0;
            // initialise name
            name = current[index];
            // check if row is for adult or youth
            if (Integer.parseInt(current[1]) > 18) {
               if (current.length < 6) {
                  throw new InvalidInfoException("Missing information at line" + line + " - " + name);
               }
               isAdult = true;
            } else {
               if (current.length < 7) {
                  throw new InvalidInfoException("Missing information at line" + line + " - " + name);
               }
               isYouth = true;
            }
            index++;
            int age = Integer.parseInt(current[index]);
            index++;
            String medConditionStr = current[index];
            String[] medArr = medConditionStr.split(",");
            List<String> medicalCondition = new ArrayList<>();
            // add each string medicalCondition to arrayList medicalCondition
            for (String s : medArr) {
               medicalCondition.add(s);
            }
            index++;
            String school = null;
            // if isYouth, create school parameter and increase index an extra time
            if (isYouth) {
               school = current[index];
               index++;
            }
            String vaccineCentre = current[index];
            index++;
            String vaccine = current[index];
            index++;
            char shotType = current[index].charAt(0);
            // check if isElderly and set to true if isElderly
            if (age >=65) {
               isElderly = true;
            }
            // create new adult or youth object accordingly and add to map, key is vaccineCentre
            // check for exceptions and throw InvalidInfoException
            if (isAdult) {
               Person person = new Adult(name, age, medicalCondition, vaccineCentre, vaccine, shotType, isElderly);
               map.putIfAbsent(vaccineCentre, new ArrayList<Person>());
               map.get(vaccineCentre).add(person);
            } else if (isYouth) {
               Person person = new Youth(name, age, medicalCondition, school, vaccineCentre, vaccine, shotType);
               map.putIfAbsent(vaccineCentre, new ArrayList<Person>());
               map.get(vaccineCentre).add(person);
            }
         }
         // sort each value in the map
         for (String s : map.keySet()) {
            Collections.sort(map.get(s));
         }
         return map;
      } catch (FileNotFoundException e) {
         System.out.println("x");
         throw new InvalidInfoException("Missing File - " + fileName);
      } catch (NumberFormatException e) {
         throw new InvalidInfoException("Missing information at line " + line + " - " + name);
      }
   }
}