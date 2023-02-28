import java.util.*;
class BinarySearch {
public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);

   int n = in.nextInt();

   int[] arr = new int[n];
   for(int i=0;i<n;i++)
   arr[i]=in.nextInt();

   int target = in.nextInt();
   System.out.println("Index : "+ binarySearch(arr, target));
   in.close();
}

// returns the index
// return -1 if not found
static int binarySearch(int[] arr , int target)
{
    int start =0;
    int end = arr.length-1;

    while(start<=end)
    {
        // int mid = (start+end)/2;          s+e  may exceed int range
        int mid = start + (end- start)/2;    // better approach to write mid
        if(arr[mid]==target)
        return mid;

        else if(arr[mid]<target)
            start = mid+1;

        else if(arr[mid]>target)
        end = mid-1;
    }
    return -1;


}
}