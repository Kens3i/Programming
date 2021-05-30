#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int X,A,B;
        cin>>X>>A>>B;
        int ans;
        ans=(A+(100-X)*B)*10;
        cout<<ans<<endl;
    }
}