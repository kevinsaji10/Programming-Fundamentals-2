public class WebColor {
    private int red;
    private int green;
    private int blue;

    public WebColor(int red, int green, int blue) {
        if (red < 0 || red > 255) {
            throw new IllegalArgumentException("red is invalid");
        }
        if (green < 0 || green > 255) {
            throw new IllegalArgumentException("green is invalid");
        }
        if (blue < 0 || blue > 255) {
            throw new IllegalArgumentException("blue is invalid");
        }  
        this.red = red;
        this.blue = blue;
        this.green = green;
    }

    public WebColor(String hexString) {
        if (!hexString.startsWith("#") || hexString.length() != 7) {
            throw new IllegalArgumentException("invalid hexstring");
        }  

        try {
        red = Integer.parseInt(hexString.substring(1, 3), 16);
        green = Integer.parseInt(hexString.substring(3, 5), 16);
        blue = Integer.parseInt(hexString.substring(5), 16);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("invalid hexstring");
        }
        
    }
    private String getHex(int color) {
        String result = Integer.toHexString(color);
        if (result.length() == 1) {
            result = "0" + result;
        }
        return result;
    }

    public WebColor add(WebColor another) {
        int newRed = (red * another.red)/255;
        int newGreen = (green * another.green)/255;
        int newBlue = (blue * another.blue)/255;

        return new WebColor(newRed,newGreen, newBlue);

    }
    public String toHexString() {
        String result = "#" + getHex(red) + getHex(green) + getHex(blue);
        return result.toUpperCase();
    }
    public String toString() {
        return red + ":" + green + ":" + blue;
    }
    public static void main(String[] args) {
        // WebColor c= new WebColor(255, 0, 0);
        // System.out.println(c.toHexString());
        WebColor c = new WebColor("#FFEE00");
        System.out.println(c.toString());
    }
}
