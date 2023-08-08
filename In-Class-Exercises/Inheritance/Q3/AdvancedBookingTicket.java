public class AdvancedBookingTicket extends Ticket{
    private int numDaysInAdvance;

    public AdvancedBookingTicket(String title, int numDaysInAdvance) {
        super(title);
        this.numDaysInAdvance = numDaysInAdvance;
    }
    public double calculatePrice() {
        double initialPrice = super.calculatePrice();
        
        double halfPrice = initialPrice / 2.0;
        double finalPrice = initialPrice - 0.50 * numDaysInAdvance;

        return finalPrice > halfPrice ? finalPrice : halfPrice;
    }
}
