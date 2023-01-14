import java.util.*;
public class BinaryToDecimal {
    public static int Conversion(int num){
        int Dec=0,power=0;
        while(num!=0){
            int ld=num%10;
            Dec=Dec+ld*(int)(Math.pow(2,power));
            num=num/10;
            power++;
        }
        return Dec;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(Conversion(num));    
        sc.close();
    }
}
