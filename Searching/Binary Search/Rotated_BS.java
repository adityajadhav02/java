class Rotated_BS{
    public static void main(String[] args) {
        
        // pivot is the largest element in rotated array
        // Here 9 is the pivot
        int arr[] = {4,5,7,9,0,1,2};        
        int pivot = findPivot(arr);
        int key = 7;
        if(binarySearch(arr, key, 0, pivot) == -1 )
        System.out.println(binarySearch(arr, key, pivot+1, arr.length-1));

        else
        System.out.println(binarySearch(arr, key, 0, pivot));
        
    }
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;
            // 4 cases over here
            if(mid<end && arr[mid] > arr[mid+1])
            return mid;
    
            if(mid>start && arr[mid]<arr[mid-1])
            return (mid-1);
    
            if(arr[mid]<=arr[start])
            end = mid-1;
    
            else{
                start = mid + 1;
            }
        }

       return -1; 
    }

    static int binarySearch(int[] arr, int key,int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;
            if(arr[mid]==key)
            return mid;

            else if (arr[mid]<key)
            start = mid + 1;

            else 
            end = mid -1;
        }
        return -1;
    }
}