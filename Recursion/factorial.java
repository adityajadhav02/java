public class factorial {
    public static void main(String[] args) {
        int n = 5; 
        int factorial = fact(n);
        int ans = sum(n);
        System.out.println(factorial + " " + ans);
    }
    // To print factorial 
    static int fact(int n){
        if(n==1)
        return 1; 

        return (n * fact(n-1));
    }

    // To print sum
    static int sum(int n){
        if(n==1)
        return 1; 

        return n+sum(n-1);
    }
}
