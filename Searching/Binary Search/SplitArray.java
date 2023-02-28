
// Split Array Largest Sum 
// https://leetcode.com/problems/split-array-largest-sum/

public class SplitArray {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        System.out.println(splitArray(nums, 2));
    }

    static int splitArray(int[] nums, int m) {
        int start = 0,end = 0;
        
        for(int i=0;i<nums.length;i++){
            start = Math.max(start, nums[i]);   // Start will have the max element of the array
            end += nums[i];         // end will have the sum of the array
        }

        // start is our max possible ans
        // end is our min possible ans
        // The ans will lie in the range of [start , end]   so apply BS.

        while(start < end){
            // mid is potential ans
            int mid = start + (end - start)/2;

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if((sum + num) > mid){
                    sum = num;
                    pieces++;
                }
                else{
                    sum+= num;
                }
            }

            if(pieces > m)
            start = mid+1;

            else
            end = mid;
        }
        return end;     // Here start == end

    }
}
