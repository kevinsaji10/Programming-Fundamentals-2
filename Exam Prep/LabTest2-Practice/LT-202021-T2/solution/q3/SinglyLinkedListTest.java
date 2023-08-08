public class SinglyLinkedListTest {
     public static void main(String[] args) {
          SinglyLinkedList<Shape> sll = new SinglyLinkedList<Shape>();
          String expectedResult;
          
          System.out.println("******************************************");  
          
          sll.add(new Triangle());
          sll.add(new Rectangle());
          sll.add(new Square());
          System.out.println("Test Case 1 : " + sll);
          expectedResult = "(Rectangle)(Square)(Triangle)";
          System.out.println();
          System.out.println("Expected : " + expectedResult);
          sll.sort();
          System.out.println("  Actual : " + sll);
          System.out.print  ("  Result : ");
          if (sll.toString().equals(expectedResult)){
               System.out.println("Passed");
          } else {
               System.out.println("Failed");
          }

          System.out.println("******************************************");

          sll = new SinglyLinkedList<>();
          sll.add(new Square());
          sll.add(new Rectangle());
          sll.add(new Triangle());
          
          System.out.println("Test Case 2 : " + sll);
          expectedResult = "(Rectangle)(Square)(Triangle)";
          System.out.println();
          System.out.println("Expected : " + expectedResult);
          sll.sort();
          System.out.println("  Actual : " + sll);
          System.out.print  ("  Result : ");
          if (sll.toString().equals(expectedResult)){
               System.out.println("Passed");
          } else {
               System.out.println("Failed");
          }

          System.out.println("******************************************");

          sll = new SinglyLinkedList<>();

          sll.add(new Rectangle());
          sll.add(new Square());
          sll.add(new Triangle());
          sll.add(new Square());
          
          System.out.println("Test Case 3 : " + sll);
          expectedResult = "(Rectangle)(Square)(Square)(Triangle)";
          System.out.println();
          System.out.println("Expected : " + expectedResult);
          sll.sort();
          System.out.println("  Actual : " + sll);
          System.out.print  ("  Result : ");
          if (sll.toString().equals(expectedResult)){
               System.out.println("Passed");
          } else {
               System.out.println("Failed");
          }

          System.out.println("******************************************");

          sll = new SinglyLinkedList<>();
          sll.add(new Square());
          sll.add(new Rectangle());
          sll.add(new Square());
          sll.add(new Triangle());
          sll.add(new Rectangle());
          
          System.out.println("Test Case 4 : " + sll);
          expectedResult = "(Rectangle)(Rectangle)(Square)(Square)(Triangle)";
          System.out.println();
          System.out.println("Expected : " + expectedResult);
          sll.sort();
          System.out.println("  Actual : " + sll);
          System.out.print  ("  Result : ");
          if (sll.toString().equals(expectedResult)){
               System.out.println("Passed");
          } else {
               System.out.println("Failed");
          }
     } 
}