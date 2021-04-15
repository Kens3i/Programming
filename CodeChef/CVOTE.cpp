#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int n,m;
    cin>>n>>m;

    map<string,string>m1;
    map<string,long long>m2,m3;
    string s1,s2;

    for(int i=0;i<n;i++)
    {
        cin>>s1>>s2;
        m1[s1]=s2; 
    }

    for(int i=0;i<m;i++)
    {
        cin>>s1;
        m2[m1[s1]]++;
        m3[s1]++; 
    }
    long maax=-1;
    string ans1;
    for(auto it:m2)
    {
        if(maax<it.second)
        {
            maax=it.second;
            ans1=it.first;
        }
    }
    string ans2;
    maax=-1;

    for(auto it:m3)
    {
        if(it.second>maax)
        {
            ans2=it.first;
            maax=it.second;
        }
    }

    cout<<ans1<<endl<<ans2;

    return 0;
}