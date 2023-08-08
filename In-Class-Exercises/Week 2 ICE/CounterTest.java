// this is for Q8
public class CounterTest {
    public static void main(String[] args) {
        Counter firstCounter = new Counter();
        Counter secondCounter = new Counter(7);
        System.out.println("Before increment - First counter value: " + firstCounter.getValue());
        firstCounter.increment();
        firstCounter.increment();
        firstCounter.increment();
        firstCounter.increment();
        firstCounter.increment();
        System.out.println("After incrementing 5 times - First counter value: " + firstCounter.getValue());
        System.out.println();

        System.out.println("Before decrement - second counter value: " + secondCounter.getValue());
        secondCounter.decrement();
        System.out.println("After decrement - First counter value: " + secondCounter.getValue());
        System.out.println();

        secondCounter.reset();
        System.out.println("After reset - second counter value: " + secondCounter.getValue());

        Counter counter = new Counter(5);
        System.out.println(counter.getValue());

    }
    
    

}