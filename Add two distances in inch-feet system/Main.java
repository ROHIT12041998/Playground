#include<iostream>
using namespace std;
struct dist
{
int f1,f2;
 float i1,i2;
};
int main()
{
  int f;
  float i;
  struct dist d;
  cin>>d.f1>>d.i1>>d.f2>>d.i2;
  f=d.f1+d.f2;
  i=d.i1+d.i2;
  if(i>12)
  {
    i=i-12;
  f=f+1;
  }
  cout<<f<<"'-"<<i<<'"';
}
