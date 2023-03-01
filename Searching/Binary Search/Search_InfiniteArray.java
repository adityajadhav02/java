// Search for target in infinite array
// Means that you cannot use size of the array in the code.

class Search_InfiniteArray{
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,9,10,13,15,17,19,20,27,30,67};
        System.out.println(ans(arr, 17));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;

        // Check if target exists in the chunk
        while(target>arr[end]){
            // Update start
            int newStart = end+1;
            // Double the box size 
            int newBoxSize = (end-start+1)*2;
            end = (end + newBoxSize);
            start = newStart;
        }

        return binarySearch(arr, target, start, end);        
    }

    static int binarySearch(int[] arr, int target,int start, int end){
        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid]==target)
            return mid;

            else if(arr[mid]>target)
            end = mid-1;

            else
            start = mid+1;
        }
        return -1;
    }
}