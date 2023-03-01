public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6,8,10,12,14};
        int target = 12;
        int ans = BS(arr, target, 0, arr.length-1);
        System.out.println(ans);
    }

    static int BS(int[] arr, int target, int s, int e){
        if(s>e)
        return -1;

        int mid = s + (e-s)/2;

        if(arr[mid] == target)
        return mid;

        if(target < arr[mid])
        return BS(arr, target, s, mid-1);

        return BS(arr, target, mid+1, e);
    }
}
