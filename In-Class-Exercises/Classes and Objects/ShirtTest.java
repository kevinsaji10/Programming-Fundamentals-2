public class ShirtTest {

    public static void main(String[] args) {
        Shirt shirt1 = new Shirt('R', 85.50, "SMUgger");
        Shirt shirt2 = new Shirt('B', 90.40, "SMUgger");
        Shirt shirt3 = new Shirt('G', 77.60);

        System.out.println("s1 same brand as s2: " + shirt1.isSameBrand(shirt2));

        System.out.println("s1 same brand as s2: " + shirt2.isSameBrand(shirt3));

        shirt2.setColour('R');

        System.out.println(shirt1.toString());
        System.out.println(shirt2.toString());
        System.out.println(shirt3.toString());

    }
}
