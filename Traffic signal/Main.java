#include<iostream>
using namespace std;
int main()
{
  float s,d,t;
  cin>>s>>d>>t;
  float a=s*d;
  float g=d/(t/(60*60));
  if(g<=s)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
}