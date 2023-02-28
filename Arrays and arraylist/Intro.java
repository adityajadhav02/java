import java.util.Scanner;

public class Intro{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Hello World..");
        
        // int roll = 45;
        // float marks = 45.4f;
        // char c = 'g';
        // double largeDecimals = 2354.357;
        // long largeIntegers = 34534545L;
        // boolean check = false;

        // System.out.println(c);
        // System.out.println(roll);

        int a = input.nextInt();
        System.out.println("Your roll no is " + a);

        String nam = input.nextLine();
        System.out.println(nam);


        input.close();


    }

}
 