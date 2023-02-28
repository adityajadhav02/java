import java.util.*;
public class maxOf3 {
public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int a,b,c;
    System.out.print("Enter three numbers : ");
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();

    if(a>b)
    {
        if(a>c)        
            System.out.println(a + " is largest.");        
        else         
            System.out.println(c + " is largest.");
    }
    else
    {
        if(b>c)
        System.out.println(b + " is largest.");

        else
        System.out.println(c + " is largest.");
               
    }
    s.close();
}
    
}
