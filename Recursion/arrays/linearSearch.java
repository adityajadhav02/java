import java.util.ArrayList;

public class linearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,7,4};
        //System.out.println(search(arr, 0, 10));


        System.out.println(findAllIndex(arr, 0, 4));
    }
    static int search(int[] arr, int index, int target){
        // Base condition if at last index, return false
        if(index == arr.length)
        return -1;

        if(arr[index] == target)
        return index;

        return search(arr, index+1, target);
    }


    // Find all index
    // But don't pass list into argument.

    static ArrayList<Integer> findAllIndex(int[] arr, int index, int target){
        
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length)
        return list;

        if(arr[index] == target)
        list.add(index);

        // This has the list returned from below calls
        ArrayList<Integer> ansFromBelowCalls =  findAllIndex(arr, index + 1, target);

        // Append the current call's answer to the list that will be returned.
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
