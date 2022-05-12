package HW1;

public class Ex1b {

    public static void drawTriangle(int N) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }

    }

    public static void main(String[] aStrings) {
        drawTriangle(10);

    }

}
