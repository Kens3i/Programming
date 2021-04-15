#include<bits/stdc++.h>
using namespace std;

int main()
{
    long long n;
    cin>>n;
    while(n--)
    {
        long long x;
        cin>>x;
        long long fact=1;
        long long cou=0;

        for(long long i=5;x/i>=1;i*=5)
        {
            cou+=x/i;
        }
        
        cout<<cou<<endl;
    }
}