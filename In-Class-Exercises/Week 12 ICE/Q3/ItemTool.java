import java.util.*;
import java.util.Iterator;

public class ItemTool {
    public static List<InventoryItem> getAllInventoryItemsLighterThan(List<InventoryItem> list, double weight) {
        List<InventoryItem> newList = new ArrayList<>();
        for (InventoryItem i : list) {
            if (i.getWeight() < weight) {
                newList.add(i);
            }
        }
        return newList;
    }

    public static List<Magazine> getAllMagazines(InventoryItem[] items) {
        List<Magazine> newList = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if (items[i] instanceof Magazine) {
                newList.add((Magazine) items[i]);
            }
        }
        return newList;
    }

    public static List<InventoryItem> getAllNonBooksOfCategory(InventoryItem[] items, char category) {
        List<InventoryItem> newList = new ArrayList<>();
        for (int i = 0; i < items.length; i++) {
            if (!(items[i] instanceof Book) && items[i].getCategory() == category) {
                newList.add(items[i]);
            }
        }
        return newList;
    }

    public static Laptop[] getAllLaptopsWithNumCpuGreaterThan(Map<String, InventoryItem> map, int numCpu) {
        List<Laptop> list = new ArrayList<>();
        for (String s : map.keySet()) {
            if (map.get(s) instanceof Laptop) {
                Laptop l = (Laptop) map.get(s);
                if (l.getNumCpu() > numCpu) {
                    list.add((Laptop) map.get(s));
                }
            }
        }
        Laptop[] lapArr = new Laptop[list.size()];
        for (int i = 0; i < lapArr.length; i++) {
            lapArr[i] = list.get(i);
        }
        return lapArr;
    }

}
