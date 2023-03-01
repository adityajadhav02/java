import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = s.nextInt();

        int a = 0,b=1;
        int count = 2;

        while(count<=n)
        {
            System.out.print(a + " ");
            int temp = b;
            b=a+b;
            a=temp;
            count++;
        }
        s.close();
    }
}
