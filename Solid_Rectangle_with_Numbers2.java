import java.util.*;
public class Solid_Rectangle_with_Numbers2 {
    public static void PrintPattern(int n){
        // Detetion Of Rows
        for(int i=1;i<=n;i++){
            // Calculating the number of elements and printing them
            for(int j=1;j<=n;j++)
                System.out.print(j+" ");
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
