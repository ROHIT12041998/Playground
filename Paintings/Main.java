#include<iostream>
using namespace std;
int main()
{
 int l1,b1,l2,b2,l3,b3;
  cin>>l1>>b1>>l2>>b2>>l3>>b3;
  int w=l1*b1;
  int w1=l2*b2;
  int w2=l3*b3;
  if(w>=(w1+w2))
    cout<<"Leonardo can fix both painting";
  else
    cout<<"Leonardo cannot fix both painting";
}