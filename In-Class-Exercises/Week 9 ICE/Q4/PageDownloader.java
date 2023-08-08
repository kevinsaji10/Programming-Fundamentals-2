import java.io.IOException;
import java.net.URL;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class PageDownloader {
    public static String prompt() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the URL> ");
        String websiteURL = console.nextLine();
        return websiteURL;
    }

    public static void main(String[] args) {
        boolean isDone = false;
        do {
            try {
                URL url = new URL(prompt());
                isDone = true;
                Scanner sc = new Scanner(url.openStream());
                while (sc.hasNext()) {
                    System.out.println(sc.nextLine());
                }
            } catch (MalformedInputException e) {
                System.out.println("Invalid");
            } catch (IOException e) {
                System.out.println("Invalid URL!");
            }
        } while (!isDone);
    }
}
