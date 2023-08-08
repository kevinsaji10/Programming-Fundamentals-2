public class CircularCounter extends Counter {
    public int limit;

    public CircularCounter(int limit) {
        super(0);
        this.limit = limit;

    }
    public void decrement() {

        this.value = 0;
    }
    public void increment() {
        if (value < limit) {
            this.value  = this.value +1;
        } else {
            this.decrement();
        }
        
        
    }

}
