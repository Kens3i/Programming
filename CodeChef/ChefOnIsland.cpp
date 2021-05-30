#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        int x,y,xr,yr,d;
        cin>>x>>y>>xr>>yr>>d;

        int tots=min((x/xr),(y/yr));

        if(tots<d)
        {
            cout<<"NO"<<endl;
        }

        else
        {
            cout<<"Yes"<<endl;
        }

    }
}