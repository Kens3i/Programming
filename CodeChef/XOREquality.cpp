#include<bits/stdc++.h>
using namespace std;

int modExpo(long long x, int y, int p)
{
    int res = 1;
    x = x % p;
  
    if (x == 0)
    {
        return 0;
    }
 
    while (y > 0)
    {
        if (y & 1)
        {
            res = (res*x) % p;
        }
        
        y = y/2;
        x = (x*x) % p;
    }
    return res;
}

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        long long n;
        cin>>n;
        cout<<modExpo(2,n-1,1000000007)<<endl;
    }
    return 0;
}