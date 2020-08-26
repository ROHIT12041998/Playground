#include<bits/stdc++.h>
using namespace std;
int main()
{
  int t,v;
  float t3,t1,t2,t4,W;
  cin>>t>>v;
   
  t1=0.6215*t;
  t2=(0.4275*t )- 35.75;
  t3=pow(v,0.16);
  t4=t2*t3;
  W=35.74 + (t1 + t4);
    cout<<W;
}