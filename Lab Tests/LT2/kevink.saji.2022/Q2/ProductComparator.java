/*
 * Name:
 * Email ID:
 */

public class ProductComparator implements Comparator<Product>{
    public int compare(Product p1, Product p2) {
        System.out.println();
        return p1.getName().compareTo(p2.getName());
    }
}