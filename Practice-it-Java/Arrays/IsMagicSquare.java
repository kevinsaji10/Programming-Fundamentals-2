public class IsMagicSquare {
    public boolean isMagicSquare(int[][] arr) {
        int length = 0;
        // check if it is a square
        for (int i = 0; i< arr.length; i++) {
            if (arr[i].length != arr.length) {
                return false;
            }
    }

     length = arr.length;
        // find sum
        int actsum = 0;
            for (int i = 0; i< length; i++) {
                actsum += arr[0][i];
            }
    
        // check rows
        for (int i = 0; i< length;i++) {
            int rowsum = 0;
            for (int j = 0; j< length; j++) {
                rowsum += arr[i][j];
            }
            if (rowsum != actsum) {
                return false;
            }
        }
        // check columns
        for (int i = 0; i< length;i++) {
            int colsum = 0;
            for (int j = 0; j< length; j++) {
                colsum += arr[j][i];
            }
            if (colsum != actsum) {
                return false;
            }
        }
        // check diagonals
        int counter1 = 0;
        int counter2 = arr.length-1;
        int counter3 = 0;
        int diagsum1 = 0;
        int diagsum2 = 0;
        for (int i = 0; i<length; i++) {
            diagsum1 += arr[counter1][counter1];
            diagsum2 += arr[counter2][counter3];
            counter2--;
            counter3++;
            counter1++;
        }
        if (diagsum1 != actsum || diagsum2 != actsum) {
            return false;
        }
        return true;
        
    }
}
