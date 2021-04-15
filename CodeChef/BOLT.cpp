#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        double a,b,c,v;
        cin>>a>>b>>c>>v;

        double tots,tme;
        tots=a*b*c*v;

        tme=100/tots;

        tme=round(tme*100)/100;
        
        if(tme<9.58)
        {
            cout<<"YES"<<endl;
        }
        else
        {
            cout<<"NO"<<endl;
        }
    }
    return 0;
}