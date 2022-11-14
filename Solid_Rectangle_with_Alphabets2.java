import java.util.*;
/*
    A B C D E 
    A B C D E 
    A B C D E 
    A B C D E 
    A B C D E 
 */
public class Solid_Rectangle_with_Alphabets2 {
    public static void PrintPattern(int n){
        for(int i=1;i<=n;i++){
            int num=65;
            for(int j=1;j<=n;j++){
                char c=(char)num;
                System.out.print(c+" ");
                num++;
            }
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
