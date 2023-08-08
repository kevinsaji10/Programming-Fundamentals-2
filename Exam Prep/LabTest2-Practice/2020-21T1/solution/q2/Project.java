/**
*  This class represents a Project. It implements Comparable interface.
*/
public class Project implements Comparable<Project>{
    private String title;
    private int worth;
    private boolean completed = false;
    
    /**
    * Creates a Project object with the specified title
    * @param title the title given to the project
    */
    public Project(String title){
        this.title = title;
    }

    /**
    * Creates a Project object with the specified title, project's worth in dollars and a boolean value indicating if the project is completed or not
    * @param title the title given to the project
    */
    public Project(String title, int worth, boolean completed){
        this.title = title;
        this.worth = worth;
        this.completed = completed;
    }
    

    /**
    * @return Returns <code>true</code> if the project is completed, <code>false</code> otherwise
    */
    public boolean isCompleted(){
        return completed;
    }
    
    
    /**
    * Sets the project to true or false depending on the specified boolean value
    * @param completed sets the project to <code>true</code> or <code>false</code> based on the specified value
    */

    public void setComplete(boolean completed){
        this.completed = completed;
    }
    
    
    /**
    * sets the value for worth based on the parameter value
    * @param worth the "dollar worth" of the project
    */
    public void setWorth(int worth){
        this.worth = worth;
    }

    /**
    * Returns the value worth of the project
    * @return returns the dollar "worth" of the project
    */
    public int getWorth(){
        return worth;
    }
    
    
    /**
    * Compares this Project with the specified object. The result is true if the argument is not null and is a project 
    * object that has the same title.
    *
    */
    public boolean equals(Object o){
        if (!(o instanceof Project)) return false;

        Project proj = (Project) o;
        return title.equals( proj.title);
    }

    /**
    *   @return Returns a hash code for this Project, that is computed based on title
    */
    public int hashCode(){
        return title.hashCode();
    }

    /**
    *  Compares two Projects based on the project's title (lexicographically)
    *
    * @return the value 0 if this title is the same as the <code>other</code>; a value less than 0 if this Project's title is lexicographically 
    less than the other; a value greater than 1 otherwise
    */
    public int compareTo(Project other){
        return title.compareTo(other.title);

    }

}