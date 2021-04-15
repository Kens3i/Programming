#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        vector<long long>v;

        for(int i=0;i<n;i++)
        {
            long long temp;
            cin>>temp;
            v.push_back(temp);
        }
        long long cou=0;

        if(v.size()==1)
        {
            cout<<1<<endl;
        }

        else
        {
            long prev=v[0];
            for(auto it:v)
            {
                if(it<=prev)
                {
                    cou++;
                    prev=it;
                }
            }
            cout<<cou<<endl;
        }
    }
    return 0;
}