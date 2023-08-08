
public class SearchCtrl {
    private InterestGroupDAO IGDM;

    public SearchCtrl() {
        IGDM = new InterestGroupDAO();
    }

    public Student searchPresident(String IGName, int year) {
        InterestGroup ig = IGDM.retrieve(IGName);
        Student president;
        if (ig != null) {
            president = ig.retrievePresidentInYear(year);
            return president;
        }
        System.out.println("Invalid interest Group/Year entered.");
        return null;
        
    }
}
