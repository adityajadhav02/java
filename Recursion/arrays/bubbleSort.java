public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,7,1,2,8,9};
        bubble(arr, arr.length-1, 0);
        for(int i : arr)
        System.out.print(i + " ");
    }
    static void bubble(int[] arr, int r, int c){
        if(r==0)
        return;

        if(c<r){
            if(arr[c]>arr[c+1]){
                // Swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }
        else
        bubble(arr, r-1, 0);
    }
}
