#include<bits/stdc++.h>
using namespace std;

long long soln(vector<long long> v,int n)
{
    long long cou=0;

    if(n==0)
    {
        return cou;
    }

    int point=0;
    int min=INT_MAX;

    for(int i=0;i<n;i++)
    {
        if(min>v[i])
        {
            min=v[i];
            point=i;
        }
    }
    vector<long long>v2;
    for(int i=0;i<point;i++)
    {
        v[i]=v[i]-min;
        v2.push_back(v[i]);
    }

    cou+=min*v.size()+soln(v2,v2.size());
    return cou;
}


int main()
{
    int t;
	cin>>t;
    while(t--)
    {
        int n,i;
        long long temp;
        cin>>n;
        vector<long long>v;

        for(i=0;i<n;i++)
        {
            cin>>temp;
            v.push_back(temp);
        }
        long long ans;

        ans=soln(v,n);

        cout<<ans<<endl;
    }

    return 0;
}