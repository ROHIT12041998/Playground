#include<iostream>
using namespace std;
struct node
{
  int data;
  node*next;
};
node*head=NULL;
node*tail=NULL;
void append(int data)
{
  node*newnode;
  newnode=new node;
  newnode->data=data;
  newnode->next=NULL;
  if(head==NULL)
  {
    head=newnode;
    tail=newnode;
  }
  else
  {
    tail->next=newnode;
    tail=newnode;
  }
}

void del(int s)
{
  node *temp=head;
  head=head->next;
  free(temp);
   //temp->next=NULL
 
}
void display()
{
    node *temp;
    temp = head;
    if(temp == NULL)
        cout<<"No value to delete"<<endl;
    else
    {
        while(temp!= NULL)
        {
            cout<<temp->data<<endl;
        	temp=temp->next;
        }
    }
}
int main()
{
  int data;
  do
  {
    cin>>data;
    if(data<0)
      break;
    append(data);
  }while(data>0);
  cout<<"Before deletion:"<<endl;
  display();
   int s,i;
  cin>>s;
  for(i=0;i<10;i++)
  {
    del(s-i);
    cout<<"After "<<i+1<< " deletion:"<<endl;
    display();
  }
 

  return 0;
}