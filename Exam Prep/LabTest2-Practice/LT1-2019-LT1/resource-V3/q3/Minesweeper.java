import java.util.Arrays;

public class Minesweeper {

    
    public static void click(char[][] board, int row, int col) {

    }

    public static void main(String[] args) {
        {
            char[][] board = {
                    {'E', 'E', 'E', 'E', 'E'},
                    {'E', 'E', 'M', 'E', 'E'},
                    {'E', 'E', 'E', 'E', 'E'},
                    {'E', 'E', 'E', 'E', 'E'}};

            click(board, 3, 0);

            String expected = "[B, 1, E, 1, B]\n"
                    + "[B, 1, M, 1, B]\n"
                    + "[B, 1, 1, 1, B]\n"
                    + "[B, B, B, B, B]\n";

            String actual = "";
            for (char[] row : board) {
                actual += Arrays.toString(row) + "\n";
            }

            System.out.println("Test 1");
            System.out.println("Expected:\n" + expected);
            System.out.println("Actual  :\n" + actual);
            System.out.println("Result  :"  + (expected.equals(actual) ? "Pass" : "Fail"));
            System.out.println();
        }

        {
            char[][] board = {
                    {'B', '1', 'E', '1', 'B'},
                    {'B', '1', 'M', '1', 'B'},
                    {'B', '1', '1', '1', 'B'},
                    {'B', 'B', 'B', 'B', 'B'}};

            String expected = "[B, 1, E, 1, B]\n"
                    + "[B, 1, X, 1, B]\n"
                    + "[B, 1, 1, 1, B]\n"
                    + "[B, B, B, B, B]\n";

            click(board, 1, 2);

            String actual = "";
            for (char[] row : board) {
                actual += Arrays.toString(row) + "\n";
            }
            System.out.println("Test 2");
            System.out.println("Expected:\n" + expected);
            System.out.println("Actual  :\n" + actual);
            System.out.println("Result  :"  + (expected.equals(actual) ? "Pass" : "Fail"));
            System.out.println();
        }

        {
            char[][] board =
                    {
                            {'M', 'E', 'E', 'E', 'E'},
                            {'E', 'E', 'M', 'E', 'E'},
                            {'E', 'E', 'E', 'E', 'E'},
                            {'E', 'E', 'E', 'E', 'E'}};


            click(board, 1, 1);

            String expected = "[M, E, E, E, E]\n"
                    + "[E, 2, M, E, E]\n"
                    + "[E, E, E, E, E]\n"
                    + "[E, E, E, E, E]\n";


            String actual = "";
            for (char[] row : board) {
                actual += Arrays.toString(row) + "\n";
            }
            System.out.println("Test 3");
            System.out.println("Expected:\n" + expected);
            System.out.println("Actual  :\n" + actual);
            System.out.println("Result  :"  + (expected.equals(actual) ? "Pass" : "Fail"));
            System.out.println();
        }


        {
            char[][] board =
                    {
                            {'M', 'E', 'E', 'E', 'E'},
                            {'E', 'E', 'M', 'E', 'E'},
                            {'E', 'E', 'E', 'E', 'E'},
                            {'E', 'E', 'E', 'E', 'E'}};


            click(board, 3, 0);

            String expected = "[M, E, E, 1, B]\n"
                    + "[1, 2, M, 1, B]\n"
                    + "[B, 1, 1, 1, B]\n"
                    + "[B, B, B, B, B]\n";


            String actual = "";
            for (char[] row : board) {
                actual += Arrays.toString(row) + "\n";
            }
            System.out.println("Test 4");
            System.out.println("Expected:\n" + expected);
            System.out.println("Actual  :\n" + actual);
            System.out.println("Result  :" + (expected.equals(actual) ? "Pass" : "Fail"));
            System.out.println();
        }

    }

}
