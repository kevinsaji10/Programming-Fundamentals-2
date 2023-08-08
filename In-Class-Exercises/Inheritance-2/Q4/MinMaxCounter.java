public class MinMaxCounter extends Counter{
    private int min;
    private int max;

    public MinMaxCounter(int min, int max) {
        super(min);
        this.min  = min;
        this.max = max;
    }
    public void decrement() {
        if (value == min) {
            return;
        }
        this.value = this.value - 1;
    }
    public void increment() {
        if (value == max) {
            return;
        }
        this.value  = this.value +1;

    }
}
