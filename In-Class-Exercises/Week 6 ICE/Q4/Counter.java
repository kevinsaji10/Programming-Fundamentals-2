public abstract class Counter {
    public int value;

    public Counter(int value) {
        this.value = value;
    }
    
    public abstract void decrement();
    public abstract void increment();

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
