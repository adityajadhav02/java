public class Print1_to_n {
    public static void main(String[] args) {
       print1toN(7);
    //    printNto1(7);
    }
    static void print1toN(int n)
    {
        if(n==0)
            return;

            print1toN(n-1);
            System.out.print(n + " ");
    }

    static void printNto1(int n){
        
        if(n<=0){
            return;
        }
        
        System.out.print(n + " ");
        printNto1(n-1);
    }
}
