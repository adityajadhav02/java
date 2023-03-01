public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,5,6,1,7,9,8};
        selection(arr, arr.length, 0, 0);

        for(int i : arr)
        System.out.print(i + " ");
    }
    static void selection(int[] arr, int r, int c, int max){
        if(r==0)
        return;

        if(c<r){
            if(arr[c] > arr[max])
            selection(arr, r, c+1, c);

            else
            selection(arr, r, c+1, max);
        }

        else{
            // Swap with last index ie r-1
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }
}
