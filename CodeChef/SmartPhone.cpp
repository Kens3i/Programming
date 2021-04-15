#include<bits/stdc++.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    vector<long long>v;

    for(int i=0;i<n;i++)
    {
        int temp;
        cin>>temp;
        v.push_back(temp);
    }
    sort(v.begin(),v.end());
    long long mx=0;
    for(auto it:v)
    {
        mx=max(mx,it*n);
        n--;
    }

    cout<<mx<<endl;
}