package Arrays;
public class StDev {
    public double stdev(int[] arr) {
        double sum = 0;
        for (int i : arr) {
            sum += i;
        }
        double average = sum / arr.length;
        double numerator = 0;
        for (int i : arr) {
            numerator += Math.pow((i - average), 2);
        }
        return Math.sqrt(numerator / arr.length -1);
    }
}
