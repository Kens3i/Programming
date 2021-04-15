#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;
    while(t--)
    {
        int n,m;
        cin>>n>>m;
        int arr[n];

        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }

        unordered_set<int> uniq;

        for(int i=0;i<n;i++)
        {
            if(uniq.find(arr[i])==uniq.end())
            {
                uniq.insert(arr[i]);
            }
        }

        if (uniq.size()==m)
        {
            cout<<"No";
        }
        else
        {
            cout<<"Yes";
        }
    }
}