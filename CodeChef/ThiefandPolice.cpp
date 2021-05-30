#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
	cin>>t;
	
	while(t--)
    {
        int n,m,x,y,a,b;

        cin>>n>>m;
        cin>>x>>y;
        cin>>a>>b;

        int police,theif;
        
        police=max(n-a,m-b);
        theif=n-x+m-y;
        

        if(police>=theif)
        {
            cout<<"YES"<<endl;
        }

        else
        {
            cout<<"NO"<<endl;
        }
    }
}