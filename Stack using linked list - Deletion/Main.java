#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
node*head=NULL;
void push(int d)
{
  node*newnode;
  newnode=new node;
  newnode->data=d;
  newnode->next=head;
  head=newnode;
}
void display()
{
  node*temp=head;
  while(temp!=NULL)
  {
    cout<<temp->data<<" ";
    temp=temp->next;
  }
  
 
}
void del()
{
  
  node*temp=head;
 
  while(temp!=NULL)
  {
    cout<<"Deleted element is "<<temp->data<<endl;
    temp=temp->next;
  }
   if(temp==NULL)
  {
    cout<<"Stack is empty"<<endl;
  }
}
int main()
{
  int d;
  do
  {
    cin>>d;
    if(d<0)
      break;
    push(d);
  }while(1);
   cout<<"Before deleting:"<<endl;
  display(); 
  cout<<endl;
  del();
  return 0;
}
      