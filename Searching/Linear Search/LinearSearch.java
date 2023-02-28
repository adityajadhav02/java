import java.util.*;
class LinearSearch {
public static void main(String[] args)
{
   Scanner in = new Scanner(System.in);
   int[] arr = new int[5];
   for(int i=0;i<5;i++)
   arr[i]=in.nextInt();

   System.out.println(search(arr,5)); 

   in.close();
}

static int search(int[] arr, int target){
    if(arr.length==0)
    return -1;

    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]==target)
        return 1;
    }
    return 0;
}

}