package HW1;

public class Exercise1a {
    public static void printStar(int num) {
        for (int index = 0; index < num; index++) {
            System.out.print("*");
        }

    }

    public static void main(String[] arStrings) {
        for (int i = 0; i < 6; i++) {
            printStar(i);
            System.out.println("");
        }

    }
}
