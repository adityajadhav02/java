public class sumOfDigits {
    public static void main(String[] args) {
        int ans = sumDigit(123);
        System.out.println(ans);
    }

    static int sumDigit(int n){
        if(n==0)
        return 0;

        return n%10 + sumDigit(n/10);
    }
}
