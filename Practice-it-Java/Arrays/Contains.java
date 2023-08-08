public class Contains {
    public boolean contains(int[] a1, int[] a2) {
        for (int i = 0; i<a1.length-(a2.length-1); i++) {
            int counter = 0;
            for (int j = 0; j<a2.length; j++) {
                if (a1[i+j] == a2[j]) {
                    counter++;
                }
            }
            if (counter == a2.length) {
                return true;
            }
        }
        return false;
    }
}
