import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // taking in input of original sentence
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence1 = sc.nextLine();
        // initialising the index and count variables
        int index = 0;
        int count = 0;
        // finding the number of white spaces to use in split method
        while(index != sentence1.length()) {
            if (sentence1.charAt(index) == ' ') {
                count++;
            }
            index++;
        }
        // using split method to create an array of the words in the sentence
        String[] arr = sentence1.split(" ", count+1);
        // creating another string to store the reversed version
        String sentence2 = "";
        // concatenating each element in the string array to sentence2
        for (int i = count; i>=0; i--) {
            sentence2 = sentence2.concat(arr[i]);
            if (i > 0) {
                sentence2  = sentence2.concat(" ");
            }

        }
        System.out.println(sentence2);
        sc.close();
    }
}