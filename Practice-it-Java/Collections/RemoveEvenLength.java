import java.util.Iterator;
import java.util.Set;

public class RemoveEvenLength {
    public Set<String>removeEvenLength(Set<String> set) {
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            if (iterator.next().length() % 2 == 0) {
                iterator.remove();
            }
        }
        return set;
    }
}
