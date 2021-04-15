#include<bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin>>t;

    while(t--)
    {
        long long n;
        cin>>n;
        
        if(n==1)
        {
            cout<<20<<endl;
        }
        else if(n==2)
        {
            cout<<36<<endl;
        }
        else if(n==3)
        {
            cout<<51<<endl;
        }
        else if(n==4)
        {
            cout<<60<<endl;
        }

        else
        {
            long long remain=n%4;
            long long answer=((n-remain)/4)*44;

            if(remain==0)
            {
                answer+=16;
            }
            else if(remain==1)
            {
                answer+=32;
            }
            else if(remain==2)
            {
                answer+=44;
            }
            else if(remain==3)
            {
                answer+=55;
            }
            cout<<answer<<endl;
        }
    }
    return 0;
}