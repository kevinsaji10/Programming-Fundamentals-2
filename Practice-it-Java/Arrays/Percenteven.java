public class Percenteven {
    public double percentEven(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        double counter = 0;
        for (int i = 0; i< arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counter++;
            }
        }
        return counter *100 / arr.length;
    }
}
