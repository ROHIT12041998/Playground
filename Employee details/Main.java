#include<iostream>
using namespace std;
union emp
{
  char name[20];
  int sal;
};
int main()
{
  emp e;
  cout<<"Enter the Employee details "<<endl;
  cout<<"Enter the Employee name :"<<endl;
  cin>>e.name;
  cout<<"Enter the Employee salary :"<<endl;
  cin>>e.sal;
  cout<<"Employee Details"<<endl;
  cout<<e.name<<" "<<e.sal;
}