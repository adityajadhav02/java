
class bubbleSort{
    public static void main(String[] args) {
        int[] arr = {2,4,10,6,3,1,7,45,32,43,22,15};
        bubble(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }
    static void bubble(int[] arr){
        for(int i=0;i<arr.length;i++){
            Boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(swapped == false)        // If swapping didn't happen for an i. i.e array is sorted.
            break;
        }
        
    }
}