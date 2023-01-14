import java.util.*;
public class factorial {
    public static int Fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Fact(num));
        sc.close();
    }
}
