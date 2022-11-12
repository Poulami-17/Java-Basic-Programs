import java.util.*;

public class Inverted_Half_Pyramid_Rotated_180 {
    public static void PrintPattern(int n) {
        // Row Number Detection
        for (int i = 1; i <= n; i++) {
            for (int sp = 1; sp <= (n - i); sp++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Here, row number is same as column numnber
        sc.close();
        PrintPattern(n);
    }
}
