/*
 * Name:
 * Email ID:
 */

import java.util.*;

public class Q2d {

    public static Map<String, List<String>> getTheCheapestShops(List<Product> products) {
        return null;
    }

    public static void main(String[] args) {

        int tcNum = 1;
        { // test case 1
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(

                    new Product("P3", 1, s1),
                    new Product("P2", 2, s1),
                    new Product("P1", 1, s1),
                    new Product("P1", 3, s3),
                    new Product("P2", 3, s3),
                    new Product("P3", 1, s3),
                    new Product("P2", 2, s2),
                    new Product("P1", 2, s2),
                    new Product("P3", 1, s2));

            Map<String, List<String>> result = getTheCheapestShops(products);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:{P1=[S1], P2=[S1, S2], P3=[S1, S2, S3]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 2
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(

                    new Product("P1", 1, s1),
                    new Product("P2", 2, s2),
                    new Product("P3", 3, s3));

            Map<String, List<String>> result = getTheCheapestShops(products);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:{P1=[S1], P2=[S2], P3=[S3]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 3
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(

                    new Product("P1", 1, s1),
                    new Product("P1", 2, s2),
                    new Product("P1", 3, s3));

            Map<String, List<String>> result = getTheCheapestShops(products);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:{P1=[S1]}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 4
            List<Product> products = List.of();
            Map<String, List<String>> result = getTheCheapestShops(products);
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:{}%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
    }
}
