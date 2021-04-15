#include<iostream>
#include<string>
#include<algorithm>
using namespace std;

string solve(string s)
{
  string a= s.substr(0,s.length()/2);
  string b;

  if(s.length()%2)
  {
    b=s.substr(s.length()/2+1,s.length());
  }

  else
  {
    b=s.substr((s.length()/2),s.length());
  }

  sort(a.begin(),a.end());
  sort(b.begin(),b.end());


  if(a==b)
  {
    return "YES";
  }
  return "NO";
}


int main()
{
  int t;
  cin>>t;
  while(t>0)
  {
    string s;
    cin>>s;
    cout<<solve(s)<<endl;
    t--;
  }
  return 0;
}