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
        int x,y;
        cin>>x>>y;

        vector<string>arr;
        string temp;
        
        for(int j=0;j<n;j++)
        {
            cin>>temp;
            arr.push_back(temp);
        }

        string ans={};

        for(int i=0;i<n;i++)
        {
            int complete=0,partial=0;
            
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]=='F')
                {
                    complete++;
                }

                else if(arr[i][j]=='P')
                {
                    partial++;
                }
            }

            if(complete>=x)
            {
                ans.push_back('1');
            }

            else if( (complete==(x-1)) && (partial>=y) )
            {
                ans.push_back('1');
            }

            else
            {
                ans.push_back('0');
            }
        }
        cout<<ans<<endl;
    }

}