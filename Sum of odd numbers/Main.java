#include<iostream>
using namespace std;
int main()
{
  int n;
    cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
   int sum(int n);
  cout<<sum(n);
  //Type your code here.
}
int sum(int n)
{
  int sum=0,i,a[i];
cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
  cin>>a[i];
  for(i=0;i<n;i++)
  {
  if(a[i]%2==1)
    sum=sum+a[i];
  }
   cout<<"The sum of the odd elements in the array is ";
  return sum;
}