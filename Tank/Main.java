#include<iostream>
using namespace std;
int main()
{
  int r,h,a1,t;
  cin>>r>>h>>a1>>t;
  int v=3.14*r*r*h;
  int a=a1*t;
  if(v<=a)
  {
    cout<<"The tank can be filled within "<<t<<" hours";
  }
  else
  {
    cout<<"The tank cannot be filled within "<<t<<" hours";
  }
}