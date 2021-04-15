#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        int n;
        long long z;
        cin>>n>>z;
        priority_queue<long long>pr;
        long long temp;

        for(int i=0;i<n;i++)
        {
            cin>>temp;
            pr.push(temp);
        }
        int cou=0;
        while(!pr.empty() && z>0)
        {
            temp=pr.top();
            pr.pop();
            z=z-temp;
            temp/=2;
            pr.push(temp);
            cou++;
        }

        if(z>0)
        {
            cout<<"Evacuate"<<endl;
        }
        else
        {
            cout<<endl<<cou<<endl;
        }
    }
}