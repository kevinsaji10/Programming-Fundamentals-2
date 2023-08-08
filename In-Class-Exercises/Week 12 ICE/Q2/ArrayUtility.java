public class ArrayUtility {
    public static String printArray(int[] arr) {
        try {
            String retStr = "[" + arr[0];
            for (int i = 1; i < arr.length; i++) {
                retStr += ", " + arr[i];
            }
            retStr += "]";
            return retStr;
        } catch (IndexOutOfBoundsException e) {
            return "[]";
        } catch (NullPointerException e) {
            return null;
        }

    }

    public static int sum(int[] arr) {
        try {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            return sum;
        } catch (IndexOutOfBoundsException e) {
            return 0;
        } catch (NullPointerException e) {
            return 0;
        }
    }

    public static int[] twoTimes(int[] original) {

        try {
            int[] twoTimes = new int[original.length];
            for (int i = 0; i < original.length; i++) {
                twoTimes[i] = original[i] * 2;
            }
            return original;
        } catch (NullPointerException e) {
            return null;
        }
    }

    public static int[] reverse(int[] arr) {
        try {
            int back = arr.length - 1;
            int front = 0;
            while (back > front) {
                int temp = arr[front];
                arr[front] = arr[back];
                arr[back] = temp;
                back--;
                front++;
            }
            return arr;
        } catch (NullPointerException e) {
            return null;
        } catch (IndexOutOfBoundsException e) {
            return arr;
        }

    }

}
