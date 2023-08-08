public class Commando extends Soldier {
    private double vocationAllowance;

    public Commando(String name, double baseAllowance, double vocationAllowance) {
        super(name, baseAllowance);
        this.vocationAllowance = vocationAllowance;

    }
    public double getGrossAllowance() {
        return vocationAllowance + this.getBaseAllowance();
    }
    public String toString() {
        return "Commando [Soldier{name = "+ this.getName() +  ", baseAllowance= " + this.getBaseAllowance() +"}, vocationAllowance= " + vocationAllowance + "]";
        // can use String.format which generates a string object in the way you want to
    }
    
    
}
