#include<iostream>
using namespace std;
int queue[100];
int front=-1;
int rear=-1;
void insert(int ele,int n)
{
  if(rear==n-1)
  {
    cout<<"Queue is full"<<endl;
  }
  else if(front==-1 && rear == -1)
  {
    front++;
    rear++;
    queue[rear]=ele;
  }
  else
  {
    rear++;
    queue[rear]=ele;
  }
}
void sort(int n)
{
  for(int i=0;i<n;i++)
  {
    if(queue[i+1]>queue[i])
    {
      int temp=queue[i];
      queue[i]=queue[i+1];
      queue[i+1]=temp;
    }
  }
}
void display(int n)
{
  int i;
    if(front == - 1 &&  rear == -1)
    {
    cout<<"\nQueue is Empty\n";
    }
    cout<<"The priority queue elements are:"<<endl;
  for(int i=0;i<n;i++)
  {
    for (int j=1;j<n-i;j++)
      {
    if(queue[i]<queue[i+j])
    {
      
      int temp=queue[i];
      queue[i]=queue[i+j];
      queue[i+j]=temp;
      }
      
    }
    cout<<queue[i]<<" ";
  }
}

int main()
{
    int n,i,ele;
  cout<<"Enter the number of values to be inserted:"<<endl;
    cin>>n;
  cout<<"Enter the values to be inserted in priority queue:\n";
    for(i=0;i<n;i++)
    {
      
      cin>>ele;
      insert(ele,n);
    }
  	
    display(n);
    return 0;
}