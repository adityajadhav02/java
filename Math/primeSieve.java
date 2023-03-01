class primeSieve{
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n+1];
        sieve(n, primes);
    }
    static void sieve(int n, boolean[] primes){
        for(int i=2; i*i<=n;i++){
            if(primes[i] == false){         // false means the no is prime
                for(int j = i*2; j<=n; j += i){
                    primes[j] = true;       // so make all its multiples true i.e they are not prime
                }
            }
        }

        for(int i=2; i<=n;i++){
            if(primes[i] == false)
            System.out.print(i + " ");
        }
    }
}