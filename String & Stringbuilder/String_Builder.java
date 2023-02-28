
public class String_Builder {
    public static void main(String[] args) {
       
        StringBuilder builder = new StringBuilder();
    
        String series = "";

        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);

            // This will have n^2 complexity as new objects are created with each append
            // So we use stringBuilder class
            // series = series + ch;   

            builder.append(ch);
            // Various methods are available with string builder class.
        }
        builder.replace(0,1,"k");
        System.out.println(builder);
    }
}
