import java.util.Scanner;

public class Q8BinaryConverter {
  public static String binaryConverter() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter decimal number: ");
    int dec = sc.nextInt();
    // if number entered is 0, return 0
    if (dec == 0) {
      sc.close();
      return "0";
    }
    // create output string, binary
    String binary = "";
    // concatenate the remainder when divided by 2 (either 1 or 0) to the right side
    // of binary. keep dividing dec by 2 until it equals 0.
    while (dec != 0) {
      binary = dec % 2 + binary;
      dec = dec / 2;
    }
    sc.close();
    return binary;

  }

  public static void main(String[] args) {
    System.out.println(binaryConverter());

  }
}
