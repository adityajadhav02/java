import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,10,6,3,1,7,45,32,43,22,15};
        insertion(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }
    static void insertion(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                break;
            }
        }
    }
}
