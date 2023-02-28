public class RotationCount {
public static void main(String[] args) {
    int arr[] = {4,5,7,9,12,34,0,1,2,3};        
    int pivot = findPivot(arr); 
    System.out.println(pivot + 1);
}
static int findPivot(int[] arr){

    int start = 0,end = arr.length -1;

    while(start<=end){
        int mid = start + (end - start)/2;

        // 4 cases
        if(mid<end && arr[mid]>arr[mid+1])
        return mid;

        else if (mid<start && arr[mid]<arr[mid-1])
        return mid-1;

        else if(arr[start]>arr[mid])
        end = mid -1;

        else
        start = mid + 1;

    }
    return -1;

}
    
}
