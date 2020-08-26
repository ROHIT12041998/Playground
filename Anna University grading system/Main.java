#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  if(n==100)
    cout<<"S";
  else if(n<=99 && n>=90)
    cout<<"A";
  else if(n<=89 && n>=80)
    cout<<"B";
   else if(n<=79 && n>=70)
    cout<<"C";
   else if(n<=69 && n>=60)
    cout<<"D";
   else if(n<=59 && n>=50)
    cout<<"E";
  else if(n<50)
    cout<<"F";
  else
    cout<<"Invalid Input";
}