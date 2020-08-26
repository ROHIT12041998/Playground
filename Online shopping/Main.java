#include<iostream>
using namespace std;
int main()
{
 int a,d,s,a1,d1,s1,a2,d2,s2;
  cin>>a>>d>>s>>a1>>d1>>s1>>a2>>d2>>s2;
  int f=a-(d*a)/100;
  cout<<"In Flipkart Rs."<<f+s<<endl;
  int f1=a1-(d1*a1)/100;
   cout<<"In Snapdeal Rs."<<f1+s1<<endl;
  int f2=a2-(d2*a2)/100;
   cout<<"In Amazon Rs."<<f2+s2<<endl;
  if(f<f1 && f<f2)
    cout<<"He will prefer Flipkart";
  else if(f1<f && f1<f2)
    cout<<"He will prefer Snapdeal";
  else
    cout<<"He will prefer Amazon";
}