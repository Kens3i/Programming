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
        int tots=2*n;
        string s;
        cin>>s;
        vector<int>v;

        for(int i=0;i<tots;i++)
        {
            v.push_back(s[i]-'0');
        }

        int goalA=0,goalB=0;
        int shotsA=n,shotsB=n;

        for(int i=0;i<tots;i++)
        {
            if(i%2==0)
            {
                if(v[i]==1)
                {
                    goalA++;
                    shotsA--;
                }
                else
                {
                    shotsA--;
                }
            }

            else
            {
                if(v[i]==1)
                {
                    goalB++;
                    shotsB--;
                }
                
                else
                {
                    shotsB--;
                }
            }
            

            if(goalA>(goalB+shotsB))
            {
                cout<<i+1<<endl;
                break;
            }

            else if(goalB>(goalA+shotsA))
            {
                cout<<i+1<<endl;
                break;
            }

            else if(goalA==goalB && i==2*n-1)
            {
                cout<<i+1<<endl;
                break;
            }
        }

    }

    return 0;
}