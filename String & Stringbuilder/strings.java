import java.util.*;
public class strings {
    public static void main(String[] args) {
        String a = "Aditya";
        System.out.println(a);
        System.out.println(45);
        System.out.println(new int[]{1,2,3});
        System.out.println(Arrays.toString(new int[]{1,2,3}));

        float f = 123.3456f;
        // printf stands for print formatted
        // % is a placeholder
        System.out.printf("Formatted number is %.2f ",f);

        System.out.printf("Value of PI is %.4f ",Math.PI);
        System.out.println();
        System.out.printf("This is a %s and %s","placeholder1","placeholder2");


    }
}
