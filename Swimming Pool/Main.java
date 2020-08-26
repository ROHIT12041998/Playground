#include<iostream>
using namespace std;
int main()
{
  int a,b;
  int c;
  cin>>a>>b;
  c=(a*100)*(a*100)*(a*100);
   b=b*1000;
  if(c>=b)
  {
    cout<<"Can store";
  }
  else
  {
    cout<<"Cannot store";
  }
  
}