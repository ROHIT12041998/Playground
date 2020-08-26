#include<iostream>
using namespace std;
int main()
{
  int b,s,a,ar,l;
  cin>>b>>s>>a>>ar>>l;
  float p1=350.34*b;
  float p2=230.90*s;
  float p3=190.55*a;
  float p4=125.30*ar;
  float p5=180.90*l;
  float t=p1+p2+p3+p4+p5;
  if(t<=15000)
    cout<<"Yes";
  else
    cout<<"No";
  
}