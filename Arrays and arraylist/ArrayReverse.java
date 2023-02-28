import java.util.*;

public class ArrayReverse {
public static void main(String[] args) {
    Scanner s= new Scanner(System.in);

    int[] arr = new int[4];

    for(int i=0;i<arr.length;i++)
    arr[i]=s.nextInt();

    int a = 0;
    int b=(arr.length)-1;
    while(a<b)
    {
       int temp = arr[a];
       arr[a] = arr[b];
       arr[b] = temp;

       a++;
       b--;
    }

    for(int i=0;i<arr.length;i++)
    System.out.print(arr[i]+ " ");
}    
}
