import java.util.Arrays;
class demo{
    static void fun(int arr[]){
        for(int i: arr)
        System.out.println(i+" ");
    }
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        
        // int a = s.nextInt() ;
        // System.out.println("Number is :"+ a);
        // s.close();
        
        // int arr[] = {1, 2, 3};
        // fun(arr);

        int [][]arr = {{1, 2}, {3, 4}};
        int [][]cpy = arr.clone();
        Boolean a = false;
        boolean b = true;
        System.out.println(arr == cpy);
    }
}