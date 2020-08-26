#include<iostream>
using namespace std;
int main()
{
  int n,n1,n2;
  cin>>n>>n1>>n2;
  if((n>n1 && n<n2)||(n<n1 && n>n2))
  {
    cout<<"The treasure is in box which has number "<<n<<endl;
  }
  else   if((n1>n && n1<n2)||(n1<n && n1>n2))
  {
    cout<<"The treasure is in box which has number "<<n1<<endl;
  }
  else   if((n2>n && n2<n1)||(n2<n && n2>n1))
  {
    cout<<"The treasure is in box which has number "<<n2<<endl;
  }
  if(n1%n==0 && n2%n==0)
    cout<<"The code to open the box is "<<n;
  else if(n%n1==0 && n2%n1==0)
    cout<<"The code to open the box is "<<n1;
  else if(n%n2==0 && n1%n2==0)
    cout<<"The code to open the box is "<<n2;
  else
    cout<<"The code to open the box is 1";
  
  
}