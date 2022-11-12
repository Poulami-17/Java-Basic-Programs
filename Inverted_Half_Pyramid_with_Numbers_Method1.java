import java.util.*;

/*
    1 2 3 4 5 
    1 2 3 4   
    1 2 3     
    1 2       
    1    
 */
public class Inverted_Half_Pyramid_with_Numbers_Method1 {
    public static void PrintPattern(int n) {
        for (int i = n; i >= 1; i--) {
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
