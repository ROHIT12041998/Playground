#include<iostream>
using namespace std;
int main()
{
int age;
float t;
  cin>>age>>t;
  if(age>13 && t>=13.30)
    cout<<"$5.00";
  else if(age<=13 && t>=13.30)
    cout<<"$2.00";
  else if(age<=13 && t<=13.30)
    cout<<"$4.00";

  else
    cout<<"$8.00";
}