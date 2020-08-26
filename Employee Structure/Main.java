#include<iostream>
using namespace std;
struct data
{
  char name[20];
  int ID;
  int age;
  char des[50];
  int salary;
};

int main()
{
  data p1;
  
  cout<<"Enter name:"<<endl;
  cin>>p1.name;
  cout<<"Enter ID:"<<endl;
  cin>>p1.ID;
  cout<<"Enter age:"<<endl;
  cin>>p1.age;
  cout<<"Enter designation:"<<endl;
  cin>>p1.des;
  cout<<"Enter Salary:"<<endl;
  cin>>p1.salary;
  cout<<"Employee Details"<<endl;
  cout<<"Name of the Employee : "<<p1.name<<endl;
  cout<<"ID of the Employee : "<<p1.ID<<endl;
  cout<<"Age of the Employee : "<<p1.age<<endl;
  cout<<"Designation of the Employee : "<<p1.des<<endl;
  cout<<"Salary of the Employee : "<<p1.salary<<endl;
}