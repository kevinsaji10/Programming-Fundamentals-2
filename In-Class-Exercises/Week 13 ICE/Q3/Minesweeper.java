import java.util.Random;

public class Minesweeper {
    private char[][] board;

    public Minesweeper(int numRows, int numColumns, int numBombs) {
        board = new char[numRows][numColumns];
        placeBombs(numBombs);
        countBombs();
    }

    private void placeBombs(int numBombs) {
        Random random = new Random();
        // slot numBomb "B" into the 2D array
        for (int i = 0; i< numBombs; i++) {
            int randomCol;
            int randomRow;
            do{
                randomRow = random.nextInt(board.length);
                randomCol = random.nextInt(board[0].length);
            } while(board[randomRow][randomCol] == 'B');
            board[randomRow][randomCol] = 'B';
        }
        // slot "-" into the remaining slots
        for (char[] c : board) {
            for (int i = 0; i < c.length; i++) {
                if (c[i] != 'B') {
                    c[i] = '-';
                } 
                
            }
        }
    }
    
    private void countBombs() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (!((i == 0 || j == 0 || i == board.length - 1 || j == board[i].length - 1))) {
                    if (board[i][j] == '-') {
                        int count = 0;
                        if (board[i + 1][j + 1] == 'B') {
                            count++;
                        }
                        if (board[i + 1][j] == 'B') {
                            count++;
                        }
                        if (board[i + 1][j - 1] == 'B') {
                            count++;
                        }
                        if (board[i][j + 1] == 'B') {
                            count++;
                        }
                        if (board[i][j - 1] == 'B') {
                            count++;
                        }
                        if (board[i - 1][j + 1] == 'B') {
                            count++;
                        }
                        if (board[i - 1][j] == 'B') {
                            count++;
                        }
                        if (board[i - 1][j - 1] == 'B') {
                            count++;
                        }
                        String test = "" + count;
                        board[i][j] = test.charAt(0);

                    }
                }
            }
        }
    }

    @Override
    public String toString() {
        String ret = "";
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                ret += "" + board[i][j] + "|";
            }
            ret += "\n";
        }
        return ret;

    }

}
