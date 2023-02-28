public class String_Operators {
    public static void main(String[] args) {

        // If any one of the datatype is string, then the ans will be a string

        // System.out.println('a'+'b');
        // System.out.println('a'+3);
        // System.out.println((char)('a'+3));  //Type casting
        // System.out.println("a"+"b");
        // System.out.println("a"+3);
        // System.out.println(3+3);

        String a1 = "ab";
        String a2 = "c";
        String b1 = "a";
        String b2 = "bc";

        a1 = a1.concat(a2);
        b1 = b1.concat(b2);
        System.out.println(a1.equals(b1));
        System.out.println(a1+"  " +b1);


    }
}
