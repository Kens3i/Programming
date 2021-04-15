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
        int cou=0,flag=1;
        vector<int>arr;
        map<int,int>mappy;

        int temp;

        for(int i=0;i<n;i++)
        {
            cin>>temp;
            mappy[temp]++;
            arr.push_back(temp);
        }

        for(int i=0;i<m;i++)
        {
            cin>>temp;
            mappy[temp]=0;
            arr.push_back(temp);
        }

        sort(arr.begin(),arr.end());

        for(auto i:arr)
        {
            if(mappy[i]!=flag)
            {
                if(flag==1)
                {
                    flag=0;
                }

                else
                {
                    flag=1;
                }

                cou++;
            }
        }

        cout<<cou<<endl;
    }
}