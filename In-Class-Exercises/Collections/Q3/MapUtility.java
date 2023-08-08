import java.util.*;

public class MapUtility {

    public static void main(String[] args) {
        Map<String, String> input = new HashMap<>();
        input.put("Alfred", "81");
        input.put("Elise", "61");
        input.put("Billy", "41");
        input.put("Daniel", "41");
        input.put("Charlie", "54");

        System.out.println("Input:  " + input);
        Map<String, List<String>> result = reverse(input);
        System.out.println("Output: " + result);

    }

    public static Map<String, List<String>> reverse(Map<String, String> map) {
        // create a new reverse map with key string and value list<string>
        Map<String, List<String>> reverse = new HashMap<>();
        for (String newValue : map.keySet()) {
            // get the value mapped to by the key and store it in the newKey variable
            String newKey = map.get(newValue);
            // if the newKey does not exist in reverse, add it to reverse and map it to a
            // new ArrayList containing strings
            reverse.putIfAbsent(newKey, new ArrayList<String>());
            // if key already exists, or after it has just been created, add newValue to the
            // arrayList mapped to by newKey
            reverse.get(newKey).add(newValue);

        }
        return reverse;
    }
}

// my initial attempt (successful but inefficient)
// public static Map<String, List<String>> reverse(Map<String, String> map) {
// // create a new reverse map with key string and value list<string>
// Map<String, List<String>> reverse = new HashMap<>();
// // iterate through each key in the hashmap and get the old value of the key
// // then
// for (String key : map.keySet()) {
// String oldValue = map.get(key);
// List<String> newValue = new ArrayList<String>();

// for (String key1 : map.keySet()) {
// if (map.get(key1).equals(oldValue)) {
// newValue.add(key1);
// }
// }

// reverse.put(map.get(key), newValue);
// }
// return reverse;
// }
