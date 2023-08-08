import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int v1 = 2;
        if (o1 instanceof ProjectManager) {
            v1 = 1;
        }

        int v2 = 2;
        if (o2 instanceof ProjectManager) {
            v2 = 1;
        }

        int difference = v1 - v2;
        if (difference != 0) {
            return difference;
        }

        if (o1 instanceof ProjectManager && o2 instanceof  ProjectManager) {
            ProjectManager m1 = (ProjectManager)o1;
            ProjectManager m2 = (ProjectManager)o2;
            difference = m2.getProjectWorth() - m1.getProjectWorth();

            if (difference != 0) {
                return difference;
            }
        }
        difference = o1.getName().compareTo(o2.getName());
        if (difference != 0) {

            return difference;
        }
        return o1.getJoinYearMonth().compareTo(o2.getJoinYearMonth());
    }
}
