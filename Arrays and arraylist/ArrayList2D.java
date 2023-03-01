import java.util.ArrayList;
import java.util.Scanner;
public class ArrayList2D {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //initialization
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(s.nextInt());

            }
        }

     System.out.println(list);
     System.out.print(list.get(2));  
    }

    
}
