#include<iostream>
using namespace std;
int main()
{
  int r,c,t,flag=0;
  cin>>r>>c>>t;
  for(int i=0;i<r;i++)
  {
    if(t>=i && t<=r)
    {
      flag=1;
    }
    else if(r*i+1==t)
    {
      flag=1;
    }
  }
  if(flag==1)
    cout<<"Yes";
  else
    cout<<"No";
}