public class PartAndQuantityEntry {
    public void enterPartAndQuantity(int part, int quantity) throws IllegalArgumentException {
        if (part < 0 || part > 999 || quantity < 1 || quantity > 5000) {
            throw new IllegalArgumentException(
                    "Invalid order, part number should be between 0 and 999, quantity ordered between 1 and 5000");
        } else {
            System.out.println("Successfully inserted order");
        }

    }
}