import java.util.*;
public class Product {
    public static int Prod(int a, int b){
        int pro=a*b;
        return pro;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int prod=Prod(a, b);
        System.out.println("Product of "+a+" and "+b+": "+prod);
        sc.close();
    }
}
