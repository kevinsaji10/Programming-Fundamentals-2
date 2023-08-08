import java.util.*;
public class UnionApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first line> ");
        String[] arr1 = sc.nextLine().split(",");
        System.out.print("Enter second line> ");
        String[] arr2 = sc.nextLine().split(",");
        HashSet<String> hashSet = new HashSet<>();
        for (String s: arr1) {
            hashSet.add(s);
        }
        for (String x : arr2) {
            if (!hashSet.contains(x)) {
                hashSet.add(x);
            }
        }
        // iterator to print out the unique numbers
        Iterator<String> iterator = hashSet.iterator();
        System.out.print(iterator.next());
        while(iterator.hasNext()) {
            System.out.print("," + iterator.next());
        }
        sc.close();
    }
}