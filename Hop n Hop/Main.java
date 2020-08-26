#include<bits/stdc++.h>
using namespace std;
int main()
{
 int x,y,x2,y2;
  cin>>x>>y;
  x2=abs(x-3);
  y2=abs(y-4);
  if(x2<y2)
    cout<<y2;
  else
    cout<<x2;
 
}