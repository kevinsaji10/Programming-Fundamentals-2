import java.util.*;
public class ElectronicBook extends Book implements Comparable<ElectronicBook> {
    private MyDate expiryDate;

    public ElectronicBook(String title, int price, String[] authors, MyDate expiryDate) {
        super(title, (int)(price/9.0 * 7.0), authors);
        this.expiryDate = expiryDate;

    }
    public int getPriceInCents() {
        return super.getPriceInCents();
    }
    public MyDate getExpiryDate() {
        return this.expiryDate;
    }
    public boolean equals(ElectronicBook another) {
        Book a = (Book)another;
        if (super.equals(a) && this.getExpiryDate().compareTo(another.getExpiryDate()) == 0) {
            return true;
        }
        return false;       
    }
    public int compareTo(ElectronicBook another) {
        // compare titles
        if(this.getTitle().compareTo(another.getTitle()) != 0) {
            return this.getTitle().compareTo(another.getTitle());
        } else {
            // compare authors
            Arrays.sort(this.getAuthors());
            Arrays.sort(another.getAuthors());
            int length = Math.min(this.getAuthors().length, another.getAuthors().length);
            int counter = 0;
            for (int i = 0; i<length; i++) {
                if (this.getAuthors()[i].compareTo(another.getAuthors()[i])!= 0) {
                    return this.getAuthors()[i].compareTo(another.getAuthors()[i]);
                } else {
                    counter++;
                }
            }
            if (counter == length && this.getAuthors().length < another.getAuthors().length) {
                return -1;
            } else if (counter == length && this.getAuthors().length > another.getAuthors().length) {
                return 1;
            } else {
                return this.getExpiryDate().compareTo(another.getExpiryDate());
            }
        }
        

    }
    @Override
    public String toString() {
        return this.getTitle() + ": "+ expiryDate;
    }

    
}
