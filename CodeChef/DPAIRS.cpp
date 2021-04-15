#include<bits/stdc++.h>
using namespace std;
#define ll long long

int main()
{
    ll n,m;
    cin>>n>>m;
    vector<ll>arr1,arr2;
    ll temp;
    ll min_arr1=INT_MAX;
    ll max_arr2=INT_MIN;
    ll min_arr1_pt,max_arr2_pt;

    for(int i=0;i<n;++i)
    {
        cin>>temp;
        arr1.push_back(temp);

        if(min_arr1>arr1[i])
        {
            min_arr1=arr1[i];
            min_arr1_pt=i;
        }   
    }

    for(int i=0;i<m;++i)
    {
        cin>>temp;
        arr2.push_back(temp);

        if(max_arr2<arr2[i])
        {
            max_arr2=arr2[i];
            max_arr2_pt=i;
        }   
    }

    for(int i=0;i<m;++i)
    {
        cout<<min_arr1_pt<<" "<<i<<endl;
    }

    for(int i=0;i<n;++i)
    {
        if(min_arr1_pt==i)
        {
            continue;
        }
        else
            cout<<i<<" "<<max_arr2_pt<<endl;
    }

    return 0;
}