class Solution
{
    public boolean isPrime(int n ) {
        for(int i = 2;i<n;i++) {
            if(n%i==0) return false;
        }
        return true;
    }
    public int NthTerm(int N)
    {
        // code here
        int ans = 0;
        int i = 1;
        if(N==1) return 1;
        if(N==2) return 0;
        if(isPrime(N)) return 0;
        else {
            while(ans==0) {
                if(isPrime(N+i)) 
                    return i;
                else if(isPrime(N-i)) 
                   return i;
                else 
                   i++;
            }
        }
        return i;
    }
}
