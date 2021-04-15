#include<bits/stdc++.h>
#include<iostream>
using namespace std;

int main()
{
    int r,o,c;

    cin>>r;
    cin>>o;
    cin>>c;

    int rem=(20-o)*6;

    int maax=rem*6;

    int tots=maax+c;

    if(tots>r)
    {
        cout<<"YES";
    }
    else
    {
        cout<<"NO";
    }

    return 0;
}