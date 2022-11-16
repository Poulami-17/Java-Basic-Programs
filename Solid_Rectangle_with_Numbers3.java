import java.util.*;
/*
    5 5 5 5 5 
    4 4 4 4 4 
    3 3 3 3 3 
    2 2 2 2 2 
    1 1 1 1 1 
 */
public class Solid_Rectangle_with_Numbers3 {
    public static void PrintPattern(int n){
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n;j++)
                System.out.print(i+" ");
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
