#include<iostream>
using namespace std;
int sum(int n);
int main()
{
  int n;
  cin>>n;
  int res = sum(n);
  cout<<"The factorial of "<<n<<" is "<<res;
  return 0;
}
int sum(int n)
{
  if(n!=0)
  {
    return n * sum(n-1);
  }
  else
  {
    return 1;
  }
}
