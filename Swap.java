class Swap{
    public static void SwapV(int a,int b) {
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a= "+a+"b= "+b);
    }
    public static void main(String[] args){
        int a=5, b=3;
        SwapV(a, b);
        System.out.println("a= "+a+"b= "+b);
    }
}