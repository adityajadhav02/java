import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExamples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //syntax
         ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(4);
        list.add(20);
        list.add(100);
        list.add(66);
        // System.out.println(list);

        // System.out.println(list.contains(555)); // check if it contains the given no.

        // list.set(0, 99);  // update list
        // list.remove(1);  //removes the value at index given

        // System.out.println(list);


        // for (int i=0 ; i<5;i++)
        // list.add(s.nextInt());

        //System.out.println(list.toArray()) ;
        Object[] arr = list.toArray();
        //System.out.println(arr);

     //System.out.print(list.get(2));  // get is for accessing any element at given index 





    }
    
}
