import java.util.*;
/*
        *****
       ***** 
      *****  
     *****   
    *****    
 */
public class Solid_Rohmbus {
    public static void PrintPattern(int n){
        // Detection of Rows
        for(int i=1;i<=n;i++){
            // Calculation & Print number of Spaces
            for(int sp=1;sp<=n-i;sp++)
                System.out.print(" ");
            // Calculation & Print of Stars
            for(int j=1;j<=n;j++)
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
