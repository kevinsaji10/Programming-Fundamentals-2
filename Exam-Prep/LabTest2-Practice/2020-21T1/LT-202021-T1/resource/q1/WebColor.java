public class WebColor {
    private int red;
    private int blue;
    private int green;
    public boolean within(int test) {
        if (test>=0 && test <=255) {
            return true;
        }
        else {
            return false;
        }
        
    }
    public WebColor(int red, int green, int blue) throws IllegalArgumentException {
        if (within(red)) {
            this.red = red;

        } else {
            throw new IllegalArgumentException("invalid int value");
        }
        if (within(green)) {
            this.green = green;

        } else {
            throw new IllegalArgumentException("invalid int value");
        }
        if (within(blue)) {
            this.blue = blue;

        } else {
            throw new IllegalArgumentException("invalid int value");
        }
        
    }
    public static int toDec(String letter) throws IllegalArgumentException{
        char test = letter.charAt(0);
        if (!((test >= 'A' && test <= 'F') || (test >= '0' && test <= '9'))) {
            throw new IllegalArgumentException("invalid hexstring");
        }
        if (letter.equals("A")) {
            return 10;
        } else if (letter.equals("B")) {
            return 11;
        } else if (letter.equals("C")) {
            return 12;
        } else if (letter.equals("D")) {
            return 13;
        } else if (letter.equals("E")) {
            return 14;
        } else if (letter.equals("F")) {
            return 15;
        } else {
            return Integer.parseInt(letter);
        }   
    }
    public static String toHex(int dec) {
        if (dec == 10) {
            return "A";
        } else if (dec == 11) {
            return "B";
        } else if (dec == 12) {
            return "C";
        } else if (dec == 13) {
            return "D";
        } else if (dec == 14) {
            return "E";
        } else if (dec == 15) {
            return "F";
        } else {
            return "" + dec;
        } 
        
    }
    public static String hexConverter(int dec) throws IllegalArgumentException{
        if (dec < 0 || dec > 255) {
            throw new IllegalArgumentException("invalid hexstring");
        }
        String first = toHex(dec / 16);
        String second = toHex(dec % 16);
        return first + second;
    }
    public WebColor(String hexString) throws IllegalArgumentException{
        if (hexString.length() != 7 || hexString.charAt(0) != '#') {
            throw new IllegalArgumentException("invalid hexstring");
        }
        String redHex = hexString.substring(1,3);
        String greenHex= hexString.substring(3,5);
        String blueHex= hexString.substring(5);
        this.red = 16 * toDec(redHex.substring(0,1)) + toDec(redHex.substring(1));
        this.green = 16 * toDec(greenHex.substring(0,1)) + toDec(greenHex.substring(1));
        this.blue = 16 * toDec(blueHex.substring(0,1)) + toDec(blueHex.substring(1));
        
    }

    public WebColor add(WebColor another) {
        int newRed = this.red * another.red / 255;
        int newGreen = this.green * another.green / 255;
        int newBlue = this.blue * another.blue / 255;
        WebColor ret = new WebColor(newRed, newGreen, newBlue);
        return ret;
    }

    public String toHexString() {
        return "#" + hexConverter(red) + hexConverter(green) + hexConverter(blue);
    }
    @Override
    public String toString() {
        return red + ":"+ green +":" + blue;
    }

    
}
