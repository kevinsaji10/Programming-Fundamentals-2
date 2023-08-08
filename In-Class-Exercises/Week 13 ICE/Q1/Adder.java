
public class Adder {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        try {
            int sum = 0;
            String retstr = args[0];
            for (int i = 1; i < args.length; i++) {
                if (isNumeric(args[i])) {
                    retstr += " + " + args[i];
                    sum += Integer.parseInt(args[i]);
                }
            }
            System.out.println(retstr + " = " + sum);
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }
}
