/*
a
aba
abcba
abcdcba
abcdedcba
*/

import java.util.*;
public class pattern{
    public static void main(String[] args) {
        int n = 5;
        for(int i=0; i<=n; i++){
            for(int j = n-i-1; j>=0; j--){
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print("*" + " ");
            }
            System.out.println("");
        }
    }
}