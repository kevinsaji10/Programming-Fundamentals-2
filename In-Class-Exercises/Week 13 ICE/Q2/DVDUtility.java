import java.util.*;
public class DVDUtility {
    public static DVD getMostExpensiveDVD(DVD[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        DVD mostExpensive = array[0];
        for (DVD d : array) {
            if (d.getPrice() >= mostExpensive.getPrice()) {
                mostExpensive = d;
            }
        }
        return mostExpensive;
    }
    public static List<DVD> getDVDWithGenre(DVD[] array, String genre) {
        if (array == null || genre == null) {
            return new ArrayList<DVD>();
        }
        List<DVD> retList = new ArrayList<>();
        for (DVD d: array) {
            if (d.getGenre().equals(genre)) {
                retList.add(d);
            }
        }
        return retList;

    }
    public static List<DVD> getDVDWithPriceBetween(DVD[] array, int minPrice, int maxPrice) {
        if(array == null) {
            return new ArrayList<DVD>();
        }
        List<DVD> retList = new ArrayList<>();
        for (DVD d : array) {
            if (d.getPrice() >= minPrice && d.getPrice() <= maxPrice) {
                retList.add(d);
            }
        }
        return retList;
    }
    public static boolean isSame(DVD d1, DVD d2) {
        if (d1.getTitle().equals(d2.getTitle())) {
            return true;
        } else {
            return false;
        }
    }
    public static List<DVD> getUniqueDVDs(DVD[] array, DVD[] anotherArray) {
        List<DVD> retList = new ArrayList<>();
        // for null parameter
        if (array == null) {
            retList = Arrays.asList(anotherArray);
            return retList;
        } else if (anotherArray == null) {
            retList = Arrays.asList(array);
            return retList;
        }
        
        for (DVD d1: array) {
            boolean d1IsUnique = true;
            // check the ones that are in anotherarray but not in array
            for (DVD d2 : anotherArray) {
                if (isSame(d1, d2)) {
                    d1IsUnique = false;
                }
            }
            if (d1IsUnique == true) {
                retList.add(d1);
            }
        }
        // check the ones that are in array but not in another array
        for (DVD d1: anotherArray) {
            boolean d1IsUnique = true;
            for (DVD d2 : array) {
                if (isSame(d1, d2)) {
                    d1IsUnique = false;
                }
            }
            if (d1IsUnique == true) {
                retList.add(d1);
            }
        }
        return retList;
    }
    public static String[] getDVDTitlesInYear(DVD[] array, int year) {
        if (array == null) {
            return new String[0];
        }
        List<String> retList = new ArrayList<>();
        for (DVD d : array) {
            if (d.getYear() == year) {
                retList.add(d.getTitle());
            }
        }
        String[] arr = new String[retList.size()];
        for (int i = 0; i<retList.size(); i++) {
            arr[i] = retList.get(i);
        }
        return arr;
    }
    
       
}
