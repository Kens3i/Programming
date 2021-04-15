#include<bits/stdc++.h>
using namespace std;
 
int main()
{
    int t;
	cin>>t;
	
	while(t--)
    {
        int g,mx;
        vector<int>v;
        cin>>g;
        while(g--)
        {
            int st,peo,pr;
            cin>>st>>peo>>pr;
            int temp=peo/(st+1);
            temp=temp*pr;
            v.push_back(temp);
        }
        cout<<*max_element(v.begin(),v.end())<<endl;
    }

    return 0;
}