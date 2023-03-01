// To print 1 to 5
class Intro{
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n)
    {
        // Base condition
        if(n == 5)
        {
            System.out.print(n);
            return;
        }

        // Recursive Operation
        System.out.println(n);
        print(n+1);

    }
}