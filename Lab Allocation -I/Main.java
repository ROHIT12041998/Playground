#include<iostream>
using namespace std;
int main()
{
 int x,y,z;
  cin>>x>>y>>z;
  if(x<y && x<z)
    cout<<"L1";
  else if(y<x && y<z)
    cout<<"L2";
  else if(z<x && z<y)
    cout<<"L3";
}