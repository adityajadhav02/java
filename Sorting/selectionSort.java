import java.util.*;
public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {2,4,10,6,3,1,7,45,32,43,22,15};
        selection(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i] + " ");
    }
    static void selection(int[] arr)
    {
        int n = arr.length;

        for(int i =0;i<n-1;i++)
        {
            // from remaining array find the min element and place it int its correct index, which is i
            int min_index = i;
            for(int j = i+1; j<n; j++)
            {
                if(arr[j]<arr[min_index])
                min_index = j;
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }
}
