import java.util.*;
// Binomial Coefficient= n!/(r!*(n-r)!)
public class BinomialCoeff {
    public static long Fact(long n){
        long fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static long Binomial(long n,long r){
        long nFact=Fact(n);
        long rFact=Fact(r);
        long nmrFact=Fact(n-r);
        long ans=nFact/(rFact*(nmrFact));
        return ans;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        long r=sc.nextInt();
        long BinomialAns=Binomial(n, r);
        System.out.println(BinomialAns);
        sc.close();
    }
}
