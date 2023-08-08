/*
 * Name:
 * Email ID:
 */

public class Q1a {
    public static String stutter(String s, int n) {
        return null;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        { // test case 1
            String str = "he";
            int n = 0;
            System.out.printf("Test %d: stutter(%s, %d)%n", tcNum++, str,  n);
            String result = stutter(str, n);
            System.out.println("Expected:||");
            System.out.printf("Actual  :|%s|%n", result);
            System.out.println();
        }
        { // test case 2
            String str = "Hello";
            int n = 1;
            System.out.printf("Test %d: stutter(%s, %d)%n", tcNum++, str,  n);
            String result = stutter(str, n);
            System.out.println("Expected:Hello");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 3
            String str = "world";
            int n = 3;
            System.out.printf("Test %d: stutter(%s, %d)%n", tcNum++, str,  n);
            String result = stutter(str, n);
            System.out.println("Expected:wwwooorrrlllddd");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
    }
}
