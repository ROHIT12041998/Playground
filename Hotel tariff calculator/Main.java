#include<iostream>
using namespace std;
int main()
{
  int m,rent,d,t;
  cin>>m>>rent>>d;
  if(m>=1 && m<=12)
  {
  	if((m>=4 && m<=6)||(m>=11 && m<=12))
  	{
    	rent=rent + (0.2*rent);
    	t=rent*d;
  		cout<<t;
  	}
  	else
  	{
    	t=rent*d;
  		cout<<t;
  	}
  }
  else
  {
    cout<<"Invalid Input";
  }
    
}