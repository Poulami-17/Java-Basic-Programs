import java.util.*;

/*
    1 
    1 2       
    1 2 3     
    1 2 3 4   
    1 2 3 4 5 
 */
public class Half_Pyramid_with_Numbers {
    public static void PrintPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
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
