public class Q1 {

    public static int sumOfDigits(int num) {
        int sum = 0;
        if (num <0) {
            num = -num;
        }
        while (num != 0) {
            sum += num % 10;
            num = num /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Test 1");
        int result = sumOfDigits(123);
        System.out.println("Expected:6");
        System.out.println("Actual  :" + result);
        System.out.println();

        System.out.println("Test 2");
        result = sumOfDigits(-354);
        System.out.println("Expected:12");
        System.out.println("Actual  :" + result);
        System.out.println();
    }
}
