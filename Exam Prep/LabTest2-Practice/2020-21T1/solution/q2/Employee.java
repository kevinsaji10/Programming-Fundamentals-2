import java.time.*;

/**
*    Abstract class that represents an Employee. The only method that subclasses MUST define is the getBonus().
*    Salary of an employee consists of his base salary and the optional bonus (as defined in the subclass).
*/
public abstract class Employee{
    private String name;
    private String joinedDate;

    protected double salary;

    /**
    *    Creates a new Employee object taking in the name and the joined date  
    *    
    *    @param name name of the Employee
    *    @param joinedDate date of joining in the format yyyymm. The month should be between 1 and 12 and the 
    *           year should be such that the person is not past his retirement age. 
    *           Else, the constructor sets yyyymm to the current year and month 01 
    *    
    */
    public Employee(String name, String joinedDate){
        this.name = name;

        int year = LocalDate.now().getYear();
        int limit = 62;


        if (Integer.parseInt(joinedDate.substring(0,4)) > (year - limit)
                && Integer.parseInt(joinedDate.substring(4)) >= 1 && Integer.parseInt(joinedDate.substring(4)) <= 12){
            this.joinedDate = joinedDate;
        } else{
            this.joinedDate = year + "01";
        }
    }


    /**
    *    Creates a new Employee object taking in the name, the joined date and base salary
    *    
    *    @param name name of the Employee
    *    @param joinedDate date of joining in the format yyyymm. The month should be between 1 and 12 and the 
    *           year should be such that the person is not past his retirement age. 
    *           Else the constructor sets yyyymm to the current year and month 01 
    *    @param base salary of the Employee
    *    
    */
    public Employee(String name, String joinedDate, double salary){
        this(name, joinedDate);
        this.salary = salary;
    }
    

    /**    
    * Gets the name of the Employee
    * @return Returns this Employee's name 
    */
    public String getName(){
        return name;
    }
    
    
    /**    
    * Changes the base salary of the employee
    * @param salary the updated (base) salary of the employee    
    */
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    
    /**    
    * Gets the total salary of this Employee, that includes the base salary and the bonus, if any.
    * @return Returns this Employee's name 
    */
    public double getTotalSalary(){
        return salary + getBonus();
    }
    
    
    /**    
    * Gets the joined year and month of this Employee
    * @return Returns this Employee's joined year and month in the format yyyymm
    */
    public String getJoinYearMonth(){
        return joinedDate;
    }


    /**    
    * Returns the string representation of this Employee 
    * @return the string representation in the format, Name: the name of the employee, type: class of the object, JoinedDate: joined date of the employee
    */
    public String toString(){
        return String.format("[Name: %s, type: %s, JoinedDate: %s]", name, getClass().getName(),  joinedDate );
    }


    /**
    * Compares this Employee with the specified object. The result is <code>true</code> if the argument is not null and is an Employee 
    * object that has the same name and the joined date, <code>false</code> otherwise.
    *
    */
    public boolean equals(Object o){
        if (o == null || !(o instanceof Employee)){
            return false;
        }

        Employee other = (Employee)o;
        return name.equals(other.name) && joinedDate.equals(other.joinedDate);

    }
    
    /**
    *   @return Returns a hash code for this Employee, that is computed using name and joinedDate
    */
    public int hashCode(){
        return (int)(name.hashCode() * joinedDate.hashCode());
    }

    /**
    *   @return Returns the bonus of the Employee, if any.
    */
    public abstract double getBonus();

}