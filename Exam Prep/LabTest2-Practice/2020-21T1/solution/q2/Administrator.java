
/**
*  A class that represents the Administrator
*/

public class Administrator extends Employee{
    
    /**
    *    Creates a new Administrator object taking in the name, the joined date and (base) salary
    *    
    *    @param name name of the Administrator
    *    @param joinedDate date of joining in the format yyyymm. The month should be between 1 and 12 and the 
    *           year should be such that the person is not past his retirement age. 
    *           Else, the constructor sets yyyymm to the current year and month 01 
    *    @param salary of the Administrator
    *    
    */
    public Administrator(String name, String yyyymm, double salary){
        super(name, yyyymm, salary);
    }
  
    /**
    * Returns the bonus of the Administrator
    * @return returns the bonus of the Administrator
    */
    public double getBonus(){
       return 1.1 * salary;
        
    }

}