import java.util.*;
import java.io.*;

public class ProductTest {
  public static void main(String[] args) {
    ArrayList<Product> products = new ArrayList<>();
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));
    products.add(new Product("apple", 3, 1.2));

    save(products, "data\\product.csv");
  }

  public static void save(ArrayList<Product> productList, String pathAndFileName) {
    // TODO: goes through products and saves each Product as a line in file
    // format: name,quantity,price
    File file = new File("dataproduct.csv");
    try (FileWriter fileWriter = new FileWriter(file);) {

      for (Product p : productList) {
        fileWriter.write(p.getName() + "," + p.getQuantity() + "," + p.getPrice());
        fileWriter.write("\n");
      }
    } catch (IOException e) {
      System.out.println("An error occured");
    }
    System.out.println("File has been written! ");
  }
}
