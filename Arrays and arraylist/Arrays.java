//import java.util.Arrays;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        // Array Syntax
        // int[] a = new int[5];

        // int[] arr = {34,34,56,76};

        // int [] ros={3,45,23,121,12};
       // ros = new int[4];

        // for(int i =0;i<4;i++)
        // System.out.println(Arrays.toString(ros));

        // String[] stri = {"adi","ece","iiit"};
         
        // // for each loop
        // for(String i : stri)  //for every element i in the array, print the element (i)
        // System.out.println(i+" ");


        int[][] arr2D = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i=0;i<arr2D.length;i++)
        {
            for(int j=0;j<arr2D[i].length;j++)
            {
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println("");
        }

    }

    
}
