public class Dependent extends Person implements Comparable<Dependent> {
    private char type;

    public Dependent(String firstName, String lastName, int age, char type){
        super(firstName, lastName, age);
        this.type = type;
    }

    public char getType() {
        return this.type;
    }

    public void setType(char type) {
        this.type = type;
    }

    @Override
    public int compareTo(Dependent o) {
        if (getType() == o.getType()){
            String name1 = "";
            String name2 = "";

            if (getFirstName() != null){
                name1 = getFirstName();
            }
            if (o.getFirstName() != null){
                name2 = o.getFirstName();
            }

            return name1.compareTo(name2);
        }
       return getType() - o.getType();
    }

    @Override
    public String toString(){
        String result = ((type == 'C') ? "Child" : "Spouse");
        return result + " " + super.toString();
    }
}
