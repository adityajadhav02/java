import java.util.*;
public class functions {
    public static void main(String[] args) {
     //Scanner s = new Scanner(System.in);
    int ret = sum();
    System.out.println(ret);
    }

    static int sum()
    {
     Scanner s = new Scanner(System.in);
    int m = s.nextInt();
    int n = s.nextInt();
    int ans = m+n;
    return ans;

    }
}
