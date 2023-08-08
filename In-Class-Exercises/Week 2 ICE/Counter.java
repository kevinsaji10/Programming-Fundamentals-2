// this is for Q8
public class Counter {
    private int value = 2;
    public Counter() {
        value = 0;
    }

    public Counter(int v){
        value = v;

    }
    public int getValue() {
        return value;
    }
    public void setValue(int v) {
        value = v;
    }
    public void increment() {
        value++;
    }
    public void decrement() {
        value--;
    }
    public void reset() {
        value = 0;
    }

}