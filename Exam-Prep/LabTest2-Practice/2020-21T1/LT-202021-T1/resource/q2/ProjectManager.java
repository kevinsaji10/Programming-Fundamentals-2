import java.util.*;
public class ProjectManager extends Employee {
    private ArrayList<Project> list;
    public ProjectManager(String name, String yyyyMM) {
        super(name, yyyyMM);
    }
    public ProjectManager(String name, String yyyyMM, double salary) {
        super(name, yyyyMM, salary);
    }
    public ProjectManager(String name, String yyyyMM, ArrayList<Project> list) {
        super(name, yyyyMM);
        this.list = list;
    }
    public void addProject(Project proj) {
        list.add(proj);
    }
    public ArrayList<Project> getProjects() {
        return list;
    }
    public int getProjectWorth() {
        int sum = 0;
        for (Project p : list) {
            sum += p.getWorth();
        }
        return sum;
    }
    public double getBonus() {
        double sum = 0;
        if (this.list != null) {
            for (Project p : list) {
                if (p.isCompleted()) {
                    sum += p.getWorth();
                }
            }
        }
        
        return (sum / 100.0) * 1.0;
    }
    public void removeProject(Project proj) {
        for (Project p : list) {
            if (p.equals(proj)) {
                list.remove(p);
            }
        }
    }
    public boolean projSame(ArrayList<Project> a1, ArrayList<Project> a2) {
        if (a1.equals(a2)) {
            return true;
        }
        return false;
    }
    public boolean equals(ProjectManager p) {
        if (super.equals(p) && projSame(this.list, p.list)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString() {
        int counter =0;
        for (Project p : list) {
            
            if (p.isCompleted()) {
                counter++;
            }
        }
        return "Name" + super.getName() + ", tyoe: Project Manager, JoinedDate" + super.getJoinYearMonth()+", projects worth" + counter;
    }
    
    
    
}

