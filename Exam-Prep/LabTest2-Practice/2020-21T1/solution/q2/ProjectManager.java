import java.util.ArrayList;
import java.util.Collections;

public class ProjectManager extends Employee {
    private ArrayList<Project> projects = new ArrayList<>();

    public ProjectManager(String name, String joinedDate) {
        super(name, joinedDate);
    }

    public ProjectManager(String name, String joinedDate, double salary) {
        super(name, joinedDate, salary);
    }

    public ProjectManager(String name, String joinedDate, ArrayList<Project> projects) {
        super(name, joinedDate);
        this.projects = projects;
    }

    public void addProject(Project proj) {
        projects.add(proj);
    }
    
    
    public ArrayList<Project> getProjects() {
        return projects;
    }

    

    public void removeProject(Project proj) {
        projects.remove(proj);
    }

    
    public int getProjectWorth() {
        int total = 0;
        for (Project p : projects) {
            if (p.isCompleted()) {
                total += p.getWorth();
            }
        }
        return  total;
    }
    
    @Override
    public double getBonus() {
        return 0.01 * getProjectWorth();

    }
    
    public boolean equals(Object obj) {
        if (!(obj instanceof ProjectManager)) {
            return false;
        }

        ProjectManager another = (ProjectManager) obj;

        Collections.sort(another.projects);
        Collections.sort(projects);
        return super.equals(another) && projects.equals(another.projects);
    }

    public String toString(){
        String result = super.toString();
        return result.substring(0, result.length() - 1) + String.format(", projects worth: %s]", getProjectWorth());
    }
}

