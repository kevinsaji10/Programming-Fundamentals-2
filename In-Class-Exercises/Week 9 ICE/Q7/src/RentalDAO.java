import java.util.ArrayList;

public class RentalDAO {
    private ArrayList<Rental> rentalList;

    // constructor
    public RentalDAO() {
        rentalList = new ArrayList<Rental>();
    }

    // adds a new Rental to the rentalList. This method takes in the patron.csv & dvd and creates an ID for the Rental
    public void add(Patron patron, DVD dvd) {
        int nextId = rentalList.size() + 1;
        Rental rental = new Rental(nextId, patron, dvd);
        rentalList.add(rental);
    }

    // returns the ArrayList of Rental objects
    public ArrayList<Rental> retrieveAll() {
        return rentalList;
    }


}
