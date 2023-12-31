
import java.util.*;
public class Utility3 {
    public static List<Course> removeDisqualifiedSMUXSections(List<Course> list) {
        for (Course c : list) {
            Iterator<Section> i = c.iterator();
            while(i.hasNext()) {
                Section s = i.next();
                if (s instanceof SMUXSection) {
                    SMUXSection x = (SMUXSection)s;
                    if (x.getSponsor() == null) {
                        i.remove();
                    }
                    
                }
            }
        }
        return list;
    }   
    

    public static void main(String[] args) {
        Course c1 = new Course("Fishing");
        c1.addSection(new SMUXSection("G1"));
        c1.addSection(new SMUXSection("G2", new Sponsor("Ah Beng")));

        Course c2 = new Course("Gardening");
        c2.addSection(new SMUXSection("G1"));
        c2.addSection(new SMUXSection("G2", new Sponsor("Ah Beng")));

        Course c3 = new Course("Sewing");
        c3.addSection(new Section("G1"));
        c3.addSection(new SMUXSection("G2", new Sponsor("Ah Beng")));

        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        System.out.println("Test");
        System.out.println("Before:" + courses);
        removeDisqualifiedSMUXSections(courses);
        System.out.println("After ... ");
        System.out.println("Expected:[Fishing[G2], Gardening[G2], Sewing[G1, G2]]");
        System.out.println("Actual  :" + courses);
    }
}
