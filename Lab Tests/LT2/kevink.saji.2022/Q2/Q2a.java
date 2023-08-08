/*
 * Name: kevinksaji
 * Email ID: kevink.saji.2022
 */
import java.util.*;

public class Q2a {

    public static Shop getCheapestShop(List<Product> products, String name) {
        int cheapestPrice = Integer.MAX_VALUE;
        Shop cheapest = null;
        if (products == null || products.size() == 0) {
            return cheapest;
        }
        for (int i = 0; i< products.size();i++) {
            if(products.get(i).getName().equals(name)) {
                if (products.get(i).getPriceInCents() < cheapestPrice) {
                    cheapest = products.get(i).getShop();
                    cheapestPrice = products.get(i).getPriceInCents();
                }
            }
        }
        
        

       return cheapest;
    }

    public static void main(String[] args) {
        int tcNum = 1;
        { // test case 1
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P3");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:S3%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 2
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P2");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:S2%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 3
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P1");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:S1%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 4
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');
            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 450, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P3");
            System.out.printf("Test Case %d: 2 shops with the cheapest price. return the one with smaller index%n", tcNum++);
            System.out.printf("Expected:S2%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 5
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of(
                    new Product("P1", 140, s1),
                    new Product("P2", 780, s1),
                    new Product("P3", 470, s1),
                    new Product("P1", 250, s2),
                    new Product("P2", 760, s2),
                    new Product("P3", 850, s2),
                    new Product("P1", 350, s3),
                    new Product("P2", 770, s3),
                    new Product("P3", 450, s3)
            );
            Shop result = getCheapestShop(products, "P4");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:null%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
        { // test case 6
            Shop s1 = new Shop("S1", 'N');
            Shop s2 = new Shop("S2", 'S');
            Shop s3 = new Shop("S3", 'E');

            List<Product> products = List.of();
            Shop result = getCheapestShop(products, "P3");
            System.out.printf("Test Case %d%n", tcNum++);
            System.out.printf("Expected:null%n");
            System.out.printf("Actual  :%s%n", result);
            System.out.println();
        }
    }
}
