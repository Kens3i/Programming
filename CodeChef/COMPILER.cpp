#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
	cin>>t;
	
	while(t--)
    {
        char temp;
        string s;
        cin>>s;
        int x=0,point=0;

        for(int i=0;i<s.size();i++)
        {
            if(s[i]=='<')
            {
                x++;
            }

            else if(s[i]=='>')
            {
                x--;

                if(x<0)
                {
                    break;
                }
            }

            if(x==0)
            {
                point=i+1;
            }
        }

        cout<<point<<endl;

    }
}