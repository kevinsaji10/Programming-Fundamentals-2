import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Utility {

    /**
     * This method reads from the specified filename a gomoku board
     * of the following format:
     *
     * ! this is a comment
     * ###############
     * ##O############
     * ###X###########
     * ####O##########
     * ####OOX########
     * ###OXXOO#######
     * ###XOOXX#######
     * ####XOXX#######
     * #####XO#X######
     * ####X##O#O#####
     * ###############
     * ###############
     * ###############
     * ###############
     * ###############
     *
     * Note: Any lines that begins with a ! sign is ignored.
     *
     * 'X' - player A,'O' - player B, '#' - vacant cell
     * @param   filename the name of the file
     * @return  a 2-dimensional array(containing 'X', 'O' or '#') if the board is valid.
     *          Otherwise, return a empty 2-dimensional array.
     */
    public static char[][] readFromFile(String filename) {
        return null;
    }


}
