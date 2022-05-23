package HW1;

public class Ex2 {
    public static int max(int[] m) {
        // int max = 0;
        // for (int i = 0; i < m.length; i++) {
        // if (max < m[i])
        // max = m[i];

        // }
        int max = 0, i = 0;
        while (i < m.length) {
            if (max < m[i])
                max = m[i];
            i += 1;

        }
        return max;
    }

    public static void main(String[] aStrings) {
        int[] numbers = new int[] { 4, 3, 1, 9, 2 };
        System.out.println(max(numbers));
    }

}
