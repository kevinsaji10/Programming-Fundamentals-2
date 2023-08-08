import java.util.*;

public class FrequencyApp {
    public static void main(String[] args) {
        Map<String, Integer> freq = new HashMap<>();
        String word;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word> ");
        word = sc.nextLine();
        while (!word.isEmpty()) {
            if (!freq.containsKey(word)) {
                freq.put(word, 1);
            } else {
                int oldValue = freq.get(word);
                freq.remove(word);
                freq.put(word, oldValue + 1);
            }
            System.out.print("Enter the word> ");
            word = sc.nextLine();
        }
        System.out.println("Frequency Count: ");
        for (String x : freq.keySet()) {
            System.out.println(freq.get(x) + " " + x);
        }
        sc.close();
    }

}

//