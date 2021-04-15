#include<bits/stdc++.h>
using namespace std;

int main()
{
    unordered_map<int,int>um;
    
    for(int i=0;i<3;i++)
    {
        int x;
        cin>>x;
        um[x]++;
    }

    bool flag=true;
    for(auto it:um)
    {
        if(it.second>1)
        {
            cout<<"YES";
            flag=false;
            break;
        }

    }

    if(flag)
    {
        cout<<"NO";
    }
    return 0;
}