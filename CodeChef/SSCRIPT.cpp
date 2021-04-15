#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        int n,k;
        cin>>n>>k;
        string s;
        cin>>s;
        int cou=0,cur_cou=0;

        for(int i=0;i<n;i++)
        {
            if(s[i]=='*')
            {
                cur_cou++;

                if(cur_cou>=cou)
                {
                    cou=cur_cou;
                }
            }

            else
            {
                cur_cou=0;
            }
        }

        if(cou>=k)
        {
            cout<<"YES"<<endl;
        }
        else
        {
            cout<<"NO"<<endl;
        }
    }
    return 0;
}