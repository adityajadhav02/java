#include<bits/stdc++.h>
using namespace std;
int main()
{ 
    int n = 3;
    int base = 5, ans = 0;

    while(n>0)
    {
        int last = n & 1;
        n = n >> 1;
        ans += base * last;
        base = base * 5;
    }
    cout<<ans;
    return 0;
}