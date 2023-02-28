import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        switch (n) {
            case 1,4,5,6 : 
            System.out.println("One");             
            break;

            case 2: 
            System.out.println("Two");             
            break;

            case 3: 
            System.out.println("Three");             
            break;

            
        
            default:
            System.out.println("This is default..");             

                break;
        }
    }
}
