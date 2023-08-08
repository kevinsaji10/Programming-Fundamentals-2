// Name:
// Email ID:

//##############################################################
public class Dependent extends Person implements Comparable<Dependent>{
    private char type;

    public Dependent(String firstName, String lastName, int age, char type) {
        super(firstName, lastName, age);
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public String toString() {
        if (type == 'C') {
            return "Child Name: " + super.getFirstName() +" " + super.getLastName() +" - " + "Age: " + super.getAge();
        }
        return "Spouse Name: " + super.getFirstName()+ " " + super.getLastName() +" - " + "Age: " + super.getAge();
        
    }

    
    public int compareTo(Dependent o) {
        if (o.type == 'C' && this.type == 'S') {
            return 1;
        } else if (o.type == 'S' && this.type == 'C') {
            return -1;
        } else {
            if (this.getFirstName().compareTo(o.getFirstName()) == -1) {
                return 1;
            } else {
                return -1;
            }
        }
    }
    
    
    
}
