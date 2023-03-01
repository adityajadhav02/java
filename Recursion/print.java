class print{
    public static void main(String[] args) {
        int n = 5; 

        print1(n);
    }
    static void print1(int n){
        if(n==1)
        return;
    
        print1(n-1);
        System.out.print(n + " ");
    }
}